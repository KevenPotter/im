package cn.kevenpotter.im.second;

import lombok.Data;

import static cn.kevenpotter.im.second.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet {

    private Integer userId;
    private String username;
    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
