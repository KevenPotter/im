package cn.kevenpotter.im.im.attribute;

import cn.kevenpotter.im.im.session.Session;
import io.netty.util.AttributeKey;

public interface Attributes {

    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
