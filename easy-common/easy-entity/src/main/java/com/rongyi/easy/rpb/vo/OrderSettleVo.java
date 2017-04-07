package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/3/30.
 */
public class OrderSettleVo implements Serializable {
    private String orderNo;//订单编号
    private Long couponUsed;//卡券抵扣
    private Long payAmount;//净收金额
    private Integer paymentChannel;//支付渠道 0微众银行、1容易网服务商、2拉卡拉、3容易网
    private Long paymentTime;//支付时间
    private Integer paymentType;//支付方式 0:支付宝 1:微信
    private Long poundage;//手续费
    private Long realAmount;//订单总金额
    private Integer reductionUsed;//满减金额
    private Long scoreDiscount;//积分抵扣金额
    private Integer scoreUsed;//积分抵扣
    private String shopName;//商户名称
    private String shopNo;//容易网商户号
    private Integer status;//1已付款、2已退款
    private Integer payTerminal;//支付终端 1pos 2扫码
    private String oRyPayNo;//原商户订单号

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getCouponUsed() {
        return couponUsed;
    }

    public void setCouponUsed(Long couponUsed) {
        this.couponUsed = couponUsed;
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

    public Long getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Long realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getReductionUsed() {
        return reductionUsed;
    }

    public void setReductionUsed(Integer reductionUsed) {
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

    public Integer getPayTerminal() {
        return payTerminal;
    }

    public void setPayTerminal(Integer payTerminal) {
        this.payTerminal = payTerminal;
    }

    public String getoRyPayNo() {
        return oRyPayNo;
    }

    public void setoRyPayNo(String oRyPayNo) {
        this.oRyPayNo = oRyPayNo;
    }

    @Override
    public String toString() {
        return "OrderSettleVo{" +
                "orderNo='" + orderNo + '\'' +
                ", couponUsed=" + couponUsed +
                ", payAmount=" + payAmount +
                ", paymentChannel=" + paymentChannel +
                ", paymentTime=" + paymentTime +
                ", paymentType=" + paymentType +
                ", poundage=" + poundage +
                ", realAmount=" + realAmount +
                ", reductionUsed=" + reductionUsed +
                ", scoreDiscount=" + scoreDiscount +
                ", scoreUsed=" + scoreUsed +
                ", shopName='" + shopName + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", status=" + status +
                ", payTerminal=" + payTerminal +
                '}';
    }
}
