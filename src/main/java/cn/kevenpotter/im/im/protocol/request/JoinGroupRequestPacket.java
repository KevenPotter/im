package cn.kevenpotter.im.im.protocol.request;

import cn.kevenpotter.im.im.protocol.Packet;
import lombok.Data;

import static cn.kevenpotter.im.im.protocol.command.Command.JOIN_GROUP_REQUEST;

@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {
        return JOIN_GROUP_REQUEST;
    }
}
