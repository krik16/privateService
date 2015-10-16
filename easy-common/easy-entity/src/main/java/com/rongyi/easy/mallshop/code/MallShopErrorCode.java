package com.rongyi.easy.mallshop.code;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/10/13
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/13              1.0            创建文件
 *
 */
/**
 * 错误码说明：错误码共7位
 * 第1位表示错误码类型，1表示透传错误码，错误提示(msg)直接用后端返回的,2表示需特殊处理的错误码
 * 第2、3位  固定为 07
 * 4、后4位表示子系统内的具体错误
 */
public enum MallShopErrorCode {

    SUCCESS(0, "正常"), //原系统都定义为正常情况 编码规则不变
    FAILURE(-1, "网络正在打瞌睡，请稍后再试"), //原系统都定义为正常情况 编码规则不变

    /** 公共编码 后4位区间  0001---1000*/
    ERROR_PARAM_ISNULL(1070001, "必填参数不能为空"),
    SUCCESS_MALLSHOPEXCEPTION(1070011,"摩店异常业务异常_具体的明细具体输出"),


     /** 用户相关 后4位区间  1001---2000*/
    ERROR_ID_INVALID(1071001,"请重新登录"),
    BUYER_PHONE_ISEXITS(1071011,"您注册的手机号已经存在，可登录后直接升级为买手"),


    BUYER_ROLE_ISEXITS(1071801,"您已经拥有买手身份，无需升级!重新登录即可"),
    BUYER_DESC_ISLONGER(1071811,"简介内容过长，请重新编辑")
    /** 商品相关 后4位区间  2001---3000*/



    /** 订单相关  后4位区间  3001---4000*/


    /** 首页相关  后4位区间  4001---5000*/

    ;

    /**
     *
     */
    private int code;
    private String message;
    private MallShopErrorCode(int code, String message) {
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

