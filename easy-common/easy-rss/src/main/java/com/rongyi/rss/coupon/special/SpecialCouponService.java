package com.rongyi.rss.coupon.special;

import com.rongyi.easy.coupon.entity.SpecialCoupon;

import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/7/26 11:38
 * Package:com.rongyi.rss.coupon
 * Project:easy-market
 */
public interface SpecialCouponService {
    public List<SpecialCoupon> findAll();

    public int batchInsert(List<String> coupons);

    public int batchUpdate(List<String> coupons);
}
