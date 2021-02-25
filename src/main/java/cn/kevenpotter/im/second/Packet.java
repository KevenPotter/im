package cn.kevenpotter.im.second;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public abstract class Packet {

    /*协议版本*/
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;

    /**
     * 指令
     */
    public abstract Byte getCommand();
}
