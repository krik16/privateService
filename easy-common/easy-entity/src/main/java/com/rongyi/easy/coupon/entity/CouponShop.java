package com.rongyi.easy.coupon.entity;

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
    private String couponId;

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 店铺名
     */
    private String shopName;
    private String shopAddress;
    private String shopBulding;
    private String shopFloor;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("couponId", couponId).append("shopId", shopId).append("shopName", shopName).append("shopAddress", shopAddress).append("shopBulding", shopBulding).append("shopFloor", shopFloor).toString();
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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
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



    public CouponShop(String couponId, String shopId) {

        this.couponId = couponId;
        this.shopId = shopId;
    }

    public CouponShop(String couponId, String shopId, String shopName) {
        this.couponId = couponId;
        this.shopId = shopId;
        this.shopName = shopName;
    }

    public CouponShop() {

    }
}
