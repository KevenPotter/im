package cn.kevenpotter.im.third.protocol.response;

import cn.kevenpotter.im.third.protocol.Packet;
import lombok.Data;

import static cn.kevenpotter.im.third.protocol.command.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends Packet {

    private boolean success;
    private String reason;

    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
