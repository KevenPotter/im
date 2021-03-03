package cn.kevenpotter.im.im.protocol.request;

import cn.kevenpotter.im.im.protocol.Packet;
import lombok.Data;

import static cn.kevenpotter.im.im.protocol.command.Command.LOGOUT_REQUEST;

@Data
public class LogoutRequestPacket extends Packet {

    @Override
    public Byte getCommand() {
        return LOGOUT_REQUEST;
    }
}
