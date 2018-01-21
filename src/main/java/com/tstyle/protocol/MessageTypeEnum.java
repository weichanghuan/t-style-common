/**
 * 
 */
package com.tstyle.protocol;

/**
 * 消息类型
 * 
 * @author weichanghuan
 *
 */
public enum MessageTypeEnum {

    BUSSINESS_REQ((byte) 0, "业务请求"), 
    BUSSINESS_RESP((byte) 1, "业务响应"), 
    BUSSINESS_ONE_WAY((byte) 2, "既是业务请求又是业务响应"), 
    HANDSHAKE_AUTHZ_REQ((byte) 3,"握手认证请求"),
    HANDSHAKE_AUTHZ_RESP((byte) 4, "握手认证响应"), 
    HEARTBEAT_REQ((byte) 5, "心跳请求"), 
    HEARTBEAT_RESP((byte) 6, "心跳请求");

    private byte type;

    private String desc;

    MessageTypeEnum(byte type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public final byte getType() {
        return type;
    }

    public final void setType(byte type) {
        this.type = type;
    }

    public final String getDesc() {
        return desc;
    }

    public final void setDesc(String desc) {
        this.desc = desc;
    }

}
