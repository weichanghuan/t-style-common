package com.tstyle.enums;

/**
 * @description:接口服务代码定义
 * @author weichanghuan
 * @since JDK 1.8
 */
public enum ServiceCodeEnum {

    /**
     * 查询机构信息
     */
    QUERY_ROLE_INFO("F610001");

    private String value;

    private ServiceCodeEnum(String value) {

        this.value = value;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
