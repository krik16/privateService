package com.rongyi.easy.baogang;

import java.io.Serializable;
import java.util.List;

/**
 * 用户退换货接口请求实体
 * Created by shaozhou on 2016/11/7.
 */
public class IntegralRefundParam implements Serializable {
    private String integral;//退货单总额（实收价格）
    private String cardNumber;//会员卡号 或 会员手机号
    private List<OrderDetailParm> orderDetail;//订单详情（参考订单详情 JSON格式）
    private String orderNumber;//商家订单号
    private String serialNumber;//商家交易流水号
    private Integer type;//支付类型【0:宝钢积分 1:非积分】
    private String orderDate;//商家订单创建时间(格式：0000-00-00 00:00:00)
    private String price;//订单应收总额（单位：元 2位小数）
    private Integer channel;//目的渠道 1宝钢
    private Long timeStamp;//时间戳
    private String sign;//签名
    private Integer source;//源渠道 1家得利

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public List<OrderDetailParm> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetailParm> orderDetail) {
        this.orderDetail = orderDetail;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "IntegralRefundParam{" +
                "integral='" + integral + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", orderDetail=" + orderDetail +
                ", orderNumber='" + orderNumber + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", type=" + type +
                ", orderDate='" + orderDate + '\'' +
                ", price='" + price + '\'' +
                ", channel=" + channel +
                ", timeStamp=" + timeStamp +
                ", sign='" + sign + '\'' +
                ", source=" + source +
                '}';
    }
}
