package com.rongyi.easy.tradecenter.vo;

import java.util.List;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class MerchantCouponOrderVO
{

    private String orderNo;//������
    private String checkedTime;//����ʱ��
    private String paymentTime;//֧��ʱ��
    private String couponSource;//��ȯ��Դ
    private  String couponNum;//������ȯ����
    private String buyerAccount;//����˺�
    private  Double paymentAmount;//֧�����
    private String discountAmount;//�Żݽ��?
    private Double integralAmount;//�����Ż���Ϣ
    private String integralNum;//������
    private Double hbDiscount;//����Ż�
    private  String orderStatus;//����״̬
    List<MerchantOrderCouponVO> couponList;//�����µĿ�ȯ�б�

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
