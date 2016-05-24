package com.rongyi.core.enumerate;

/**
 * Description:卡券 错误码
 * 1 表示透传错误码 02 营销中心 13 消息中心  10213XX
 *
 * Author: 袁波
 * DATE: 2016/3/10 11:23
 * Package:com.rongyi.core.enumerate
 * Project:easy-market
 */
public enum CodeCenterEnum {
    SUCCESS(0, "正常"),
    ERROR_SYSTEM(1021301, "系统故障"),
    ERROR_PARAM(1021302, "必要参数不合法或无效"),
    ERROR_INVALID_ACTIVITY_ID(1021303, "activityId不合法或无效"),
    ERROR_INVALID_LENGTH(1021304, "length不合法或无效"),
    ERROR_INVALID_TYPE(1021304, "type不合法或无效"),

    ERROR_SHOP_ID(1020131, "shopId不合法或无效"),
    ERROR_ACTIVITY_ID(1020122, "activityId不合法或无效"),
    ERROR_STOCK_COUNT(1020123, "总量不合法或无效"),
    ERROR_ORG_PRICE(1020124, "原价不合法或无效"),
    ERROR_CUR_PRICE(1020125, "现价不合法或无效"),
    ERROR_VALID_START_DATE(1020126, "有效期开始时间不合法或无效"),
    ERROR_VALID_END_DATE(1020127, "有效期结束时间不合法或无效"),
    ERROR_USE_LIMIT(1020128, "使用限制不合法或无效"),
    ERROR_USE_DES(1020129, "使用说明不合法或无效"),
    ERROR_DETAIL_IMG_LIST(1020130, "详情图不合法或无效"),
    ERROR_PUBLISH_START_DATE(1020131, "发布开始时间不合法或无效"),
    ERROR_PUBLISH_END_DATE(1020132, "发布结束时间不合法或无效"),
    ERROR_NAME(1020133, "名称不合法"),
    //摩店创建卡券敏感期验证
    ERROR_NAME_SENSITIVE_WORD(1020140, "卡券名称存在敏感词"),
    ERROR_USE_LIMIT_SENSITIVE_WORD(1020141, "卡券使用限制存在敏感词"),
    ERROR_USE_DES_SENSITIVE_WORD(1020142, "卡券使用说明存在敏感词"),


    VALID_COUPON_CODE_FAIL(1021229,"验券失败")






    ;



    private int code;
    private String message;

    private CodeCenterEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getActionCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorCode() {
        return String.valueOf(this.code);
    }

    public String getErrorMsg() {
        return this.message;
    }
}
