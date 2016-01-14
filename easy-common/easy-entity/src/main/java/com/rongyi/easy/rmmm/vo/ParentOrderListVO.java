package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class ParentOrderListVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ParentOrderVO> parentOrderList;// 我的订单列表

	private String totalNum;// 总订单数

	public List<ParentOrderVO> getParentOrderList() {
		return parentOrderList;
	}

	public void setParentOrderList(List<ParentOrderVO> parentOrderList) {
		this.parentOrderList = parentOrderList;
	}

	public String getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

	@Override
	public String toString() {
		return "ParentOrderListVO{" +
				"parentOrderList=" + parentOrderList +
				", totalNum='" + totalNum + '\'' +
				'}';
	}
}
