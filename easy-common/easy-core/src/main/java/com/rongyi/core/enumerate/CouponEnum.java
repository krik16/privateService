package com.rongyi.core.enumerate;

/**
 * Description:卡券 错误码
 * 1 表示透传错误码 02 营销中心 01 消息中心  10201XX
 *                              12 微信终端屏接口
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
    //摩店创建卡券敏感期验证
    ERROR_NAME_SENSITIVE_WORD(1020140, "卡券名称存在敏感词"),
    ERROR_USE_LIMIT_SENSITIVE_WORD(1020141, "卡券使用限制存在敏感词"),
    ERROR_USE_DES_SENSITIVE_WORD(1020142, "卡券使用说明存在敏感词"),

    //微信终端屏接口
    ERROR_NULL_PARAM(1021200,"参数为空！"),
    ERROR_INVALID_CURRENTPAGE(1021201,"当前页参数不正确！"),
    ERROR_INVALID_PAGESIZE(1021202,"每一页大小参数不正确！"),
    ERROR_INVALID_PAGE_PARAM(1021203,"页码和每一页大小必须为整数"),
    ERROR_INVALID_USER(1021204,"用户不正确！"),
    ERROR_INVALID_MOBILE(1021205,"buyerMobile 参数不能为空！"),
    ERROR_INVALID_MALLID(1021206,"mallId 参数不能为空！"),
    ERROR_INVALID_OPENID(1021207,"openId 参数不能为空！"),
    ERROR_INVALID_PARAMS(1021208,"params 参数不能为空！"),
    ERROR_INVALID_ORDERNO(1021209,"订单号传递错误！"),
    ERROR_INVALID_COUPONID(1021210,"卡券id 不正确！"),
    ERROR_INVALID_TOPCOUPON(1021211,"需要置顶的卡券参数不正确"),
    ERROR_INVALID_TOP_FAILED(1021212,"置顶失败！"),
    ERROR_INVALID_MODULEID(1021213,"moduleId 不正确 ！"),
    ERROR_INVALID_VERSION(1021214,"版本号不正确！"),
    ERROR_INVALID_ZDP_ORDER_PHONE(1021215,"终端机渠道手机用户下单，缺少必要电话参数 ！"),
    ERROR_INVALID_WX_ORDER_PHONE(1021216,"微网站下单，缺少必要电话参数 ！"),
    ERROR_INVALID_APP_ORDER_PHONE(1021217,"app渠道下单，缺少必要电话参数 ！"),
    ERROR_CREATE_ORDER_FAIL(1021218,"订单创建失败！"),
    ERROR_NOT_EXIST_ORDER(1021219,"未找到相关订单！"),

    ERROR_INVALID_SHOW_CHANNEL(1021221,"show_channel 不能为空！"),
    ERROR_INVALID_GROUPON_TYPE(1021222,"参数[groupon_type]不正确！"),
    ERROR_INVALID_START_TIME(1021223,"参数[start_time]不是一个合法的[yyyy-MM-dd]格式！"),
    ERROR_INVALID_END_TIME(1021224,"参数[end_time]不是一个合法的[yyyy-MM-dd]格式！"),
    ERROR_INVALID_PUBLIC_START(1021225,"参数[public_start]不是一个合法的[yyyy-MM-dd]格式！"),
    ERROR_INVALID_PUBLIC_END(1021226,"参数[public_end]不是一个合法的[yyyy-MM-dd]格式！"),
    ERROR_INVALID_ACTIVITYID(1021227,"参数[activityId]错误！"),
    ERROR_NOTEXIST_COUPON(1021228,"卡券不存在！"),
    VALID_COUPON_CODE_FAIL(1021229,"验券失败"),
    VALID_INVALID_UID(1021230,"必要参数uid 有误！"),
    VALID_INVALID_COUPONID(1021231,"必要参数couponId 有误！"),
    VALID_INVALID_COUPONIDS(1021232,"必要参数 ids 有误！")






    ;



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
