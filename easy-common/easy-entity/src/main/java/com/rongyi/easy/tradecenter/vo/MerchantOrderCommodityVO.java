package com.rongyi.easy.tradecenter.vo;

import java.math.BigDecimal;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class MerchantOrderCommodityVO
{

    private String icon;//��Ʒͼ url������ԡ�,���ָ�
    private String commodityName;//��Ʒ��
    private String commodityNo;//��Ʒ����
    private String commoditySpec;//��Ʒ��񣬶���ԡ�,���ָ�
    private String commodityNum;//��Ʒ����
    private String unitPrice;//��Ʒ���� Ԫ
    private BigDecimal totalPrice;//��Ʒ�ܼ� Ԫ
    private String payPrice;//���֧�� Ԫ?
    private String discountInfo;//�Ż���Ϣ
    private String discountAmount;//�Żݽ��
    private Integer commodityStatus; //��Ʒ״̬
    private String id;//��Ʒid
    private String postage;//��Ʒ�ʷ�
    private boolean supportCourierDeliver=true;//֧�ֿ�ݷ����ֶ�  true ��    false��
    private boolean supportSelfPickup=true;//֧�ֵ�������  true ��    false��

    public boolean isSupportCourierDeliver() {
        return supportCourierDeliver;
    }

    public void setSupportCourierDeliver(boolean supportCourierDeliver) {
        this.supportCourierDeliver = supportCourierDeliver;
    }

    public boolean isSupportSelfPickup() {
        return supportSelfPickup;
    }

    public void setSupportSelfPickup(boolean supportSelfPickup) {
        this.supportSelfPickup = supportSelfPickup;
    }

    public String getPostage() {
        return postage;
    }

    public void setPostage(String postage) {
        this.postage = postage;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityNo() {
        return commodityNo;
    }

    public void setCommodityNo(String commodityNo) {
        this.commodityNo = commodityNo;
    }

    public String getCommoditySpec() {
        return commoditySpec;
    }

    public void setCommoditySpec(String commoditySpec) {
        this.commoditySpec = commoditySpec;
    }

    public String getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(String commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
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

    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public String toString() {
        return "OrderVO=[icon="+icon+",commodityName="+commodityName+",commodityNo="+commodityNo+"," +
                "commoditySpec="+commoditySpec+",commodityNum="+commodityNum+",unitPrice="+unitPrice+",totalPrice="+totalPrice+",discountAmount="+discountAmount+"," +
                "payPrice="+payPrice+",discountInfo="+discountInfo+"]";
    }
}
