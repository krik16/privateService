/**
 * @Title: DrawApplySearchParam.java
 * @Package com.rongyi.easy.tms.vo
 * @Description: TODO
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月28日 下午1:18:05
 * @version V1.0
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.easy.tms.vo;

import java.io.Serializable;

/**
 * @author ZhengYl
 *
 */
public class DrawApplySearchParam implements Serializable{

	private static final long serialVersionUID = 1L;

	/** 用户Id */
	private String userId;

	/** 当前页 */
	private Integer currentPage;

	/** 每页大小 */
	private Integer pageSize;

	/** 时间范围（1：当天，2：当周，3：当月） com.rongyi.core.constant.Constants.TMSTimeRangeType*/
	private Integer timeRange;

	/** 状态 */
	private Integer status;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTimeRange() {
		return timeRange;
	}

	public void setTimeRange(Integer timeRange) {
		this.timeRange = timeRange;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}


}
