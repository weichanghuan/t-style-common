package com.tstyle.enums;

/**
 * @description:返回错误码定义枚举
 * @author weichanghuan
 */
public enum ReturnCodeEnum {

    /**
     * 成功
     */
    SUCCESS("F0000000", "成功"),

    /**
     * 服务未开通
     */
    SERVICE_NOT_OPENED("F0000003", "服务未开通"),

    /**
     * 参数错误
     */
    PARAMETER_ERROR("F0000001", "参数错误"),

    /**
     * 系统异常
     */
    SYSTEM_EXCEPTION("F0000999", "系统异常"),
    /**
     * 失败
     */
    FAIL("F0009999", "失败");

    private String code;
    private String desc;

    private ReturnCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
