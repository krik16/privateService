package com.rongyi.easy.coupon.entity.mysql;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class CouponShop implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

    private String shopAddress;
    private String shopBulding;
    private String shopFloor;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("couponId", couponId).append("shopId", shopId).append("shopName", shopName).append("shopMallName", shopMallName).append("shopLogoUrl", shopLogoUrl).append("shopBrand", shopBrand).append("shopAddress", shopAddress).append("shopBulding", shopBulding).append("shopFloor", shopFloor).toString();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopBulding() {
        return shopBulding;
    }

    public void setShopBulding(String shopBulding) {
        this.shopBulding = shopBulding;
    }

    public String getShopFloor() {
        return shopFloor;
    }

    public void setShopFloor(String shopFloor) {
        this.shopFloor = shopFloor;
    }

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

    public CouponShop(Integer couponId, String shopId, String shopName, String shopMallName, String shopLogoUrl, String shopBrand) {
        this.couponId = couponId;
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopMallName = shopMallName;
        this.shopLogoUrl = shopLogoUrl;
        this.shopBrand = shopBrand;
    }

    public CouponShop(Integer couponId, String shopId) {

        this.couponId = couponId;
        this.shopId = shopId;
    }

    public CouponShop(Integer couponId, String shopId, String shopName) {
        this.couponId = couponId;
        this.shopId = shopId;
        this.shopName = shopName;
    }

    public CouponShop() {

    }
}
