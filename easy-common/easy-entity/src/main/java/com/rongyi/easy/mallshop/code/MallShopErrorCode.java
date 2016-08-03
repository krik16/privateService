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
    ERROR_NO_AUTHORIZED(1070021,"当前功能您无权访问"),
    ERROR_NO_REGION(1070023,"未查到相关区域信息"),
    ERROR_VERSION_180(1070030, "当前版本不支持注册，请升级到V1.70后的版本再注册"),
     /** 用户相关 后4位区间  1001---2000*/
    ERROR_ID_INVALID(1071001,"请重新登录"),
    BUYER_PHONE_ISEXITS(1071011,"您注册的手机号已经存在，可登录后直接升级为买手"),
    ERROR_NO_EMAIL(1071002,"客服没有设置邮箱，不能发送邮件"),
    ERROR_CERTIFIED_FAILURE(1071003,"提交身份验证失败"),
    ERROR_INVITE_CODE(1071012,"您输入的邀请码无效，请查证后输入!"),
    ERROR_WORKIMG_CODE(1071013,"工作证正面照不能为空!"),
    ERROR_SHOPID_CODE(1071014,"请选择店铺!"),


    BUYER_ROLE_ISEXITS(1071801,"您已经拥有买手身份，无需升级!重新登录即可"),
    BUYER_DESC_ISLONGER(1071811,"简介内容过长，请重新编辑"),
    BUYER_DESC_HAS_SENSITIVE_WORD(1071812,"您填写的买手简介不符合规范，请重新编辑"),
    BUYER_NICKNAME_HAS_SENSITIVE_WORD(1071813,"您填写的买手昵称不符合规范，请重新编辑"),
    /** 商品相关 后4位区间  2001---3000*/
    ERROR_REPORT_SHOP(1072001,"上报未找到的店铺失败"),


    /** 订单相关  后4位区间  3001---4000*/


    /** 首页相关  后4位区间  4001---5000*/
    
    /** 代金券相关  后4位区间  5001---6000*/
    ERROR_COUPON_PUBLISH_CHANNEL(1075001,"亲，活动券你不能管理哦"),
    
    /** 邀请下载   后4位区间  6001---7000 */
    ERROR_PHONE_NULL(1076001,"您还未输入手机号哦"),
    ERROR_PHONE_FORMAT(1076002,"您输入手机号格式不正确"),
    ERROR_PHONE_APP_EXIST(1076003,"您已是容易逛用户哦"),
    ERROR_PHONE_MALLSHOP_EXIST(1076004,"您已是摩店用户哦"),
    ERROR_INVITE_USER_NOT_EXIST(1076005,"邀请对象不符合要求")
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

