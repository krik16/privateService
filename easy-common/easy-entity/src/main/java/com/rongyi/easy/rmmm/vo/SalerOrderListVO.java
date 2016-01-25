package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 卖家版大订单列表VO
 * @author zzp
 *
 */
public class SalerOrderListVO extends PageVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<SalerParentOrderVO> parentOrderList;//父订单列表

	public List<SalerParentOrderVO> getParentOrderList() {
		return parentOrderList;
	}

	public void setParentOrderList(List<SalerParentOrderVO> parentOrderList) {
		this.parentOrderList = parentOrderList;
	}

	@Override
	public String toString() {
		return "SalerOrderListVO{" +
				"parentOrderList=" + parentOrderList +
				'}';
	}
}
