package com.rongyi.core.enumerate;

/**
 * Description:卡券 错误码
 * 1 表示透传错误码 02 营销中心 01 消息中心  10201XX
 *                              12 微信接口
 * Author: 袁波
 * DATE: 2016/3/10 11:23
 * Package:com.rongyi.core.enumerate
 * Project:easy-market
 */
public enum  CouponEnum {
    SUCCESS(0, "正常"),
    ERROR_SYSTEM(1020101, "系统故障"),
    ERROR_PARAM(1020120, "必要参数不合法或无效"),
    ERROR_SHOP_ID(1020121, "shopId不合法或无效"),
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
    ERROR_NAME_SENSITIVE_WORD(1020140, "卡券名称存在敏感词"),
    ERROR_USE_LIMIT_SENSITIVE_WORD(1020141, "卡券使用限制存在敏感词"),
    ERROR_USE_DES_SENSITIVE_WORD(1020142, "卡券使用说明存在敏感词"),

    ERROR_NULL_PARAM(1021200,"参数为空！"),
    ERROR_INVALID_CURRENTPAGE(1021201,"当前页参数不正确！"),
    ERROR_INVALID_PAGESIZE(1021202,"每一页大小参数不正确！"),
    ERROR_INVALID_PAGE_PARAM(1021203,"页码和每一页大小必须为整数"),
    ERROR_INVALID_USER(1021204,"用户不正确！"),
    ERROR_INVALID_MOBILE(1021205,"buyerMobile 参数不能为空！"),;



    private int code;
    private String message;

    private CouponEnum(int code, String message) {
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
