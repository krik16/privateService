package com.rongyi.easy.coupon.entity;

import java.io.Serializable;

public class CouponMall implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 卡券id
     */
    private String couponId;

    /**
     * 商场id
     */
    private String mallId;

    /**
     * 商场名称
     */
    private String mallName;

    /**
     * 商场地址
     */
    private String mallAddress;

    private Integer isRelateAll;

    public Integer getIsRelateAll() {
        return isRelateAll;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CouponMall{");
        sb.append("id=").append(id);
        sb.append(", couponId='").append(couponId).append('\'');
        sb.append(", mallId='").append(mallId).append('\'');
        sb.append(", mallName='").append(mallName).append('\'');
        sb.append(", mallAddress='").append(mallAddress).append('\'');
        sb.append(", isRelateAll=").append(isRelateAll);
        sb.append('}');
        return sb.toString();
    }

    public void setIsRelateAll(Integer isRelateAll) {
        this.isRelateAll = isRelateAll;
    }

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

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallAddress() {
        return mallAddress;
    }

    public void setMallAddress(String mallAddress) {
        this.mallAddress = mallAddress;
    }


    public CouponMall(String couponId, String mallId, String mallName, String mallAddress) {
        this.couponId = couponId;
        this.mallId = mallId;
        this.mallName = mallName;
        this.mallAddress = mallAddress;
    }

    public CouponMall(String couponId, String mallId) {
        this.couponId = couponId;
        this.mallId = mallId;
    }

    public CouponMall(String couponId, String mallName, String mallId) {

        this.couponId = couponId;
        this.mallName = mallName;
        this.mallId = mallId;
    }

    public CouponMall(Integer id, String couponId, String mallId) {

        this.id = id;
        this.couponId = couponId;
        this.mallId = mallId;
    }

    public CouponMall() {

    }
}
