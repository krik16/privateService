package com.rongyi.rss.coupon;

import com.rongyi.easy.coupon.entity.CouponChannel;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/7/6 13:43
 * Package:com.rongyi.rss.coupon
 * Project:easy-market
 */
public interface CouponChannelService {
    public CouponChannel findByCode(String code, Integer type);

    public int insert(CouponChannel couponChannel);
}
