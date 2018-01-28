package com.tstyle.enums.web;

/**
 * @description:操作类请求枚举类
 * @author weichanghuan
 */
public enum ActionTypeEnum {
    /**
     * 查询产品列表
     */
    QUERY_PRODUCT_LIST("query_product_list"),

    /**
     * 查询申请产品信息
     */
    QUERY_PRODUCT_APPLY_LIST("query_product_apply_list"),

    /**
     * 加载编辑产品页面
     */
    EDIT_PRODUCT_PAGE("edit_product_page"),

    /**
     * 新增产品
     */
    ADD_NEW_PRODUCT("add_new_product"),

    /**
     * 查询账户列表
     */
    QUERY_ACCOUNT_LIST("query_account_list"),

    /**
     * 查询账户申请信息列表
     */
    QUERY_ACCOUNT_APPLY_LIST("query_account_apply_list"),

    /**
     * 新增账户页面
     */
    ADD_ACCOUNT_PAGE("add_account_page"),

    /**
     * 查询产品详细信息
     */
    QUERY_PRODUCT_DTL("query_product_dtl"),

    /**
     * 新增账户信息
     */
    ADD_NEW_ACCOUNT("add_new_account"),

    /**
     * 查询基金信息列表
     */
    QUERY_FUND_INFO_LIST("query_fund_info_list"),

    /**
     * 添加自选基金
     */
    ADD_OPTIONAL_FUND("add_optional_fund"),

    /**
     * 取消自选基金
     */
    CANCEL_OPTIONAL_FUND("cancel_optional_fund"),

    /**
     * 修改申请产品记录
     */
    EDIT_APPLY_PRODUCT("edit_apply_product"),

    /**
     * 修改申请产品记录页面
     */
    EDIT_APPLY_PRODUCT_PAGE("edit_apply_product_page"),

    /**
     * 查询申请产品详细
     */
    QUERY_PRODUCT_APPLY_DTL("query_product_apply_dtl"),

    /**
     * 加载买基金页面
     */
    LOAD_BUY_FUND_PAGE("load_buy_fund_page"),

    /**
     * 查询待提交的购买记录
     */
    QUERY_PENDING_BUY_RECORD("query_pending_buy_record"),

    /**
     * 取消购买
     */
    CANCEL_BUY_APP_RECORD("cancel_buy_app_record"),

    /**
     * 保存购买申请记录
     */
    SAVE_BUY_APP_RECORD("save_buy_app_record"),

    /**
     * 查询基金信息
     */
    QUERY_FUND_INFO("query_fund_info"),

    /**
     * 提交购买申请记录
     */
    SUBMIT_BUY_APP_RECORD("submit_buy_app_record"),

    /**
     * 动态查询结算人信息
     */
    QUERY_CLEARING_ACCT_INFO_LIST("query_clearing_acct_info_list"),

    /**
     * 添加结算 人信息
     */
    ADD_CLEARING_ACCT_INFO("add_clearing_acct_info"),

    /**
     * 修改 结算人信息
     */
    EDIT_CLEARING_ACCT_INFO("edit_clearing_acct_info"),

    /**
     * 删除 结算人信息
     */
    REMOVE_CLEARING_ACCT_INFO("remove_clearing_acct_info"),

    /**
     * 动态查询基金结算人信息
     */
    QUERY_CLEARING_FUND_INFO_LIST("query_clearing_fund_info_list"),

    /**
     * 查询ta
     */
    QUERY_TA_LIST("query_ta_list"),

    /***
     * 查询交易复核数据(待复核)
     */
    QUERY_TRADE_UNCHECK_DATA("query_trade_uncheck_data"),

    /***
     * 查询交易复核数据(已复核)
     */
    QUERY_TRADE_CHECKED_DATA("query_trade_checked_data"),

    /***
     * 查询交易复核数据(废单)
     */
    QUERY_TRADE_DISABLED_DATA("query_trade_disabled_data"),

    /***
     * 查询交易复核数据(撤单)
     */
    QUERY_CANCEL_TRADE_DATA("query_cancel_trade_data"),

    /**
     * 文件上传
     */
    FILE_UPLOAD("fileUpload"),

    /***
     * 交易复核跳转
     */
    QUERY_TRADE_CHECK_LIST("trade_check_list"),

    /***
     * 待审核交易查询
     */
    UN_QUERY_TRADE_LIST("trade_uncheck_list"),

    /**
     * 交易申请
     */
    QUERY_TRADE_LIST("query_trade_list"),

    /***
     * 已复核交易查询
     */
    QUERY_CHECKED_TRADE_LIST("trade_checked_list"),

    /***
     * 废单
     */
    QUERY_DISABLED_TRADE_LIST("trade_disabled_list"),

    /***
     * 交易撤单
     */
    QUERY_CANCEL_TRADE_LIST("trade_cancel_list"),

    /***
     * 交易复核
     */
    TRADE_CHECK_PROCESS("trade_check_process"),

    /***
     * 交易撤单
     */
    TRADE_CANCEL_PROCESS("trade_cancel_process"),

    /**
     * 根据结算人代码查询结算人名称
     */
    Query_CLEARING_ACCT_ALIAS("query_clearing_acct_alias"),

    /**
     * 加载赎回页面
     */
    LOAD_REDEEM_FUND_PAGE("load_redeem_fund_page"),

    /**
     * 产品详情查询页面
     */
    QUERY_PRODUCT_DTL_PAGE("query_product_dtl_page"),

    /**
     * 申请产品详情查询页面
     */
    QUERY_PRODUCT_APPLY_DTL_PAGE("query_product_apply_dtl_page"),

    /**
     * 新增基金结算人
     */
    ADD_CLEARING_FUND_INFO("add_clearing_fund_info"),

    /**
     * 修改基金结算人
     */
    EDIT_CLEARING_FUND_INFO("edit_clearing_fund_info"),

    /**
     * 删除基金结算人
     */
    REMOVE_CLEARING_FUND_INFO("remove_clearing_fund_info"),

    /**
     * 查询交易申请记录列表
     */
    QUERY_TRADE_APP_REC_LIST("query_trade_app_rec_list"),

    /**
     * 查询交易申请信息
     */
    QUERY_TRADE_APP_REC_INFO("query_trade_app_rec_info"),

    /**
     * 存量账户导入页面
     */
    ADD_ACCOUNT_IMPORT_PAGE("add_account_import_page"),

    /**
     * 存量账户导入-信息提交
     */
    ADD_USED_ACCOUNT("add_used_account"),

    /**
     * 存量账户导入-信息提交
     */
    DELETE_PRODUCT_APPLY_DATA("delete_product_apply_data"),

    /**
     * 查询交易 确认记录列表查询
     */
    QUERY_TRADE_ACK_FILE_REC_LIST("query_trade_ack_file_rec_list"),

    /**
     * 查询银行
     */
    QUERY_BANK("query_bank"),

    /**
     * 查询省份
     */
    QUERY_PROVINCE("query_province"),

    /**
     * 查询城市
     */
    QUERY_CITY("query_city"),

    /**
     * 查询待提交的赎回申请记录
     */
    QUERY_PENDING_REDEEM_RECORD("query_pending_redeem_record"),

    /**
     * 查询可赎回基金列表
     */
    QUERY_AVAILABLE_REDEEM_FUND_LIST("query_available_redeem_fund_list"),

    /**
     * 保存赎回申请记录
     */
    SAVE_REDEEM_APP_RECORD("save_redeem_app_record"),

    /**
     * 取消赎回
     */
    CANCEL_REDEEM_APP_RECORD("cancel_redeem_app_record"),

    /**
     * 提交赎回申请记录
     */
    SUBMIT_REDEEM_APP_RECORD("submit_redeem_app_record"),

    /**
     * 对销售代码和销售名称模糊查询
     */
    QUERY_LIKE_DISTRIBUTOR("query_like_distributor"),

    /**
     * 查询银行
     */
    QUERY_BANK_INFO("query_bank_info"),

    /**
     * 查询省份
     */
    QUERY_PROVINCE_INFO("query_province_info"),

    /**
     * 查询城市
     */
    QUERY_CITY_INFO("query_city_info"),

    /**
     * 对基金代码和名称进行模糊
     */
    QUERY_LIKE_FUNDNAMEANDCODE("query_like_fundnameandcode"),

    /**
     * 对产品代码和名称模糊
     */
    QUERY_LIKE_PRODUCTNAMEANDCODE("query_like_productnameandcode"),

    /**
     * 查询可转换基金列表
     */
    QUERY_CONVERTIBLE_FUND_LIST("query_convertible_fund_list"),

    /**
     * 加载基金转换页面
     */
    LOAD_FUND_TRANSFER_PAGE("load_fund_transfer_page"),

    /**
     * 保存基金转换申请记录
     */
    SAVE_FUND_TRANSFER_APP_RECORD("save_fund_transfer_app_record"),

    /**
     * 对基金结算人的基金的名称和代码模糊查询
     */
    QUERY_LIKE_FUNDNAMEANDCODEBYCLEARINGFUND("query_like_fundnameandcodebyclearingfund"),

    /**
     * 对结算人名称和代码模糊
     */
    QUERY_LIKE_CLEARINGACCTNAMEANDCODE("query_like_clearingacctnameandcode"),

    /**
     * 加载修改分红方式页面
     */
    LOAD__BONUS_SETTING_PAGE("load_bonus_setting_page"),

    /**
     * 分红设置基金列表
     */
    QUERY_BOUNS_SETTING_FUND_LIST("query_bouns_setting_fund_list"),

    /**
     * 保存分红设置申请记录
     */
    SAVE_BOUNS_SETTING_APP_RECORD("save_bouns_setting_app_record"),

    /**
     * 验证结算人代码和基金结算人是否有关联
     */
    CHECK_CLEARINGACCTANDFUND("check_clearingacctandfund"),

    /**
     * 根据产品代码或者名称查询 资产持仓
     */
    QUERY_ORGHOLDVOLLISTBYPRODUCTNAMEORCODE("query_orgholdvollistbyproductnameorcode"),

    /**
     * 根据基金代码或者名称查询机构持仓明细信息
     */
    QUERY_ORGHOLDVOLDETAILLISTBYFUNDNAMEORCODE("query_orgholdvoldetaillistbyfundnameorcode"),

    /**
     * 详情页面跳转
     */
    ORG_HOLD_VOL_DETAIL_INFO_PAGE("org_hold_vol_detail_info_page"),

    /**
     * 提交登录申请
     */
    SUBMIT_LOGIN_APP("submit_login_app"),

    /**
     * 结算人维护
     */
    CLEARING_ACCT_INFO("clearing_acct_info"),

    /**
     * 基金结算人维护
     */
    CLEARING_FUND_ACCT("clearing_fund_acct"),

    /**
     * 新增结算人
     */
    CLEARING_ACCT_INFO_ADD("clearing_acct_info_add"),

    /**
     * 新增基金结算人
     */
    CLEARING_FUND_ACCT_ADD("clearing_fund_acct_add"),

    /**
     * 交易查询
     */
    TRADE_APP_REC_LIST("trade_app_rec_list"),

    /**
     * 交易查询
     */
    TRADE_QUERY_REC("trade_query_rec"),

    /**
     * 交易确认
     */
    TRADE_ACK_REC_LIST("trade_ack_rec_list"),

    /**
     * 资产持仓
     */
    ORG_HOLD_VOL_INFO("org_hold_vol_info"),

    /**
     * 持仓详情
     */
    ORG_HOLD_VOL_DETAIL_INFO("org_hold_vol_detail_info"),

    /**
     * 查询角色功能信息
     */
    QUERY_ROLEANDFUNCTIONLIST("query_roleandfunctionlist"),

    /**
     * 删除角色信息
     */
    DELETE_ROLEINFO("delete_roleinfo"),

    /**
     * 分级查询功能
     */
    QUERY_FUNCTIONINFOLIST("query_functioninfolist"),

    /**
     * 通过角色代码查询功能列表
     */
    QUERY_FUNCTIONBYROLECODE("query_functionbyrolecode"),

    /**
     * 修改角色所对应权限
     */
    EDIT_ROLETOFUNCTION("edit_roletofunction"),

    /**
     * 查询销售通道
     */
    QUERY_DISTRIBUTOR_CHANNEL("query_distributor_channel"),

    /**
     * 账户详情
     */
    QUERY_ACCOUNT_DETAIL("query_account_detail"),

    /**
     * 查询账户申请详情
     */
    QUERY_ACCOUNT_APPLY_DETAIL("query_account_apply_detail"),

    /**
     * 添加角色已经对应权限
     */
    ADD_ROLETOFUNCTION("add_roletofunction"),

    /**
     * 操作员信息和角色
     */
    QUERY_OPERATORROLELIST("query_operatorrolelist"),

    /**
     * 修改操作员状态
     */
    EDIT_OPERATORSTATUS("edit_operatorstatus"),

    /**
     * 重置被操作的操作员密码
     */
    EDIT_OPERATORRESETPASSWORD("edit_operatorrestpassword"),

    /**
     * 新增 操作员信息
     */
    ADD_OPERATORINFO("add_operatorinfo"),

    /**
     * 交易下单导入指令业务 handler处理类型 文件上传和解析 add by libin date 2017-07-21
     */
    FILE_UPLOAD_AND_PARSING("file_upload_and_parsing"),

    /**
     * 交易下单导入指令业务 handler处理类型 跳转查询交易指令页面 add by libin date 2017-08-01
     */
    QUERY_TRADE_INSTRUCTION_INDEX("query_trade_instruction_index"),

    /**
     * 交易下单导入指令业务 handler处理类型 查询交易指令 add by libin date 2017-07-21
     */
    QUERY_TRADE_INSTRUCTION("query_trade_instruction"),

    /**
     * 交易下单导入指令业务 handler处理类型 导入指令和解析 add by libin date 2017-07-21
     */
    IMPORT_INSTRUCTION_AND_PARSING("import_instruction_and_parsing"),

    /**
     * 交易下单导入指令业务 handler处理类型 跳转查询交易指令详情页面 add by libin date 2017-07-21
     */
    QUERY_TRADE_INSTRUCTION_DETAIL_INDEX("query_trade_instruction_detail_index"),

    /**
     * 交易下单导入指令业务 handler处理类型 查询交易指令详情 add by libin date 2017-07-21
     */
    QUERY_TRADE_INSTRUCTION_DETAIL("query_trade_instruction_detail"),

    /**
     * 交易下单导入指令业务 handler处理类型 删除交易指令 add by libin date 2017-07-21
     */
    DELETE_TRADE_INSTRUCTION("delete_trade_instruction"),

    /**
     * 交易下单导入指令业务 handler处理类型 提交交易指令 add by libin date 2017-07-21
     */
    SUBMIT_TRADE_INSTRUCTION("submit_trade_instruction"),

    /**
     * 根据操作员账号查询产品信息
     */
    QUERY_OPERATORTOPRODUCT("query_operatortoproduct"),

    /**
     * 修改操作员信息
     */
    EDIT_OPERATORINFO("edit_operatorinfo"),

    /**
     * 查询可用产品列表
     */
    QUERY_AVAILABLE_PRODUCT_LIST("query_available_product_list"),

    /**
     * 导出权限表
     */
    EXPORT_ROLETOFUNCTION_LIST("export_roletofunction_list"),

    /**
     * 角色信息
     */
    ROLE_INFO("role_info"),

    /**
     * 操作员信息
     */
    OPERATOR_INFO("operator_info"),

    /**
     * 产品列表
     */
    PRODUCT_LIST("product_list"),

    /**
     * 产品申请列表
     */
    PRODUCT_LIST_APPLY("product_list_apply"),

    /**
     * 账户列表
     */
    ACCOUNT_LIST("account_list"),

    /**
     * 账户申请列表
     */
    ACCOUNT_LIST_APPLY("account_list_apply"),

    /**
     * 产品新增页面
     */
    PRODUCT_ADD("product_add"),

    /**
     * 交易服务协议-好买
     */
    TRADE_SERVICE_AGREEMENT_HOWBUY("trade_service_agreement_howbuy"),

    /**
     * 交易下单
     */
    TRADE_ORDER_INDEX("trade_order_index"),

    /**
     * 首页
     */
    INDEX("index"),

    /**
     * 欢迎
     */
    WELCOME("welcome"),

    /**
     * 基金产品列表
     */
    FUNDINFO_LIST("fundinfo_list"),

    /**
     * 登录
     */
    LOGIN("login"),

    /**
     * 修改密码
     */
    EDIT_OPERATORPWD_BYOPERATOR("edit_operatorpwd_byoperator"),

    /**
     * 查询所有产品信息
     */
    QUERY_ALLPRODUCT_FORFUNCTION("query_allproduct_forfunction"),

    /**
     * 修改操作人密码 handler处理类型 add by libin date 2017-08-07
     */
    EDIT_OPERATOR_PWD("edit_operator_pwd"),

    /**
     * 首页根据角色代码查询操作员
     */
    QUERY_OPERATORROLE_FORFIRSTPAGE("query_operatorrole_forfirstpage"),

    /**
     * 查询所有角色信息
     */
    QUERY_ALLROLEINFO("query_allroleinfo"),

    /**
     * 查询所有功能（首页）
     */
    QUERY_FUNCTIONINFOLIST_FORFIRSTPAGE("query_functioninfolist_forfirstpage"),

    /**
     * 根据操作员查询产品（首页）
     */
    QUERY_OPERATORTOPRODUCT_FORFIRSTPAGE("query_operatortoproduct_forfirstpage"),

    /**
     * 根据操作员查询操作员信息，操作员所对应的产品信息，
     */
    QUERY_PROANDROLE_FORFIRSTPAGE("query_proandrole_forfirstpage"),

    /**
     * 操作员页面角色，产品，功能查询
     */
    QUERY_COMMON_FOROPERATOR("query_common_foroperator"),

    /**
     * 操作员页面修改回显
     */
    QUERY_INITEDITOPERATOR("query_initeditoperator");

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
