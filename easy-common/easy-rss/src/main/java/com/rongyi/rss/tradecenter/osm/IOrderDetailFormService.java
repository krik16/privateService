package com.rongyi.rss.tradecenter.osm;

import com.rongyi.easy.tradecenter.osm.OrderDetailFormEntity;

import java.util.List;

public interface IOrderDetailFormService {
	
	/**
	 * 通过父订单号获得子订单集合
	 * @param parentNum
	 * @return	List
	 */
	public List<OrderDetailFormEntity> selectByParentNum(String parentNum) throws Exception;

}
