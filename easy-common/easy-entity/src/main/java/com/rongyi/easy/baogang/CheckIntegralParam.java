package com.rongyi.easy.baogang;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/11/7.
 */
public class CheckIntegralParam implements Serializable {
    private String cardNumber;//会员卡号	或会员手机号
    private String verificationCode;//会员验证码【手机短信验证码（获取积分交易短信验证码接口）、条形码、动态识别码等】
    private String payPassword;//支付密码【默认不需要，填写 "0"。若需要则根据支付验证码接口返回的isPayPassword	状态】
    private String amount;//交易的积分数量【单位：元，保留两位小数，如"10.20"】
    private String orderNumber;//商家订单号
    private String serialNumber;//商家交易流水号
    private String orderDate;//商家订单生成时间，格式(0000-00-00 00:00:00)
    private String channel;//渠道编号
    private Long timeStamp;//时间戳
    private String sign;//签名

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "CheckIntegralParam{" +
                "cardNumber='" + cardNumber + '\'' +
                ", verificationCode='" + verificationCode + '\'' +
                ", payPassword='" + payPassword + '\'' +
                ", amount='" + amount + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", channel='" + channel + '\'' +
                ", timeStamp=" + timeStamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
