package com.rongyi.core.constant;

/**
 * 获取统一会员接口
 *
 * @author wangjh7
 * @date 2017-03-10
 **/
public enum UserCenterConstantEnum {
    // 获取统一会员接口
    ERROR_ORDER_USERCENTER_PARAM_ERROR("1015801", "统一会员参数异常"),
    ERROR_ORDER_USERCENTER_INFO_ERROR("1015802", "统一会员查询异常"),
    ERROR_ORDER_USERCENTER_DECREASE_ERROR("1015803", "统一会员积分扣减异常"),
    ERROR_ORDER_USERCENTER_INCREASE_ERROR("1015804", "统一会员积分返还异常"),
    ERROR_ORDER_USERCENTER_CREDIT_CHECK_ERROR("1015805", "统一会员积分检查异常"),
    ERROR_ORDER_USERCENTER_USER_LEVEL_ERROR("1015806", "统一会员积分兑换等级异常"),
    ERROR_ORDER_USERCENTER_COUPON_CODE_ERROR("1015807", "获取自提码/券码异常"),
    ERROR_ORDER_USERCENTER_CHECKING_CODE_ERROR("1015808", "统一会员验证劵码异常");

    private String code;
    private String message;

    private UserCenterConstantEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getActionCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
