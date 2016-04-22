package com.rongyi.rss.solr;

import com.rongyi.easy.mcmc.param.SaleParamSolr;

import java.util.Date;
import java.util.List;

/**
 * Created by xuying on 2016/1/21.
 */
public interface CouponService {

    /**
     * secKillSign秒杀id
     * @param secKillSign
     * @return
     */
    public boolean cleanCouponSecKill(String secKillSign);

    /**
     * 设置优惠券秒杀标记 秒杀开始时间结束时间
     * @param couponId
     * @param secKillSign
     * @param activityStartTime
     * @param activityEndTime
     * @return
     */
    public boolean updateCouponSecKill(String couponId,String secKillSign,Date activityStartTime,Date activityEndTime);

    /**
     * 批量修改优惠券秒杀id 秒杀开始时间结束时间
     * @param coupons
     * @param secKillSign
     * @return
     */
    public boolean updateCouponSecKill(List<SaleParamSolr> coupons, String secKillSign);
}
