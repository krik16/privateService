package com.rongyi.easy.baogang;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaozhou on 2016/12/23.
 */
public class SendSmsParamBg implements Serializable {
    private String cardNumber;//会员卡号 或 会员手机号
    private String amount;//积分消费数量（实收金额 单位：元 2位小数）
    private String orderNumber;//商家订单号
    private String serialNumber;//商家交易流水号
    private String orderDate;//商家订单创建时间(格式：0000-00-00 00:00:00)
    private List<OrderDetailParm> orderDetail;//订单详情（参考订单详情 JSON格式）
    private String price;//订单应收总额（单位：元 2位小数）
    private Long timeStamp;
    private String sign;
    private String channel;//目的渠道 1宝钢
    private String source;//源渠道 1家得利
    private Integer type;//请求类型 1 短信 2 交易短信

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

    public List<OrderDetailParm> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetailParm> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SendSmsParamBg{" +
                "cardNumber='" + cardNumber + '\'' +
                ", amount='" + amount + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderDetail=" + orderDetail +
                ", price='" + price + '\'' +
                ", timeStamp=" + timeStamp +
                ", sign='" + sign + '\'' +
                ", channel='" + channel + '\'' +
                ", source='" + source + '\'' +
                ", type=" + type +
                '}';
    }
}
