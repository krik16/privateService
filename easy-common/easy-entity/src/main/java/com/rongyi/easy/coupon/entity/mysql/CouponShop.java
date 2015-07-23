package com.rongyi.easy.coupon.entity.mysql;

public class CouponShop {
    private Integer id;

    private String shopId;

    private String shopName;

    private String shopMallName;

    private String shopLogoUrl;

    private String shopBrand;

    private Integer couponId;

    private Byte enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopMallName() {
        return shopMallName;
    }

    public void setShopMallName(String shopMallName) {
        this.shopMallName = shopMallName;
    }

    public String getShopLogoUrl() {
        return shopLogoUrl;
    }

    public void setShopLogoUrl(String shopLogoUrl) {
        this.shopLogoUrl = shopLogoUrl;
    }

    public String getShopBrand() {
        return shopBrand;
    }

    public void setShopBrand(String shopBrand) {
        this.shopBrand = shopBrand;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }
}
