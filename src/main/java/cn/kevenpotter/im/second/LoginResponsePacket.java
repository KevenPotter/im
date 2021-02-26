package cn.kevenpotter.im.second;

import lombok.Data;

import static cn.kevenpotter.im.second.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends Packet {

    private boolean success;
    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
