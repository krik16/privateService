package com.rongyi.easy.coupon.vo;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/7/18 14:10
 * Package:com.rongyi.easy.coupon.vo
 * Project:easy-market
 */
public class CouponStockVO implements Serializable {
    private String couponId;
    private int stockCount;

    public CouponStockVO(String couponId, int stockCount) {
        this.couponId = couponId;
        this.stockCount = stockCount;
    }

    public CouponStockVO() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CouponStockVO{");
        sb.append("couponId='").append(couponId).append('\'');
        sb.append(", stockCount=").append(stockCount);
        sb.append('}');
        return sb.toString();
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }
}
