package com.rongyi.rss.solr;

import java.util.List;

import org.apache.solr.common.SolrInputDocument;

import com.rongyi.easy.roa.vo.CouponVO;

public interface ROAActivitySolrService {

    //	public boolean updateActivity(SolrInputDocument doc);
	public boolean updateActivity(CouponVO couponVO, String id, List<String> picList, List<String> categoryIds, List<String> customCatIds, int limitCount);

    public void updateActivityStatus(String couponId, int status);

	/**
	 * 直播距离排序
	 * 
	 * @author ZhengYl
	 * @date 2015年10月26日 下午10:18:07 
	 * @param idList
	 * @param position
	 * @param rows
	 */
	public List<String> sortLiveByLocation(List<String> idList, List<Double> position, Integer rows);

	/**
	 * 获取卡券doc列表
	 * @param couponVO			卡券VO
	 * @param id				卡券ID
	 * @param picList			图片列表
	 * @param categoryIds		分类ID列表
	 * @param customCatIds		自定义分类ID列表
	 * @param limitCount		
	 * @return
	 */
	public SolrInputDocument getCouponDocument(CouponVO couponVO, String id, List<String> picList,
			List<String> convertToString, List<String> customCatIds, int limitCount);
}
