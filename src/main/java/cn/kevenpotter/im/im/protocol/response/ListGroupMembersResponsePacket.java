package cn.kevenpotter.im.im.protocol.response;

import cn.kevenpotter.im.im.protocol.Packet;
import cn.kevenpotter.im.im.session.Session;
import lombok.Data;

import java.util.List;

import static cn.kevenpotter.im.im.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;
    private List<Session> sessionList;

    @Override
    public Byte getCommand() {
        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}
