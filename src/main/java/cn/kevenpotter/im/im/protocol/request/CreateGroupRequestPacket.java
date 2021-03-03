package cn.kevenpotter.im.im.protocol.request;

import cn.kevenpotter.im.im.protocol.Packet;
import lombok.Data;

import java.util.List;

import static cn.kevenpotter.im.im.protocol.command.Command.CREATE_GROUP_REQUEST;

@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {
        return CREATE_GROUP_REQUEST;
    }
}
