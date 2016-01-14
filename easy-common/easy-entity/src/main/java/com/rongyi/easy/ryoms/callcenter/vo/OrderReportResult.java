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
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年1月14日 下午5:51:13
	* @throws 
	*/
	@Override
	public String toString() {
		return "OrderReportResult [OrderReportVo=" + OrderReportVo + ", count=" + count + "]";
	}
}
