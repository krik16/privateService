package com.rongyi.settle.dto;

/**
 * Created by xgq on 2015/9/25.
 */
public class CouponExcelDto {
    private String couponName;
    private String revenueType;
    private Integer couponCount;
    private Integer couponPrice;
    private Integer couponTotalAmount;

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

    public Integer getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(Integer couponPrice) {
        this.couponPrice = couponPrice;
    }

    public Integer getCouponTotalAmount() {
        return couponTotalAmount;
    }

    public void setCouponTotalAmount(Integer couponTotalAmount) {
        this.couponTotalAmount = couponTotalAmount;
    }
}
