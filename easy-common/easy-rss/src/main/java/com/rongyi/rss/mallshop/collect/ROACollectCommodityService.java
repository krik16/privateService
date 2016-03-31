package com.rongyi.rss.mallshop.collect;

import org.bson.types.ObjectId;

import com.rongyi.easy.rmmm.param.CollectCommodityParam;


public interface ROACollectCommodityService {
	
	/**
	 * 收藏商品
	 * @param param
	 * @param userId
	 * @throws Exception
	 */
	public void collectCommodity(CollectCommodityParam param,String userId) throws Exception;
	
	/**
	 * 取消收藏商品
	 * @param param
	 * @param userId
	 * @throws Exception
	 */
	public void cancelcollectCommodity(CollectCommodityParam param,String userId) throws Exception;
}
