package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;

/**
 * 提供个app的券码验证相关接口
 *
 * @author hebo 2015/07/07
 */

public interface MMValidCouponCodeService {

    /**
     * 提供给手机端（mall-shop）的券码验证接口
     *
     * @param couponCode : 优惠券券码
     * @return ResponseResult 验码状态说明：验证失败[0],验证成功[1],已过期[2],已使用[3],系统异常[5]
     */
    ResponseResult checkCouponCode(String couponCode, String shopId, Integer sellerId);

}
