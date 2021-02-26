package cn.kevenpotter.im.third.protocol.request;

import cn.kevenpotter.im.third.protocol.Packet;
import lombok.Data;

import static cn.kevenpotter.im.third.protocol.command.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet {

    private String userId;
    private String username;
    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
