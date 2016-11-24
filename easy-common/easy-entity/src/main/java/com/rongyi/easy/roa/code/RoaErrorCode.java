package com.rongyi.easy.roa.code;/*
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
 * 第2、3位  固定为 05
 * 4、后4位表示子系统内的具体错误
 */
public enum RoaErrorCode {

    SUCCESS(0, "正常"), //原系统都定义为正常情况 编码规则不变
    FAILURE(1, "网络呆萌中，重新提交一下试试"), //原系统都定义为正常情况 编码规则不变
    USER_ISNOT_LOGIN(21,"请重新登录"),
    USE_CARD_INVALID(22,"请选择使用的积分卡"),
    PARAMETER_ISNULL(1050001,"必要参数不能为空"),
    /** 积分福利  */
    ERROR_CODE_ISNULL(1051001,"验证码不能为空"),
    ERROR_CODE_ISERROR(1051002,"验证码错误"),
    ERROR_CARDNUM_ISNULL(1051003,"账号不能为空"),
    ERROR_PASSWORD_ISNULL(1051004,"密码不能为空"),
    ERROR_PHONE_ISNULL(1051001,"手机号不能为空"),
    MCH_INFO_MOT_EXIST(1051002,"无有效的商户配置"),
    
    ERROR_COMMODITY_OVER(1052001,"库存不足哦~"),
    ERROR_ACTIVITY_OVERTIME(1052002,"来晚啦，活动已结束"),
    ERROR_COMMODITY_SOLDOUT(1052003,"该商品已下线"),
    ERROR_GROUP_PINGTUAN_SUCCESS(1052004,"该团已满员，请重新开团哦~"),
    ERROR_GREOUP_PINGTUAN_OVERTIME(1052005,"团已过期"),
    ERROR_GROUP_PINGTUAN_ALREADY(1052006,"您已经参加过该团~"),
    ERROR_PAYMENT_STATUS(1052007,"订单过期，不能继续支付~"),
    ERROR_LIMIT_PINGTUAN_JOIN(1052008,"参团次数达上限，不可支付~"),
    ERROR_LIMIT_PINGTUAN_CREATE(1052009,"开团次数达上限，不可支付~"),
    ERROR_ORDERMODEL_SHIPTYPE_CONFLICT(1052010,"商品发货方式冲突"),
    ERROR_REPEAT_ORDER(1052011,"你已下过订单了，但还没有支付哦~"),
    ERROR_ORDER_SHOP(1052012,"商品不在同一店铺不可下单"),
    ERROR_CREATE_ORDER_MODEL(1052013,"生成订单模板失败"),
    ERROR_COMMODITY_SPEC(1052014,"商品已失效")
    
    ;



    /**
     *
     */
    private int code;
    private String message;
    private RoaErrorCode(int code, String message) {
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
