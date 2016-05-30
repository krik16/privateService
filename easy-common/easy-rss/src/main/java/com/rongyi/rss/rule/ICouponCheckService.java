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
}
