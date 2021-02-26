package cn.kevenpotter.im.third.protocol.response;

import cn.kevenpotter.im.third.protocol.Packet;
import lombok.Data;

import static cn.kevenpotter.im.third.protocol.command.Command.MESSAGE_RESPONSE;

@Data
public class MessageResponsePacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_RESPONSE;
    }
}
