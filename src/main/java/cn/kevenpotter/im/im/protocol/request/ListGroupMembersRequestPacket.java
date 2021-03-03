package cn.kevenpotter.im.im.protocol.request;

import cn.kevenpotter.im.im.protocol.Packet;
import lombok.Data;

import static cn.kevenpotter.im.im.protocol.command.Command.LIST_GROUP_MEMBERS_REQUEST;

@Data
public class ListGroupMembersRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {
        return LIST_GROUP_MEMBERS_REQUEST;
    }
}
