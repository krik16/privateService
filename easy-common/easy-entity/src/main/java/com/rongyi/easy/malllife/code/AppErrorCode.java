package com.rongyi.easy.malllife.code;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/10/20
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/20              1.0            创建文件
 *
 */

/**
 * 错误码说明：错误码共7位
 * 第1位表示错误码类型，1表示透传错误码，错误提示(msg)直接用后端返回的,2表示需特殊处理的错误码
 * 第2、3位  固定为 06
 * 4、后4位表示子系统内的具体错误
 * 外部渠道编码 后4位区间  8000---9000
 */
public enum AppErrorCode {

    SUCCESS(0, "正常"), //原系统都定义为正常情况 编码规则不变
    FAILURE(-1, "网络呆萌中，重新提交一下试试"), //原系统都定义为正常情况 编码规则不变
    USER_ISNOT_LOGIN(21,"请重新登录"),
    PARAMETER_ISNULL(1060001,"必要参数不能为空"),
    ERROR_MALLLIFEEXCEPTION(1060011,""),
    /** 用户导购聊天记录  */
    ERROR_SAVE_USERGUIDECHAT(1062001,"修改或者插入用户导购聊天记录失败"),
    ERROR_GUIDE_ISDISABLED(1062002,"此店铺休息中，无法为您服务"),
    /** 代金券相关  后4位区间  5001---6000*/
    ERROR_COUPON_ORDER_PARAM(1065001,"亲~红包和抵扣券只能用一种喔~”"),
    //ERROR_RECEIVED_REBATE(1065002, "您已领取过了暖冬礼盒"),
    ERROR_USER_NOTEXIST(1062003,"用户信息不存在"),

    /** 购物车相关  后4位区间  6001---7000*/
    ERROR_COMMODITY_NOTFOUND(1066001,"商品不存在"),
    ERROR_COMMODITY_OVER(1066002,"商品库存不足"),
    ERROR_COMMODITY_MORE(1066003,"购物车商品不能超过999"),
    ERROR_SHOPPINGCART_OVER(1066004,"你的购物车已经满满的啦,买掉一些再来添加呗"),
    ERROR_COMMODITY_LOWER(1066005,"购买商品数量小于1"),
    ERROR_COMMODITY_NOT_REGISTER(1066006,"商品下架"),
    ERROR_COMMODITY_ALL_SOLDOUT(1066007,"商品均已下架"),
    ERROR_ORDERMODEL_SHIPTYPE_CONFLICT(1066008,"同店铺商品仅支持一种配送方式，系统先为您默认快递发货噢"),
    ERROR_COMMODITY_PURCHASE_OVER(1066009,"你不能购买更多商品哦~"),
    ERROR_RECEIVED_REBATE(1065002, "您已领取过了新年礼盒"),
    
    
    ERROR_WECHAT_APPID_OPENID(1067001,"微信appId或渠道或openId不能为空"),
    ERROR_ORDERID_ISNULL(1067002,"订单号不能为空"),
    ERROR_SEARCH_BRANDIDS(1067003,"获取有商品的品牌id集合出错"),
    /** 分享红包  7100---7200*/
//    ERROR_PHONE_HAVEBIND(1067100,"手机号已被绑定"),
    ERROR_PHONE_ISNOTMOBILE(1067101,"手机号格式不正确，请重新输入"),
    ERROR_ALREADY_RECEIVE(1067102,"这个红包你已经抢过哦~"),
    ERROR_NO_SHARE(1067103,"红包已抢完啦~"),
    ERROR_ALREADY_END(1067104,"来晚了，活动已结束~"),
    ERROR_ALREADY_ONLIMIT(1067105,"今天领取红包超过限制了呢，明天再来吧~"),
    ERROR_PHONE_DISABLE(1067106,"您的账户异常，请联系容易逛客服"),
    ERROR_SHARE_FAILE(1067107,"领取红包失败"),
    /** 密码获取红包8100---8200 */
    ERROR_PWD_LENGTH(1068100,"密码长度不对"),
    ERROR_ADDED_RED(1068101,"该红包已被添加过啦"),
    ERROR_OUTDATA_RED(1068102,"抱歉，这个密码对应红包已经过期啦"),
    ERROR_ULTRALIMIT_RED(1068103,"抱歉，您领取红包超限，请明天再来试试呗"),
    ERROR_RED_PASSWORD(1068104,"红包密码错误请重新输入"),
    ERROR_RED_PASSWORD_ULTRALIMIT(1068105,"抱歉您错误输入超限，请明天再试")
    ;



    /**
     *
     */
    private int code;
    private String message;
    private AppErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
