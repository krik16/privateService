package com.rongyi.easy.tradecenter.vo;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class MerchantOrderCouponVO
{

    String icon;//��ȯͼ
    String couponName;//��ȯ��
    String couponId;//��ȯid
    String couponCode;//��ȯid
    String couponNum;//��ȯ����
    String unitPrice;//����
    String totalPrice;//�ܼ�
    String payPrice;//ʵ��֧����
    String discountInfo;//�Ż���Ϣ
    String discountAmount;//�Żݼ�
    String validTime;//��Ч��
    String status;//״̬
    String outChannelName;//�ƹ�������

    public String getOutChannelName() {
        return outChannelName;
    }

    public void setOutChannelName(String outChannelName) {
        this.outChannelName = outChannelName;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponNum() {
        return couponNum;
    }

    public void setCouponNum(String couponNum) {
        this.couponNum = couponNum;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(String payPrice) {
        this.payPrice = payPrice;
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "OrderCouponVO=[icon="+icon+",couponName="+couponName+",couponId="+couponId+"," +
                "couponNum="+couponNum+",unitPrice="+unitPrice+",totalPrice="+totalPrice+",payPrice="+payPrice+",discountAmount="+discountAmount+"," +
               "discountInfo="+discountInfo+"]";
    }
}
