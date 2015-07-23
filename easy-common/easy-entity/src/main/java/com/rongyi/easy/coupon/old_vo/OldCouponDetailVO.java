package com.rongyi.easy.coupon.old_vo;

import com.rongyi.easy.malllife.vo.Coupon;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 优惠券详情
 */
public class OldCouponDetailVO implements Serializable{

    protected Coupon result;

    protected ArrayList<OldCoupon> other_activities;

    protected ArrayList<OldMallShopVO> apply_shops;


    public Coupon getResult() {
        return result;
    }

    public void setResult(Coupon result) {
        this.result = result;
    }

    public ArrayList<OldCoupon> getOther_activities() {
        return other_activities;
    }

    public void setOther_activities(ArrayList<OldCoupon> other_activities) {
        this.other_activities = other_activities;
    }

    public ArrayList<OldMallShopVO> getApply_shops() {
        return apply_shops;
    }

    public void setApply_shops(ArrayList<OldMallShopVO> apply_shops) {
        this.apply_shops = apply_shops;
    }
}
