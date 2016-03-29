package com.rongyi.rss.mallshop.express;

public interface ROAExpressSubscribeService {
	
	/**
	 * 查询订阅成功的订阅记录
	 * @param expressOrderInfoId 物流信息主键id
	 * @return
	 * @throws Exception
	 */
	public String selectSubscribeByExpressOrderInfoId(String expressOrderInfoId)throws Exception;

}
