package com.rongyi.pay.core.wechat.model;

import com.rongyi.pay.core.util.BaseData;

/**
 * 微信支付业务参数
 * conan
 * 2016/10/11 14:49
 **/
public class WechatPaySignData extends BaseData {

    private String orderNo;//订单号

    private String payNo; //支付单号

    private Integer totalFee; //支付金额，单位分

    private String body;//商品描述

    private String timeStart;//支付有效时间开始值

    private String timeExpire;//支付有效时间结束值

    private String appId;//微信appId

    private String openId;//openId

    private String authCode;//用户支付二维码

    private Integer orderType;//订单类型


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
}
