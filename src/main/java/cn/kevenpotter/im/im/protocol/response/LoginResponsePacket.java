package cn.kevenpotter.im.im.protocol.response;

import cn.kevenpotter.im.im.protocol.Packet;
import lombok.Data;

import static cn.kevenpotter.im.im.protocol.command.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends Packet {

    private String userId;
    private String userName;
    private boolean success;
    private String reason;

    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
