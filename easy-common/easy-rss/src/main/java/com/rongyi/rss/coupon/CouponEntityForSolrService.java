/** 
* @Title: CouponEntityServiceForSolr.java 
* @Package com.rongyi.rss.coupon 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年9月24日 下午6:39:55 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.coupon;

import com.rongyi.easy.roa.entity.CouponEntity;

/**
 * @author ZhengYl
 *
 */
public interface CouponEntityForSolrService {
    /**
     * solr通过活动id获取活动信息
     * 
     * @author ZhengYl
     * @date 2015年9月24日 下午6:28:32 
     * @param activityId
     * @return
     */
    CouponEntity getActivityById(String activityId);
}
