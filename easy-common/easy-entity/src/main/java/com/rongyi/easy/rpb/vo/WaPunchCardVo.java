package com.rongyi.easy.rpb.vo;

/**
 * 微众支付宝刷卡支付
 * conan
 * 2017/3/6 14:15
 **/
public class WaPunchCardVo {
    //商户号  必传
    private String wbMerchantId;

    //商户订单号 必传
    private String orderNo ;

    //支付宝授权码 必传
    private String authCode ;

    //商户支付宝用户ID 如果为空 默认为商户签约账号对应的支付宝用户ID
    private String sellerId ;

    //订单总金额 元 必传
    private Integer totalAmount ;

    //订单标题 必传
    private String subject ;

    //订单描述
    private String body ;

    public String getWbMerchantId() {
        return wbMerchantId;
    }

    public void setWbMerchantId(String wbMerchantId) {
        this.wbMerchantId = wbMerchantId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
