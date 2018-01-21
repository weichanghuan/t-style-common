/**
 * Copyright (c) 2017, ShangHai HOWBUY INVESTMENT MANAGEMENT Co., Ltd.
 * All right reserved.
 * <p>
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF HOWBUY INVESTMENT
 * MANAGEMENT CO., LTD.  THE CONTENTS OF THIS FILE MAY NOT BE DISCLOSED
 * TO THIRD PARTIES, COPIED OR DUPLICATED IN ANY FORM, IN WHOLE OR IN PART,
 * WITHOUT THE PRIOR WRITTEN PERMISSION OF HOWBUY INVESTMENT MANAGEMENT
 * CO., LTD.
 */

package com.tstyle.enums;

/**
 * @description:返回错误码定义枚举
 * @reason:TODO ADD REASON(可选)
 * @author jiong.peng
 * @date 2017年5月16日 上午9:55:51
 * @since JDK 1.6
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
