package com.rongyi.easy.code;

import java.io.Serializable;
import java.util.Date;

public class HannelsCoupon implements Serializable{
    private Integer id;

    private String couponId;
    private String couponName;
    private Byte couponType;

    private Integer stockCount;

    private Date createAt;
    private Integer hannelsId;//关联促销码id

    /**
     * 卡券发布开始时间
     */
    private Date publishStartAt;

    /**
     * 卡券发布结束时间
     */
    private Date publishEndAt;
    private Date validStartAt;//卡券固定时间有效开始时间
    private Date validEndAt;//卡券固定时间有效结束时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Byte getCouponType() {
        return couponType;
    }

    public void setCouponType(Byte couponType) {
        this.couponType = couponType;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Integer getHannelsId() {
        return hannelsId;
    }

    public void setHannelsId(Integer hannelsId) {
        this.hannelsId = hannelsId;
    }

    public Date getPublishStartAt() {
        return publishStartAt;
    }

    public void setPublishStartAt(Date publishStartAt) {
        this.publishStartAt = publishStartAt;
    }

    public Date getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(Date publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    public Date getValidStartAt() {
        return validStartAt;
    }

    public void setValidStartAt(Date validStartAt) {
        this.validStartAt = validStartAt;
    }

    public Date getValidEndAt() {
        return validEndAt;
    }

    public void setValidEndAt(Date validEndAt) {
        this.validEndAt = validEndAt;
    }

    @Override
    public String toString() {
        return "HannelsCoupon{" +
                "id=" + id +
                ", couponId='" + couponId + '\'' +
                ", couponName='" + couponName + '\'' +
                ", couponType=" + couponType +
                ", stockCount=" + stockCount +
                ", createAt=" + createAt +
                ", hannelsId=" + hannelsId +
                ", publishStartAt=" + publishStartAt +
                ", publishEndAt=" + publishEndAt +
                ", validStartAt=" + validStartAt +
                ", validEndAt=" + validEndAt +
                '}';
    }
}
