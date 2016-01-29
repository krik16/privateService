package com.rongyi.easy.ryoms.callcenter.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.ryoms.callcenter.entity.OrderResultEntity;

/**
 * 客服工单查询结果列表
 * 
 * @author wangjianhua
 *
 */
public class OrderListVO implements Serializable {

	@Override
	public String toString() {
		return "OrderListVO [orderList=" + orderList + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4361836553426001014L;

	public List<OrderResultEntity> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<OrderResultEntity> orderList) {
		this.orderList = orderList;
	}

	private List<OrderResultEntity> orderList = null;
}
