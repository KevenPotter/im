package cn.kevenpotter.im.nettyIO;


import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NettyClient {

    private static final int MAX_RETRY = 5;

    public static void main(String[] args) throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap();
        NioEventLoopGroup group = new NioEventLoopGroup();
        bootstrap
                .group(group)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<Channel>() {
                    @Override
                    protected void initChannel(Channel channel) throws Exception {
                        channel.pipeline().addLast(new StringEncoder());
                    }
                });
        Channel channel = connect(bootstrap, "127.0.0.1", 1000, MAX_RETRY).channel();
        while (true) {
            channel.writeAndFlush(new Date() + ": Hello World");
            Thread.sleep(2000);
        }
    }

    private static ChannelFuture connect(Bootstrap bootstrap, String host, int port, int retry) {
        return bootstrap.connect(host, port).addListener(new GenericFutureListener<Future<? super Void>>() {
            @Override
            public void operationComplete(Future<? super Void> future) throws Exception {
                if (future.isSuccess()) {
                    System.out.println("连接成功！");
                } else if (retry == 0) {
                    System.err.println("重试次数已用完，放弃链接！");
                } else {
                    int order = (MAX_RETRY - retry) + 1; // 第几次重连
                    int delay = 1 << order; // 本次重连的间隔
                    System.out.println(new Date() + ": 连接失败, 第" + order + "次重连......");
                    bootstrap.config().group().schedule(() -> {
                        connect(bootstrap, host, port, retry - 1);
                    }, delay, TimeUnit.SECONDS);
                }
            }
        });
    }
}
