package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/3/30.
 */
public class OrderSettleVo implements Serializable {
    private String cashName;
    private Long couponUsed;
    private String orderNo;
    private Long payAmount;
    private Integer paymentChannel;
    private Long paymentTime;
    private Integer paymentType;
    private Long poundage;
    private Long realAmout;
    private Long reductionUsed;
    private Long scoreDiscount;
    private Integer scoreUsed;
    private String shopName;
    private String shopNo;
    private Integer status;

    public String getCashName() {
        return cashName;
    }

    public void setCashName(String cashName) {
        this.cashName = cashName;
    }

    public Long getCouponUsed() {
        return couponUsed;
    }

    public void setCouponUsed(Long couponUsed) {
        this.couponUsed = couponUsed;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(Integer paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public Long getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Long paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Long getPoundage() {
        return poundage;
    }

    public void setPoundage(Long poundage) {
        this.poundage = poundage;
    }

    public Long getRealAmout() {
        return realAmout;
    }

    public void setRealAmout(Long realAmout) {
        this.realAmout = realAmout;
    }

    public Long getReductionUsed() {
        return reductionUsed;
    }

    public void setReductionUsed(Long reductionUsed) {
        this.reductionUsed = reductionUsed;
    }

    public Long getScoreDiscount() {
        return scoreDiscount;
    }

    public void setScoreDiscount(Long scoreDiscount) {
        this.scoreDiscount = scoreDiscount;
    }

    public Integer getScoreUsed() {
        return scoreUsed;
    }

    public void setScoreUsed(Integer scoreUsed) {
        this.scoreUsed = scoreUsed;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderSettleVo{" +
                "cashName='" + cashName + '\'' +
                ", couponUsed=" + couponUsed +
                ", orderNo='" + orderNo + '\'' +
                ", payAmount=" + payAmount +
                ", paymentChannel=" + paymentChannel +
                ", paymentTime=" + paymentTime +
                ", paymentType=" + paymentType +
                ", poundage=" + poundage +
                ", realAmout=" + realAmout +
                ", reductionUsed=" + reductionUsed +
                ", scoreDiscount=" + scoreDiscount +
                ", scoreUsed=" + scoreUsed +
                ", shopName='" + shopName + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", status=" + status +
                '}';
    }
}
