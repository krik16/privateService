package com.rongyi.easy.ryoms.callcenter.vo;

import java.io.Serializable;
import java.util.List;

public class UserOrderReportResult implements Serializable {
	
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -1677496260607762186L;
	private List<UserOrderReportVo> UserOrderReportVo;
	private int count;
	/**
	 * @return the userOrderReportVo
	 */
	public List<UserOrderReportVo> getUserOrderReportVo() {
		return UserOrderReportVo;
	}
	/**
	 * @param userOrderReportVo the userOrderReportVo to set
	 */
	public void setUserOrderReportVo(List<UserOrderReportVo> userOrderReportVo) {
		UserOrderReportVo = userOrderReportVo;
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
