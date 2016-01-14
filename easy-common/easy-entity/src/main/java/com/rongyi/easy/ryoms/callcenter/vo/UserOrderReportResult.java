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
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年1月14日 下午5:51:57
	* @throws 
	*/
	@Override
	public String toString() {
		return "UserOrderReportResult [UserOrderReportVo=" + UserOrderReportVo + ", count=" + count + "]";
	}
}
