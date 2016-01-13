package com.rongyi.easy.ryoms.callcenter.vo;

import java.io.Serializable;
import java.util.List;

public class OrderReportResult implements Serializable {
	private List<OrderReportVo> OrderReportVo;
	private int count;
	/**
	 * @return the orderReportVo
	 */
	public List<OrderReportVo> getOrderReportVo() {
		return OrderReportVo;
	}
	/**
	 * @param orderReportVo the orderReportVo to set
	 */
	public void setOrderReportVo(List<OrderReportVo> orderReportVo) {
		OrderReportVo = orderReportVo;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
}
