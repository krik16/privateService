package com.rongyi.rss.solr;

import com.rongyi.easy.mcmc.param.SaleParamSolr;

import java.util.Date;
import java.util.List;

/**
 * Created by xuying on 2016/1/21.
 */
public interface CouponService {

    public boolean cleanCouponSecKill(String secKillSign);

    public boolean updateCouponSecKill(String couponId,String secKillSign,Date activityStartTime,Date activityEndTime);

    public boolean updateCouponSecKill(List<SaleParamSolr> coupons, String secKillSign);
}
