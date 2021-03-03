package cn.kevenpotter.im.im.protocol.response;

import cn.kevenpotter.im.im.protocol.Packet;

import static cn.kevenpotter.im.im.protocol.command.Command.LOGOUT_RESPONSE;

public class LogoutResponsePacket extends Packet {

    private boolean success;
    private String reason;

    @Override
    public Byte getCommand() {
        return LOGOUT_RESPONSE;
    }
}
