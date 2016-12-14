package com.rongyi.easy.baogang;

import java.io.Serializable;

/**
 * 订单冲正接口调用参数实体
 * Created by shaozhou on 2016/11/7.
 */
public class OrderTransactionParam implements Serializable {
    private String cardNumber;//会员卡号 或 会员手机号
    private String amount;//订单实收金额【 单位：元 2位小数】
    private Integer type;//支付类型【0:宝钢积分 1:非积分】
    private String orderNumber;//商家订单号
    private String serialNumber;//商家交易流水号
    private String orderDate;//商家订单创建时间(格式：0000-00-00 00:00:00)
    private String orderDetail;//订单详情（参考订单详情 JSON格式）
    private Integer state;//订单状态【默认 0:未完成(如果状态=“未完成”，系统执行退积分)】
    private String price;//订单应收总额（单位：元 2位小数）
    private Integer channel;//目的渠道 1宝钢
    private Long timeStamp;//时间戳
    private String sign;//签名
    private Integer source;//源渠道 1家得利

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

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

    @Override
    public String toString() {
        return "OrderTransactionParam{" +
                "cardNumber='" + cardNumber + '\'' +
                ", amount='" + amount + '\'' +
                ", type=" + type +
                ", orderNumber='" + orderNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderDetail='" + orderDetail + '\'' +
                ", state=" + state +
                ", price='" + price + '\'' +
                ", channel=" + channel +
                ", timeStamp=" + timeStamp +
                ", sign='" + sign + '\'' +
                ", source=" + source +
                '}';
    }
}
