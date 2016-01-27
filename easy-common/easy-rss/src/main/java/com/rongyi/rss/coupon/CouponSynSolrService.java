package com.rongyi.rss.coupon;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.solr.ActivityDocument;

import java.util.List;

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
     * 状态：上架[0],下架[1]
     * @param couponId
     * @param status
     */
    boolean updateSolrCouponStatus(String couponId, int status);

    /**
     * 查询activity表总记录数
     * @return
     */
    public long getActivityCount();

    /**
     * 把activity对象转换成solr对象
     * @param skip
     * @param pageSize
     * @return
     * @throws Exception
     */
    public List<ActivityDocument> getActivityDocumentList(int skip,int pageSize) throws Exception;

    public ActivityDocument getActivityDocument(String activityMid);

}
