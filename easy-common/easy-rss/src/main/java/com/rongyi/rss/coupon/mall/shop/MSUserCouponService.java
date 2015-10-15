package com.rongyi.rss.coupon.mall.shop;

import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.coupon.vo.MMUserCouponVO;

/**
 * 摩店-代金券接口
 * Created by Breggor on 2015/10/13.
 */
public interface MSUserCouponService {
    /**
     * 根据券码查询代金券
     *
     * @param couponCode
     * @return
     */
    UserCoupon findUserCouponByCode(String couponCode);

    MMUserCouponVO getUserCouponByCouponCode(String couponCode);
}
