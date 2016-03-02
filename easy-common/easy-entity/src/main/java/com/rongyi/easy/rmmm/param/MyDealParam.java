/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年5月28日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年5月28日 1.0 创建文件
 */
public class MyDealParam extends BaseParam implements Serializable {

	private String status;// 状态 0全部 1已发放 2处理中 3失败

	private String currentPage;

	private String pageSize;

	private String date;// 0所有时间1当天，2当周，3当月

	private String guideId;// 导购id
	
	private String orderNum;//订单号

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGuideId() {
		return guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	@Override
	public String toString() {
		return "MyDealParam{" +
				"status='" + status + '\'' +
				", currentPage='" + currentPage + '\'' +
				", pageSize='" + pageSize + '\'' +
				", date='" + date + '\'' +
				", guideId='" + guideId + '\'' +
				'}';
	}
}
