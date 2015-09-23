package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;

/**
 * 功能描述：摩生活 用户登陆领现金券接口
 *
 * @author Breggor
 *         mallshop:ms
 */
public interface MLCashCouponService {

    /**
     * 根据用户ID及现金ID检查是否已领过现金券
     *
     * @param couponId
     * @param userId
     * @return
     */
    boolean checkReceivedCashCoupon(String couponId, String userId);

    /**
     * 根据用户ID及现金ID领取现金券
     *
     * @param couponId
     * @param userId
     * @return ResponseResult{message:错误信息，info：boolean状态是否领取成功}
     */
    ResponseResult receiveCashCoupon(String couponId, String userId);
}