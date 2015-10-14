package com.rongyi.rss.mallshop.order;

import java.util.List;

import com.rongyi.easy.tradecenter.osm.OrderDetailFormEntity;


public interface ROAOrderDetailFormService {
	
	/**
	 * 通过父订单号获得子订单集合
	 * @param list
	 * @return
	 */
	public List<OrderDetailFormEntity> selectByParentNum(String parentNum) throws Exception;

}
