package com.rongyi.easy.coupon.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

public class CouponOrder implements Serializable {

    private Long id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 摩生活 用户id
     */
    private String buyerId;

    /**
     * 持有人 昵称
     */
    private String buyerName;

    /**
     * 持有人手机
     */
    private String buyerMobile;

    /**
     * 商场Id
     */
    private String mallId;
    /**
     * 微信openId
     */
    private String openId;

    /**
     * 交易状态:待付款[0], 已付款[1], 已取消[2], 已删除[3], 退款中[4], 已退款[5]
     * 显示优先级： 退款中>未消费>已退款>已过期>已使用
     * 举例： 一张订单：退款中+未消费+已使用   在”全部“，”未消费“，”退款单“中都能找到
     */
    private Integer tradeStatus;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付方式  1：web页支付宝支付，3:手机支付宝支付，5：微信app支付
     */
    private Integer tradeWay;

    /**
     * 现金券码
     */
    private String cashCouponCode;

    /**
     * 付款单号
     */
    private String paymentNo;

    public CouponOrder() {

    }

    public CouponOrder(String orderNo, String buyerId, String buyerName, String buyerMobile, Integer tradeStatus,
                       Date orderTime, Date payTime, Integer tradeWay) {
        super();
        this.orderNo = orderNo;
        this.buyerId = buyerId;
        this.buyerName = buyerName;
        this.buyerMobile = buyerMobile;
        this.tradeStatus = tradeStatus;
        this.orderTime = orderTime;
        this.payTime = payTime;
        this.tradeWay = tradeWay;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return buyerId
     */
    public String getBuyerId() {
        return buyerId;
    }

    /**
     * @param buyerId
     */
    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * @return buyerName
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * @param buyerName
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    /**
     * @return buyerMobile
     */
    public String getBuyerMobile() {
        return buyerMobile;
    }

    /**
     * @param buyerMobile
     */
    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    /**
     * @return tradeStatus
     */
    public Integer getTradeStatus() {
        return tradeStatus;
    }

    /**
     * @param tradeStatus
     */
    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    /**
     * @return orderTime
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * @param orderTime
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * @return payTime
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * @param payTime
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * @return tradeWay
     */
    public Integer getTradeWay() {
        return tradeWay;
    }

    /**
     * @param tradeWay
     */
    public void setTradeWay(Integer tradeWay) {
        this.tradeWay = tradeWay;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getCashCouponCode() {
        return cashCouponCode;
    }

    public void setCashCouponCode(String cashCouponCode) {
        this.cashCouponCode = cashCouponCode;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("orderNo", orderNo)
                .append("buyerId", buyerId)
                .append("buyerName", buyerName)
                .append("buyerMobile", buyerMobile)
                .append("mallId", mallId)
                .append("openId", openId)
                .append("tradeStatus", tradeStatus)
                .append("orderTime", orderTime)
                .append("payTime", payTime)
                .append("tradeWay", tradeWay)
                .append("cashCouponCode", cashCouponCode)
                .append("paymentNo", paymentNo)
                .toString();
    }
}