package com.rongyi.easy.coupon.entity.mysql;

public class CouponMall {
    private Integer id;

    private String mallId;

    private String mallName;

    private String mallAddress;

    private String mallLogUrl;

    private Integer couponId;

    private Integer enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
