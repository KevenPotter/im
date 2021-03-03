package cn.kevenpotter.im.im.protocol.response;

import cn.kevenpotter.im.im.protocol.Packet;
import lombok.Data;

import static cn.kevenpotter.im.im.protocol.command.Command.JOIN_GROUP_RESPONSE;

@Data
public class JoinGroupResponsePacket extends Packet {

    private String groupId;
    private boolean success;
    private String reason;

    @Override
    public Byte getCommand() {
        return JOIN_GROUP_RESPONSE;
    }
}
