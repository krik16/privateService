package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderCartFormEntity implements Serializable {
    private Integer id;

    private String orderNo;//订单号

    private String rebateCode;//抵扣券code

    private BigDecimal rebateDiscount;//抵扣金额

    private Integer rebateSource;//促销券来源 1：平台 2：商家

    private Integer rebateType;//促销券类型 1：满减 2：立减

    private BigDecimal couponRequirement;//抵扣满金额

    private String discountInfo;//积分

    private BigDecimal scoreDiscount;//积分抵扣金额

    private BigDecimal realAmount;//总价

    private BigDecimal discountAmount;//原价-卖家优惠

    private BigDecimal rebateAmount;//discount_amount-红包抵扣券

    private BigDecimal scoreAmount;//rebate_amount - 积分

    private BigDecimal payAmount;//实付价

    private Long statusHoldMs;//下一次状态时间

    private Date nextStatusTime;//下一次状态时间

    private String buyerId;//买家id

    private String paymentIdList;//支付id

    private Date createAt;//订单生成时间

    private Date updateAt;//订单更新时间

    private Byte status;//状态 1未支付 2已支付 3超时关闭 4买家关闭 5失效

    private BigDecimal expressFee;

    private Byte isAlert;//是否已发送支付提醒 (0否 1是)

    private Byte payChannel;//1支付宝网页  3支付宝app  5微信

    private String userPhone;//用户手机

    private OrderEventEntity orderEvent;

    public OrderEventEntity getOrderEvent()
    {
        return orderEvent;
    }

    public void setOrderEvent(OrderEventEntity orderEvent)
    {
        this.orderEvent = orderEvent;
    }

    public Byte getIsAlert() {
        return isAlert;
    }

    public void setIsAlert(Byte isAlert) {
        this.isAlert = isAlert;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRebateCode() {
        return rebateCode;
    }

    public void setRebateCode(String rebateCode) {
        this.rebateCode = rebateCode;
    }

    public BigDecimal getRebateDiscount() {
        return rebateDiscount;
    }

    public void setRebateDiscount(BigDecimal rebateDiscount) {
        this.rebateDiscount = rebateDiscount;
    }

    public Integer getRebateSource() {
        return rebateSource;
    }

    public void setRebateSource(Integer rebateSource) {
        this.rebateSource = rebateSource;
    }

    public Integer getRebateType() {
        return rebateType;
    }

    public void setRebateType(Integer rebateType) {
        this.rebateType = rebateType;
    }

    public BigDecimal getCouponRequirement() {
        return couponRequirement;
    }

    public void setCouponRequirement(BigDecimal couponRequirement) {
        this.couponRequirement = couponRequirement;
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo;
    }

    public BigDecimal getScoreDiscount() {
        return scoreDiscount;
    }

    public void setScoreDiscount(BigDecimal scoreDiscount) {
        this.scoreDiscount = scoreDiscount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public Long getStatusHoldMs() {
        return statusHoldMs;
    }

    public void setStatusHoldMs(Long statusHoldMs) {
        this.statusHoldMs = statusHoldMs;
    }

    public Date getNextStatusTime() {
        return nextStatusTime;
    }

    public void setNextStatusTime(Date nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getPaymentIdList() {
        return paymentIdList;
    }

    public void setPaymentIdList(String paymentIdList) {
        this.paymentIdList = paymentIdList;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
    }

    public BigDecimal getDiscountAmount()
    {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount)
    {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getRebateAmount()
    {
        return rebateAmount;
    }

    public void setRebateAmount(BigDecimal rebateAmount)
    {
        this.rebateAmount = rebateAmount;
    }

    public BigDecimal getScoreAmount()
    {
        return scoreAmount;
    }

    public void setScoreAmount(BigDecimal scoreAmount)
    {
        this.scoreAmount = scoreAmount;
    }

    public Byte getPayChannel()
    {
        return payChannel;
    }

    public void setPayChannel(Byte payChannel)
    {
        this.payChannel = payChannel;
    }

    public String getUserPhone()
    {
        return userPhone;
    }

    public void setUserPhone(String userPhone)
    {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "OrderFormEntity{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", rebateCode=" + rebateCode +
                ", rebateDiscount=" + rebateDiscount +
                ", rebateSource=" + rebateSource +
                ", rebateType='" + rebateType + '\'' +
                ", status='" + status + '\'' +
                ", couponRequirement='" + couponRequirement + '\'' +
                ", createAt=" + createAt +
                ", statusHoldMs=" + statusHoldMs +
                ", nextStatusTime=" + nextStatusTime +
                ", buyerId='" + buyerId + '\'' +
                ", payAmount='" + payAmount + '\'' +
                ", paymentIdList='" + paymentIdList + '\'' +
                ", realAmount=" + realAmount +
                ", discountInfo='" + discountInfo + '\'' +
                ", couponRequirement=" + couponRequirement +
                ", scoreDiscount=" + scoreDiscount +
                ", discountAmount=" + discountAmount +
                ", rebateAmount=" + rebateAmount +
                ", scoreAmount=" + scoreAmount +
                ", payChannel=" + payChannel +
                ", userPhone=" + userPhone +
                '}';
    }
}