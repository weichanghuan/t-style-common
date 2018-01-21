/**
s *Copyright (c) 2017, ShangHai HOWBUY INVESTMENT MANAGEMENT Co., Ltd.
 *All right reserved.
 *
 *THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF HOWBUY INVESTMENT
 *MANAGEMENT CO., LTD.  THE CONTENTS OF THIS FILE MAY NOT BE DISCLOSED
 *TO THIRD PARTIES, COPIED OR DUPLICATED IN ANY FORM, IN WHOLE OR IN PART,
 *WITHOUT THE PRIOR WRITTEN PERMISSION OF HOWBUY INVESTMENT MANAGEMENT
 * CO., LTD.
*/

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
