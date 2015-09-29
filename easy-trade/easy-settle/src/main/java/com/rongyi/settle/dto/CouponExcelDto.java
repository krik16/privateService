package com.rongyi.settle.dto;

/**
 * Created by xgq on 2015/9/25.
 */
public class CouponExcelDto {
    private String couponName;
    private String revenueType;
    private Integer couponCount;
    private Double couponPrice;
    private Double couponTotalAmount;
    private Double couponPayAmount;

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

    public Double getCouponTotalAmount() {
        return couponTotalAmount;
    }

    public void setCouponTotalAmount(Double couponTotalAmount) {
        this.couponTotalAmount = couponTotalAmount;
    }

    public Double getCouponPayAmount() {
        return couponPayAmount;
    }

    public void setCouponPayAmount(Double couponPayAmount) {
        this.couponPayAmount = couponPayAmount;
    }
}
