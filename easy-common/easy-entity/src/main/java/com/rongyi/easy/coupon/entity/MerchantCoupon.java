package com.rongyi.easy.coupon.entity;

/**
 * Description:商家卡券
 * Author: 袁波
 * DATE: 2016/4/12 17:46
 * Package:com.rongyi.easy.coupon.entity
 * Project:easy-market
 */
public class MerchantCoupon extends Coupon{
    /**
     * 活动券关联表中，券的状态
     */
    private Integer activityStatus;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MerchantCoupon{");
        sb.append("activityStatus=").append(activityStatus);
        sb.append('}');
        return sb.toString();
    }
}
