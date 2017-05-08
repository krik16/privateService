package com.rongyi.easy.tradecenter.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class MerchantOrderCouponVO implements Serializable
{

    String icon;//卡券图
    String couponName;//卡券名
    String couponId;//卡券id
    String couponCode;//卡券id
    String couponNum;//卡券数量
    String unitPrice;//单价
    String totalPrice;//总价
    String payPrice;//实际支付价
    String discountInfo;//优惠信息
    String discountAmount;//优惠价
    String validTime;//有效期
    String status;//状态
    String outChannelName;//推广渠道名
    String merchantRedDiscount;//商家补贴红包金额
    String merchantRebateDiscount;//商家补贴抵扣券金额
    Integer relatedType;//代金券：集团[0],品牌[1], 商场 [2],店铺[3];导购[4]（商家后台导购建的券）
    String relateName;//关联商场或店铺的名称

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

    public Integer getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Integer relatedType) {
        this.relatedType = relatedType;
    }

    public String getRelateName() {
        return relateName;
    }

    public void setRelateName(String relateName) {
        this.relateName = relateName;
    }

    public String getMerchantRedDiscount() {
        return merchantRedDiscount;
    }

    public void setMerchantRedDiscount(String merchantRedDiscount) {
        this.merchantRedDiscount = merchantRedDiscount;
    }

    public String getMerchantRebateDiscount() {
        return merchantRebateDiscount;
    }

    public void setMerchantRebateDiscount(String merchantRebateDiscount) {
        this.merchantRebateDiscount = merchantRebateDiscount;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
