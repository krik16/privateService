package com.rongyi.rss.solr;

import com.rongyi.easy.roa.vo.CouponVO;

import java.util.List;

public interface ROAActivitySolrService {

    //	public boolean updateActivity(SolrInputDocument doc);
    public boolean updateActivity(CouponVO couponVO, String id, List<String> picList, List<String> categoryIds, int limitCount);

    public void updateActivityStatus(String couponId, int status);

}
