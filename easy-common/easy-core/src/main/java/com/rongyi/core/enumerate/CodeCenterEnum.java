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
    ERROR_INVALID_CODE(1021305, "code不合法或无效"),
    ERROR_INVALID_MALLID(1021306, "mallId不合法或无效"),
    ERROR_INVALID_COUNT(1021307, "count不合法或无效"),
    ERROR_UNLOGIN(1021309, "请重新登录！"),
    ERROR_INVALID_IDENTITY(1021310, "只有商场才能验证礼品码！"),
    ERROR_VALIDCODE_ERROR_MALL(1021320, "该商场下无法验证该券！"),
    ERROR_VALIDCODE_ERROR_SHOP(1021321, "该店铺下无法验证该券！"),
    ERROR_VALIDCODE_GENERAL_IDENTITY(1021322, "当前用户无法验证通用券！"),
    ERROR_VALIDCODE_GENERAL_MALLID(1021323, "无法获取mallId！"),
    ERROR_VALIDCODE_UNGENERAL_IDENTITY(1021324, "当前用户无法验证非通用券！"),
    ERROR_VALIDCODE_UNGENERAL_SHOPID(1021325, "无法获取shopId！"),
    ERROR_VALIDCODE_INVALID_COUPON(1021326, "券的数据存在问题！"),
    ERROR_VALIDCODE_INVALID_COUPONCODE(1021327, "券码不正确！"),
    ERROR_VALIDCODE_INVALID_COUPONTYPE(1021328, "无法验证该类型的券！"),
    ERROR_VALIDCODE_INVALID_USERCOUPON(1021329, "该券还未被领取，无法验证！"),
    ERROR_VALIDCODE_INVALID_UNEXIST_COUPON(1021330, "该券不存在！"),
    ERROR_VALIDCODE_INVALID_THRID_COUPON(1021331, "第三方券无法验证！"),
    ERROR_VALIDCODE_INVALID_MODE(1021332, "验证方式错误！"),








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
