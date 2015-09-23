/**
 * 
 */
package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年9月23日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年9月23日 1.0 创建文件
 */
public class KillActivityListVO implements Serializable {

	private String showTitle;//活动名称

	private String continueTime;//持续时间

	private List<KillActivityVO> couponList;//代金券列表

	public String getShowTitle() {
		return showTitle;
	}

	public void setShowTitle(String showTitle) {
		this.showTitle = showTitle;
	}

	public String getContinueTime() {
		return continueTime;
	}

	public void setContinueTime(String continueTime) {
		this.continueTime = continueTime;
	}

	public List<KillActivityVO> getCouponList() {
		return couponList;
	}

	public void setCouponList(List<KillActivityVO> couponList) {
		this.couponList = couponList;
	}

	@Override
	public String toString() {
		return "KillActivityListVO [showTitle=" + showTitle + ", continueTime=" + continueTime + ", couponList=" + couponList
				+ "]";
	}

}
