package cn.kevenpotter.im.third.protocol.request;

import cn.kevenpotter.im.third.protocol.Packet;
import lombok.Data;

import static cn.kevenpotter.im.third.protocol.command.Command.MESSAGE_REQUEST;

@Data
public class MessageRequestPacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
