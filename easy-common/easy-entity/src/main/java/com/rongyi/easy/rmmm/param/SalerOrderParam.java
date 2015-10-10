package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.core.constant.Constants;

/**
 * 卖家版大订单列表参数 <<<<<<< HEAD <<<<<<< HEAD
 * 
 * @author zzp
 * 
 */
public class SalerOrderParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * private String status;// 订单状态 1待处理，2未付款，3已完成，4已关闭",
	 * 
	 * private String currentPage;// （要请求页）
	 * 
	 * private String pageSize;// 每页数据显示数量
	 */

	private String guideId;// 导购id
	private String status;// 订单状态 1待处理，2未付款，3已完成，4已关闭",

	private String currentPage;// （要请求页）

	private String pageSize;// 每页数据显示数量

	private Integer guideType;// 卖家类型 1是导购 2是买手

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

	public String getGuideId() {
		return guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	public Integer getGuideType() {
		return guideType;
	}

	public void setGuideType(Integer guideType) {
		this.guideType = guideType;
	}

}
