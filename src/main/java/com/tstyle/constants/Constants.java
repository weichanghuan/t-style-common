package com.tstyle.constants;

/**
 * @description:OTC netty protocol 常量定义类
 * @author weichanghuan
 * @since JDK 1.8
 */
public final class Constants {

    public final static int HEAD_DATA = 0x76;// 118
    public final static String CHARSET = "utf-8";// 全局项目设定

    /**
     * 心跳超时时间
     */
    public static final int TIMEOUT = 5000;

    /**
     * 同步发送超时时间
     */
    public static final int SYNTIMEOUT = 5000;

}
