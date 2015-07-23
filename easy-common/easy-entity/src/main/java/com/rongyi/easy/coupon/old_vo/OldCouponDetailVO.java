package com.rongyi.easy.coupon.old_vo;

import java.io.Serializable;
import java.util.List;

/**
 * 优惠券详情
 */
public class OldCouponDetailVO implements Serializable{

    protected OldCoupon result;

    protected List<OldCoupon> other_activities;

    protected List<OldMallShopVO> apply_shops;


    public OldCoupon getResult() {
        return result;
    }

    public void setResult(OldCoupon result) {
        this.result = result;
    }

    public List<OldCoupon> getOther_activities() {
        return other_activities;
    }

    public void setOther_activities(List<OldCoupon> other_activities) {
        this.other_activities = other_activities;
    }

    public List<OldMallShopVO> getApply_shops() {
        return apply_shops;
    }

    public void setApply_shops(List<OldMallShopVO> apply_shops) {
        this.apply_shops = apply_shops;
    }
}
