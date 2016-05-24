package com.rongyi.rss.rule;

/**
 * Created by yujisun on 2016/5/20.
 */
public interface ICouponCheckService
{

    /**
     * 校验奖品券码
     *
     * @param couponCode 券码
     * @param mallId 验券商场id
     * @param shopId 验券店铺id
     * @param useMode 校验方式
     * @param source 校验来源（PA/APP）
     * @param sellerId 校验人id
     */
    boolean checkCoupon(String couponCode, String mallId, String shopId, Long useMode, String source, Integer sellerId);

    /**
     * 校验活动邀请码
     *
     * @param inviteCode 邀请码
     * @param activityId 活动id
     * @param terminal 活动终端 1app 2微商城 3标准微信 4互动屏
     * @return 是否成功
     */
    boolean checkCoupon(String inviteCode, String activityId, Integer terminal);
}
