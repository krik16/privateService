package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/3/30.
 */
public class OrderSettleDetailVo implements Serializable {
    private Long couponUsed;
    private String orderNo;
    private Long payAmount;
    private String ryShopNo;//容易商户号
    private String payShopNo;//支付渠道商户号
    private Integer paymentChannel;//支付渠道 1微众银行、2容易网服务商、3拉卡拉、4容易网
    private String paymentNo;//支付渠道流水号
    private String cashName;
    private Long paymentTime;
    private Integer paymentType;
    private String posNo;//pos终端号
    private Long poundage;
    private Long realAmout;
    private Integer reductionUsed;
    private String ryPaymentNo;//容易支付交易流水
    private Long scoreDiscount;
    private Integer scoreUsed;
    private String shopName;//商户名称
    private String shopNo;//商户号
    private Integer status;

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

    public String getPayShopNo() {
        return payShopNo;
    }

    public void setPayShopNo(String payShopNo) {
        this.payShopNo = payShopNo;
    }

    public Integer getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(Integer paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getCashName() {
        return cashName;
    }

    public void setCashName(String cashName) {
        this.cashName = cashName;
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

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
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

    public Integer getReductionUsed() {
        return reductionUsed;
    }

    public void setReductionUsed(Integer reductionUsed) {
        this.reductionUsed = reductionUsed;
    }

    public String getRyPaymentNo() {
        return ryPaymentNo;
    }

    public void setRyPaymentNo(String ryPaymentNo) {
        this.ryPaymentNo = ryPaymentNo;
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

    public String getRyShopNo() {
        return ryShopNo;
    }

    public void setRyShopNo(String ryShopNo) {
        this.ryShopNo = ryShopNo;
    }

    @Override
    public String toString() {
        return "OrderSettleDetailVo{" +
                "couponUsed=" + couponUsed +
                ", orderNo='" + orderNo + '\'' +
                ", payAmount=" + payAmount +
                ", ryShopNo='" + ryShopNo + '\'' +
                ", payShopNo='" + payShopNo + '\'' +
                ", paymentChannel=" + paymentChannel +
                ", paymentNo='" + paymentNo + '\'' +
                ", cashName='" + cashName + '\'' +
                ", paymentTime=" + paymentTime +
                ", paymentType=" + paymentType +
                ", posNo='" + posNo + '\'' +
                ", poundage=" + poundage +
                ", realAmout=" + realAmout +
                ", reductionUsed=" + reductionUsed +
                ", ryPaymentNo='" + ryPaymentNo + '\'' +
                ", scoreDiscount=" + scoreDiscount +
                ", scoreUsed=" + scoreUsed +
                ", shopName='" + shopName + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", status=" + status +
                '}';
    }
}
