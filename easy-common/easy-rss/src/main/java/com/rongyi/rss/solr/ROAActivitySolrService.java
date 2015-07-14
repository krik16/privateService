package com.rongyi.rss.solr;

import com.rongyi.easy.roa.entity.CouponEntity;

import java.util.List;

public interface ROAActivitySolrService {

//	public boolean updateActivity(SolrInputDocument doc);
	public boolean updateActivity(CouponEntity entityTmp,String id,List<String> picList,List<String> categoryIds);

	public void updateActivityStatus(String couponId,int status);

}
