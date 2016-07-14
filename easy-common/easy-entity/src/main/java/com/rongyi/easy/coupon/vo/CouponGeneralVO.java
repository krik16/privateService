package com.rongyi.easy.coupon.vo;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/6/28 16:21
 * Package:com.rongyi.easy.coupon.vo
 * Project:easy-market
 */
public class CouponGeneralVO implements Serializable{
    /**
     * 券id
     */
    private String couponId;

    /**
     * 是否是通用券 true 是通用券；false 不是
     */
    private Boolean isGeneral;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Boolean getIsGeneral() {
        return isGeneral;
    }

    public void setIsGeneral(Boolean isGeneral) {
        this.isGeneral = isGeneral;
    }

    public CouponGeneralVO() {
    }

    public CouponGeneralVO(String couponId, Boolean isGeneral) {
        this.couponId = couponId;
        this.isGeneral = isGeneral;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CouponGeneralVO{");
        sb.append("couponId='").append(couponId).append('\'');
        sb.append(", isGeneral=").append(isGeneral);
        sb.append('}');
        return sb.toString();
    }
}
