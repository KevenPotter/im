package cn.kevenpotter.im.im.protocol.response;

import cn.kevenpotter.im.im.protocol.Packet;

import static cn.kevenpotter.im.im.protocol.command.Command.QUIT_GROUP_RESPONSE;

public class QuitGroupResponsePacket extends Packet {

    private String groupId;
    private boolean success;
    private String reason;

    @Override
    public Byte getCommand() {
        return QUIT_GROUP_RESPONSE;
    }
}
