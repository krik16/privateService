package com.rongyi.easy.coupon.entity.mysql;

public class CouponCategory {
    private Integer id;

    private Integer couponId;

    private String firstCategoryId;

    private String firstCategoryName;

    private String secendCategoryId;

    private String secendCategoryName;

    private Integer enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getFirstCategoryId() {
        return firstCategoryId;
    }

    public void setFirstCategoryId(String firstCategoryId) {
        this.firstCategoryId = firstCategoryId;
    }

    public String getFirstCategoryName() {
        return firstCategoryName;
    }

    public void setFirstCategoryName(String firstCategoryName) {
        this.firstCategoryName = firstCategoryName;
    }

    public String getSecendCategoryId() {
        return secendCategoryId;
    }

    public void setSecendCategoryId(String secendCategoryId) {
        this.secendCategoryId = secendCategoryId;
    }

    public String getSecendCategoryName() {
        return secendCategoryName;
    }

    public void setSecendCategoryName(String secendCategoryName) {
        this.secendCategoryName = secendCategoryName;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}