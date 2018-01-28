package com.tstyle.enums.web;

/**
 * @description:功能代码枚举类
 * @author weichanghuan
 */
public enum FunctionCodeEnum {
    /**
     * 登录
     */
    LOGIN("F_LOGIN");

    private String value;

    private FunctionCodeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
