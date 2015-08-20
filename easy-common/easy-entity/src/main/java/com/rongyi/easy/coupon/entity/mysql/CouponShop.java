package com.rongyi.easy.coupon.entity.mysql;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponShop [id=").append(id).append(", couponId=").append(couponId).append(", shopId=")
				.append(shopId).append(", shopName=").append(shopName).append(", shopMallName=").append(shopMallName)
				.append(", shopLogoUrl=").append(shopLogoUrl).append(", shopBrand=").append(shopBrand).append("]");
		return builder.toString();
	}
    
}
