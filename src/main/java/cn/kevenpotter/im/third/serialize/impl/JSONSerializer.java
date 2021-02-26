package cn.kevenpotter.im.third.serialize.impl;

import cn.kevenpotter.im.second.SerializerAlogrithm;
import cn.kevenpotter.im.third.serialize.Serializer;
import com.alibaba.fastjson.JSON;

public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlogrithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
