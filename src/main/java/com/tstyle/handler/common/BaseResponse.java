package com.tstyle.handler.common;

import com.tstyle.enums.ReturnCodeEnum;

/**
 * 基础响应服务类
 * 
 * @author weichanghuan
 *
 */
public class BaseResponse {
    /**
     * 请求流水号
     */
    private long requestId;
    /**
     * 服务代码
     */
    private String serviceCode;

    /**
     * 返回代码
     */
    private String returnCode = ReturnCodeEnum.SUCCESS.getCode();
    /**
     * 返回描述
     */
    private String returnDesc = ReturnCodeEnum.SUCCESS.getDesc();

    public final long getRequestId() {
        return requestId;
    }

    public final void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public final String getReturnCode() {
        return returnCode;
    }

    public final void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public final String getReturnDesc() {
        return returnDesc;
    }

    public final void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

}
