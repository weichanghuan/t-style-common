package com.tstyle.enums.web;

/**
 * @description:操作类请求枚举类
 * @author weichanghuan
 */
public enum ActionTypeEnum {

    QUERY_ROLELIST("query_rolelist");

    private String value;

    private ActionTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * getActionTyeEnum:actionType获取对应的枚举类型
     * 
     * @param value
     * @return
     * @author jiong.peng
     * @date 2017年8月4日 下午1:25:01
     */
    public static ActionTypeEnum getActionTyeEnum(String value) {
        for (ActionTypeEnum actionType : ActionTypeEnum.values()) {
            if (actionType.getValue().equals(value)) {
                return actionType;
            }
        }
        return null;
    }
}
