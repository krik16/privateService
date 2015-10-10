package com.rongyi.rss.coupon;

import com.rongyi.easy.coupon.entity.old.Coupon;

/**
 * 优惠券数据同步到solr
 * 功能说明：新增优惠券，审核通过后，同步到solr
 * Created by Breggor on 2015/6/19.
 */
public interface CouponSynSolrService {
    /**
     * 优惠券同步solr
     *
     * @param coupon
     */
    boolean couponSynSolr(Coupon coupon);


    /**
     * 更新优惠券solr状态
     *
     * @param couponId
     * @param status
     */
    void updateSolrCouponStatus(String couponId, int status);
}
