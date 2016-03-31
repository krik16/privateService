package com.rongyi.rss.msob;

import java.util.List;

import com.rongyi.easy.osm.entity.OrderDetailFormEntity;

public interface IOrderDetailFormService {

	/**
	 * 通过父订单号获得子订单集合
	 * @param parentNum
	 * @return
	 */
	public List<OrderDetailFormEntity> selectByParentNum(String parentNum) throws Exception;

}
