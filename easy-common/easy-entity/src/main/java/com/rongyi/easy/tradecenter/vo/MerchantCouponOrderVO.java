package com.rongyi.easy.tradecenter.vo;

import java.util.List;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class MerchantCouponOrderVO
{

    private String orderNo;//订单号
    private String checkedTime;//核销时间
    private String paymentTime;//支付时间
    private String couponSource;//卡券来源
    private  String couponNum;//订单卡券种类
    private String buyerAccount;//买家账号
    private  Double paymentAmount;//支付金额
    private String discountAmount;//优惠金额Ԫ
    private Double integralAmount;//积分优惠信息
    private String integralNum;//积分数
    private Double hbDiscount;//红包优惠
    private  String orderStatus;//订单状态
    List<MerchantOrderCouponVO> couponList;//订单下的卡券列表

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Double getHbDiscount() {
        return hbDiscount;
    }

    public void setHbDiscount(Double hbDiscount) {
        this.hbDiscount = hbDiscount;
    }

    public Double getIntegralAmount() {
        return integralAmount;
    }

    public void setIntegralAmount(Double integralAmount) {
        this.integralAmount = integralAmount;
    }

    public String getIntegralNum() {
        return integralNum;
    }

    public void setIntegralNum(String integralNum) {
        this.integralNum = integralNum;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCheckedTime() {
        return checkedTime;
    }

    public void setCheckedTime(String checkedTime) {
        this.checkedTime = checkedTime;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getCouponSource() {
        return couponSource;
    }

    public void setCouponSource(String couponSource) {
        this.couponSource = couponSource;
    }

    public String getCouponNum() {
        return couponNum;
    }

    public void setCouponNum(String couponNum) {
        this.couponNum = couponNum;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<MerchantOrderCouponVO> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<MerchantOrderCouponVO> couponList) {
        this.couponList = couponList;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "orderNo='" + orderNo + '\'' +
                ", checkedTime='" + checkedTime + '\'' +
                ", paymentTime='" + paymentTime + '\'' +
                ", couponSource='" + couponSource + '\'' +
                ", couponNum='" + couponNum + '\'' +
                ", buyerAccount='" + buyerAccount + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", discountAmount='" + discountAmount + '\'' +
                ", integralAmount=" + integralAmount +
                ", integralNum='" + integralNum + '\'' +
                ", HbDiscount=" + hbDiscount +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
