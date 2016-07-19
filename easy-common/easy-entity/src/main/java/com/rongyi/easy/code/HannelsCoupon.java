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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HannelsCoupon{");
        sb.append("id=").append(id);
        sb.append(", couponId='").append(couponId).append('\'');
        sb.append(", couponName='").append(couponName).append('\'');
        sb.append(", couponType=").append(couponType);
        sb.append(", stockCount=").append(stockCount);
        sb.append(", createAt=").append(createAt);
        sb.append(", hannelsId=").append(hannelsId);
        sb.append(", publishStartAt=").append(publishStartAt);
        sb.append(", publishEndAt=").append(publishEndAt);
        sb.append('}');
        return sb.toString();
    }
}
