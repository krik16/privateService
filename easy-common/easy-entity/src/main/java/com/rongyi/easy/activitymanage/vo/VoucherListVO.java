package com.rongyi.easy.activitymanage.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.activitymanage.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/2/17
 * TIME : 18:48
 * ideaworkspace.
 */
public class VoucherListVO implements Serializable {
    private String goodsId;
    private String name;
    private Integer type;
    private Integer stockCount;

    private String picUrl;
    private String activityPrice;
    private Integer subSidyType;
    private Integer subSidyPrice;
    private Date joinEndAt;
    private Date joinStartAt;
    private Integer couponRelatedType;
    private String couponRelatedName;
    private Date couponStartAt;
    private Date couponEndAt;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(String activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Integer getSubSidyType() {
        return subSidyType;
    }

    public void setSubSidyType(Integer subSidyType) {
        this.subSidyType = subSidyType;
    }

    public Integer getSubSidyPrice() {
        return subSidyPrice;
    }

    public void setSubSidyPrice(Integer subSidyPrice) {
        this.subSidyPrice = subSidyPrice;
    }

    public Date getJoinEndAt() {
        return joinEndAt;
    }

    public void setJoinEndAt(Date joinEndAt) {
        this.joinEndAt = joinEndAt;
    }

    public Date getJoinStartAt() {
        return joinStartAt;
    }

    public void setJoinStartAt(Date joinStartAt) {
        this.joinStartAt = joinStartAt;
    }

    public Integer getCouponRelatedType() {
        return couponRelatedType;
    }

    public void setCouponRelatedType(Integer couponRelatedType) {
        this.couponRelatedType = couponRelatedType;
    }

    public String getCouponRelatedName() {
        return couponRelatedName;
    }

    public void setCouponRelatedName(String couponRelatedName) {
        this.couponRelatedName = couponRelatedName;
    }

    public Date getCouponStartAt() {
        return couponStartAt;
    }

    public void setCouponStartAt(Date couponStartAt) {
        this.couponStartAt = couponStartAt;
    }

    public Date getCouponEndAt() {
        return couponEndAt;
    }

    public void setCouponEndAt(Date couponEndAt) {
        this.couponEndAt = couponEndAt;
    }


    @Override
    public String toString() {
        return "VoucherListVO{" +
                "goodsId='" + goodsId + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", stockCount=" + stockCount +
                ", picUrl='" + picUrl + '\'' +
                ", activityPrice=" + activityPrice +
                ", subSidyType=" + subSidyType +
                ", subSidyPrice=" + subSidyPrice +
                ", joinEndAt=" + joinEndAt +
                ", joinStartAt=" + joinStartAt +
                ", couponRelatedType=" + couponRelatedType +
                ", couponRelatedName='" + couponRelatedName + '\'' +
                ", couponStartAt=" + couponStartAt +
                ", couponEndAt=" + couponEndAt +
                '}';
    }
}
