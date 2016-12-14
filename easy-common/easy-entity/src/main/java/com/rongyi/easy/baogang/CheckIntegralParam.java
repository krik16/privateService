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
    private Integer channel;//目标渠道 1宝钢
    private Long timeStamp;//时间戳
    private String sign;//签名
    private String orderDetail;//订单详情（参考订单详情 JSON格式）
    private String price;//订单应收总额（单位：元 2位小数）
    private Integer type;//支付类型【0:宝钢积分 1:非积分】	string	是
    private Integer state;//订单状态【默认 0:未完成(如果状态=“未完成”，系统执行退积分)】
    private Integer source;//源渠道 1 家得利

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
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

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
                ", channel=" + channel +
                ", timeStamp=" + timeStamp +
                ", sign='" + sign + '\'' +
                ", orderDetail='" + orderDetail + '\'' +
                ", price='" + price + '\'' +
                ", type=" + type +
                ", state=" + state +
                ", source=" + source +
                '}';
    }
}
