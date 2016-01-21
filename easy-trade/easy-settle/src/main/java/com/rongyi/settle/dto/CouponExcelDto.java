package com.rongyi.settle.dto;

/**
 * Created by xgq on 2015/9/25.
 * Modified by ZhengYl on 2015/12/10
 */
public class CouponExcelDto {
    private String couponId;
    private String couponName;
    private String revenueType;
    private Integer couponCount;
    
    /** 券面额 */
    private Double couponPrice;
    
    /** 券面额合计 */
    private Double couponPriceTotal;
    
    /** 券折扣金额合计 */
    private Double couponDiscountTotal;
    
    /** 购券使用积分金额合计 */
    private Double couponScoreTotal;
    
    /** 购券使用红包金额合计 */
    private Double couponHbTotal;

    /** 店铺名称 */
    private String shopName;
    
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getRevenueType() {
        return revenueType;
    }

    public void setRevenueType(String revenueType) {
        this.revenueType = revenueType;
    }

    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    public Double getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(Double couponPrice) {
        this.couponPrice = couponPrice;
    }

	/**
	 * @return the couponPriceTotal
	 */
	public Double getCouponPriceTotal() {
		return couponPriceTotal;
	}

	/**
	 * @param couponPriceTotal the couponPriceTotal to set
	 */
	public void setCouponPriceTotal(Double couponPriceTotal) {
		this.couponPriceTotal = couponPriceTotal;
	}

	/**
	 * @return the couponDiscountTotal
	 */
	public Double getCouponDiscountTotal() {
		return couponDiscountTotal;
	}

	/**
	 * @param couponDiscountTotal the couponDiscountTotal to set
	 */
	public void setCouponDiscountTotal(Double couponDiscountTotal) {
		this.couponDiscountTotal = couponDiscountTotal;
	}

	/**
	 * @return the couponScoreTotal
	 */
	public Double getCouponScoreTotal() {
		return couponScoreTotal;
	}

	/**
	 * @param couponScoreTotal the couponScoreTotal to set
	 */
	public void setCouponScoreTotal(Double couponScoreTotal) {
		this.couponScoreTotal = couponScoreTotal;
	}

	/**
	 * @return the couponHbTotal
	 */
	public Double getCouponHbTotal() {
		return couponHbTotal;
	}

	/**
	 * @param couponHbTotal the couponHbTotal to set
	 */
	public void setCouponHbTotal(Double couponHbTotal) {
		this.couponHbTotal = couponHbTotal;
	}

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
