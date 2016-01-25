package com.rongyi.rss.tradecenter.osm;

import com.rongyi.easy.osm.entity.OrderEventEntity;

public interface IOrderEventService {
	
	/**
	 * 根据事件类型查找
	 * @param type
	 * @param orderNum
	 * @return
	 * @throws Exception
	 */
	public OrderEventEntity getOrderEventByType(String type, String orderNum) throws Exception;

}
