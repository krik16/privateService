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
    FAILURE(-1, "网络正在打瞌睡，请稍后再试"), //原系统都定义为正常情况 编码规则不变
    USER_ISNOT_LOGIN(21,"请重新登录"),
    PARAMETER_ISNULL(1060001,"必要参数不能为空"),
    ERROR_MALLLIFEEXCEPTION(1060011,""),
    
    /** 代金券相关  后4位区间  5001---6000*/
    ERROR_COUPON_ORDER_PARAM(1065001,"亲~红包和抵扣券只能用一种喔~”"),
    ERROR_RECEIVED_REBATE(1065002, "您已领取过了新年礼盒")

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
