package cn.kevenpotter.im.third.protocol;

import cn.kevenpotter.im.third.protocol.request.LoginRequestPacket;
import cn.kevenpotter.im.third.protocol.request.MessageRequestPacket;
import cn.kevenpotter.im.third.protocol.response.LoginResponsePacket;
import cn.kevenpotter.im.third.protocol.response.MessageResponsePacket;
import cn.kevenpotter.im.third.serialize.Serializer;
import cn.kevenpotter.im.third.serialize.impl.JSONSerializer;

import java.util.HashMap;
import java.util.Map;

import static cn.kevenpotter.im.third.protocol.command.Command.*;

public class PacketCodeC {

    private static final int MAGIC_NUMBER = 0x12345678;
    private final Map<Byte, Class<? extends Packet>> packetTypeMap;
    private final Map<Byte, Serializer> serializerMap;

    public static final PacketCodeC INSTANCE = new PacketCodeC();

    private PacketCodeC() {
        packetTypeMap = new HashMap<>();
        packetTypeMap.put(LOGIN_REQUEST, LoginRequestPacket.class);
        packetTypeMap.put(LOGIN_RESPONSE, LoginResponsePacket.class);
        packetTypeMap.put(MESSAGE_REQUEST, MessageRequestPacket.class);
        packetTypeMap.put(MESSAGE_RESPONSE, MessageResponsePacket.class);

        serializerMap = new HashMap<>();
        Serializer serializer = new JSONSerializer();
        serializerMap.put(serializer.getSerializerAlgorithm(), serializer);
    }
}
