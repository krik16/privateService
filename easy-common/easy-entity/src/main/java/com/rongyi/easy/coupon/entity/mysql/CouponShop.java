package com.rongyi.easy.coupon.entity.mysql;

public class CouponShop {
    private Integer id;

    /**
     * 卡券id
     */
    private Integer couponId;

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 店铺名
     */
    private String shopName;

    /**
     * 店铺所在商场名
     */
    private String shopMallName;

    /**
     * 店铺logo
     */
    private String shopLogoUrl;

    /**
     * 店铺品牌
     */
    private String shopBrand;

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
}
