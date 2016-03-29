package com.rongyi.rss.mallshop.express;

import com.rongyi.easy.rmmm.entity.ExpressSubscribeEntity;

public interface ROAExpressSubscribeService {
	
	/**
	 * 查询订阅成功的订阅记录
	 * @param expressOrderInfoId 物流信息主键id
	 * @return
	 * @throws Exception
	 */
	public ExpressSubscribeEntity selectSubscribeByExpressOrderInfoId(String expressOrderInfoId)throws Exception;

}
