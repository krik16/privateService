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
	private String status;// 订单状态 订单状态  1待处理，2未付款，3已完成，4已关闭"（店铺）  6待处理，7未付款，8已完成，9已关闭 10买家在店铺的未付款订单 11昨日的所有订单",（导购）

	private String currentPage;// （要请求页）

	private String pageSize;// 每页数据显示数量

	private Integer guideType;// 卖家类型 1是导购 2是买手

	private String buyerId;//买家id
	
	private String buyerIM;//买家IM账号

	public SalerOrderParam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalerOrderParam(String guideId, String status, String currentPage, String pageSize) {
		super();
		this.guideId = guideId;
		this.status = status;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}

	public String getBuyerIM() {
		return buyerIM;
	}

	public void setBuyerIM(String buyerIM) {
		this.buyerIM = buyerIM;
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

	public String getBuyerId()
	{
		return buyerId;
	}

	public void setBuyerId(String buyerId)
	{
		this.buyerId = buyerId;
	}

	@Override
	public String toString() {
		return "SalerOrderParam{" +
				"guideId='" + guideId + '\'' +
				", status='" + status + '\'' +
				", currentPage='" + currentPage + '\'' +
				", pageSize='" + pageSize + '\'' +
				", guideType=" + guideType +
				", buyerId=" + buyerId +
				", buyerIM=" + buyerIM +
				'}';
	}
}
