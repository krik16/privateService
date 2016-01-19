package com.rongyi.rss.mallshop.order;

import com.rongyi.easy.osm.entity.OrderEventEntity;


public interface ROAOrderEventService {
	
	/**
	 * 根据事件类型查找
	 * @param type
	 * @param orderNum
	 * @return
	 * @throws Exception
	 */
	public OrderEventEntity getOrderEventByType(String type , String orderNum) throws Exception;

}
