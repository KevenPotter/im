package cn.kevenpotter.im.im.client.handler;

import cn.kevenpotter.im.im.protocol.response.CreateGroupResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class CreateGroupResponseHandler extends SimpleChannelInboundHandler<CreateGroupResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, CreateGroupResponsePacket msg) throws Exception {
        System.out.println("群创建成功,id 为[" + msg.getGroupId() + "], ");
        System.out.println("群里面有: " + msg.getUserNameList());
    }
}
