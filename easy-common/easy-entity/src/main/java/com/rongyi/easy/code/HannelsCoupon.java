package com.rongyi.easy.code;

import java.util.Date;

public class HannelsCoupon {
    private Integer id;

    private String couponId;
    private String couponName;
    private Byte couponType;

    private Integer stockCount;

    private Date createAt;
    private Integer hannelsId;//关联促销码id
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
}