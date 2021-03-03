package cn.kevenpotter.im.im.client.handler;

import cn.kevenpotter.im.im.protocol.response.GroupMessageResponsePacket;
import cn.kevenpotter.im.im.session.Session;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class GroupMessageResponseHandler extends SimpleChannelInboundHandler<GroupMessageResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GroupMessageResponsePacket msg) throws Exception {
        String fromGroupId = msg.getFromGroupId();
        Session fromUser = msg.getFromUser();
        System.out.println("收到群[" + fromGroupId + "]中[" + fromUser + "]发来的消息: " + msg.getMessage());
    }
}
