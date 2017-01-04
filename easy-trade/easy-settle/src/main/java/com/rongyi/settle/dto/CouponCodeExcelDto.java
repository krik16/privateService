package com.rongyi.settle.dto;

/**
 * Created by xgq on 2015/9/25.
 * Modified by erliang
 */
public class CouponCodeExcelDto {
    private String orderNo;
    private String payNo;
    private String validTime;
    private String orderTime;
    private String couponCode;
    private String couponName;
    private String revenueType;
    private String payChannel;
    private Double origPrice;//
    private Double payAmount;//
    private Double hbAmount;//
    private Double discountAmount;//
    private String buyerPhone;
    private String mallName;
    private String shopName;
    private String buyerName;
    private String guideName;
    private String guidePhone;
    private String source;
    private String couponDiscountType;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /** 使用积分金额 */
    private Double scoreAmount;

    /**
	 * @return the scoreAmount
	 */
	public Double getScoreAmount() {
		return scoreAmount;
	}

	/**
	 * @param scoreAmount the scoreAmount to set
	 */
	public void setScoreAmount(Double scoreAmount) {
		this.scoreAmount = scoreAmount;
	}

	public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Double getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Double origPrice) {
        this.origPrice = origPrice;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Double getHbAmount() {
        return hbAmount;
    }

    public void setHbAmount(Double hbAmount) {
        this.hbAmount = hbAmount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getGuidePhone() {
        return guidePhone;
    }

    public void setGuidePhone(String guidePhone) {
        this.guidePhone = guidePhone;
    }

    public String getCouponDiscountType() {
        return couponDiscountType;
    }

    public void setCouponDiscountType(String couponDiscountType) {
        this.couponDiscountType = couponDiscountType;
    }
}
