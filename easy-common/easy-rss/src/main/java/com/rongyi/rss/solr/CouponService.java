package com.rongyi.rss.solr;

import java.util.Date;

/**
 * Created by xuying on 2016/1/21.
 */
public interface CouponService {

    public boolean cleanCouponSecKill(String secKillSign);

    public boolean updateCouponSecKill(String couponId,String secKillSign,Date activityStartTime,Date activityEndTime);
}
