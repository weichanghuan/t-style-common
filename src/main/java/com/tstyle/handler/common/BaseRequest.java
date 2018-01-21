/**
 * 
 */
package com.tstyle.handler.common;

/**
 * 基础请求类
 * 
 * @author jiong.peng
 *
 */
public class BaseRequest {

    /**
     * 请求流水号
     */
    private long requestId;
    /**
     * 服务代码
     */
    private String serviceCode;
    /**
     * 申请日期 yyyyMMdd
     */
    private String appDt;
    /**
     * 申请时间 HHmmss
     */
    private String appTm;
    /**
     * 终端IP
     */
    private String terminalIp;
    /**
     * 操作员
     */
    private String operator;

    public final long getRequestId() {
        return requestId;
    }

    public final void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public final String getAppDt() {
        return appDt;
    }

    public final void setAppDt(String appDt) {
        this.appDt = appDt;
    }

    public final String getAppTm() {
        return appTm;
    }

    public final void setAppTm(String appTm) {
        this.appTm = appTm;
    }

    public final String getTerminalIp() {
        return terminalIp;
    }

    public final void setTerminalIp(String terminalIp) {
        this.terminalIp = terminalIp;
    }

    public final String getOperator() {
        return operator;
    }

    public final void setOperator(String operator) {
        this.operator = operator;
    }

}
