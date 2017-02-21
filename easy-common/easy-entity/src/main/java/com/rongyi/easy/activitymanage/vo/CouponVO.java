package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/12/23.
 */
public class CouponVO implements Serializable {
    /**
     * 卡卷id
     */
    private String couponId;
    /**
     * 卡卷名称
     */
    private String couponTitle;
    /**
     * 卡卷类型
     */
    private String couponType;

    /**
     * 库存
     */
    private Integer stock;



    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("couponId", couponId)
                .append("couponTitle", couponTitle)
                .append("couponType", couponType)
                .append("stock", stock)
                .toString();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponTitle() {
        return couponTitle;
    }

    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }
}
