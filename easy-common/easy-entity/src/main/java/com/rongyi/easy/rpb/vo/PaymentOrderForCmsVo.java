package com.rongyi.easy.rpb.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/3/29.
 */
public class PaymentOrderForCmsVo implements Serializable {
    private String cashName;
    private Integer couponUsed;
    private String orderNo;
    private Long payAmount;
    private Long paymentTime;
    private Integer paymentType;
    private Long realAmount;
    private Long reductionUsed;
    private Long scoreDiscount;
    private String settleName;
    private Integer status;

    public String getCashName() {
        return cashName;
    }

    public void setCashName(String cashName) {
        this.cashName = cashName;
    }

    public Integer getCouponUsed() {
        return couponUsed;
    }

    public void setCouponUsed(Integer couponUsed) {
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

    public Long getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Long realAmount) {
        this.realAmount = realAmount;
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

    public String getSettleName() {
        return settleName;
    }

    public void setSettleName(String settleName) {
        this.settleName = settleName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
