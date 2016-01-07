/**
 * 
 */
package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年9月23日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年9月23日 1.0 创建文件
 */
public class KillActivityListVO implements Serializable {
	
	private String showTime;//格式 2015-12-14 11:00

	private String showTitle;//活动名称

	private Integer continueTime;//持续时间
	
	private String message;//预留字段

	private List<KillActivityVO> couponList;//代金券列表

	public String getShowTitle() {
		return showTitle;
	}

	public void setShowTitle(String showTitle) {
		this.showTitle = showTitle;
	}

	public Integer getContinueTime() {
		return continueTime;
	}

	public void setContinueTime(Integer continueTime) {
		this.continueTime = continueTime;
	}

	public List<KillActivityVO> getCouponList() {
		return couponList;
	}

	public void setCouponList(List<KillActivityVO> couponList) {
		this.couponList = couponList;
	}
	
	

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "KillActivityListVO [showTime=" + showTime + ", showTitle=" + showTitle + ", continueTime=" + continueTime
				+ ", message=" + message + ", couponList=" + couponList + "]";
	}

}
