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

    /**
     * 商场logo
     */
    private String mallLogUrl;

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

    public String getMallLogUrl() {
        return mallLogUrl;
    }

    public void setMallLogUrl(String mallLogUrl) {
        this.mallLogUrl = mallLogUrl;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CouponMall [id=").append(id).append(", couponId=").append(couponId).append(", mallId=").append(mallId).append(", mallName=").append(mallName).append(", mallAddress=").append(mallAddress).append(", mallLogUrl=").append(mallLogUrl).append("]");
        return builder.toString();
    }

    public CouponMall(String couponId, String mallId, String mallName, String mallAddress, String mallLogUrl) {
        this.couponId = couponId;
        this.mallId = mallId;
        this.mallName = mallName;
        this.mallAddress = mallAddress;
        this.mallLogUrl = mallLogUrl;
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
