//package com.rongyi.rss.coupon.mall.life;
//
//import com.rongyi.core.bean.ResponseResult;
//
///**
// * 功能描述：摩生活 用户登陆领红包接口
// * @see MLUserRedenvelopeService
// * @author Breggor
// *         mallshop:ms
// */
//@Deprecated
//public interface MLCashCouponService {
//
//    /**
//     * 根据用户ID及现金ID检查是否已领过红包
//     * @see MLUserRedenvelopeService#checkReceivedCashCoupon(String, String)
//     * @param couponId
//     * @param userId
//     * @return
//     */
//    @Deprecated
//    boolean checkReceivedCashCoupon(String couponId, String userId);
//
//    /**
//     * 根据用户ID及现金ID领取红包
//     * @see MLUserRedenvelopeService#receiveCashCoupon(String, String)
//     * @param couponId
//     * @param userId
//     * @return ResponseResult{message:错误信息，info：boolean状态是否领取成功}
//     */
//    @Deprecated
//    ResponseResult receiveCashCoupon(String couponId, String userId);
//}