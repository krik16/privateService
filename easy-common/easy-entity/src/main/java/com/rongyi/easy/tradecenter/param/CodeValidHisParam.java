package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;

/**
 * ROA调用
 * 优惠券订单创建参数
 * 0元单、非0元单、扫码领券、翻牌购、推送
 * 使用场合：微信公众号优惠劵 互动屏优惠券 容易逛
 */
public class CodeValidHisParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1l;
	
	private Integer date;//时间（0所有时间，1当天，2当周，3当月，4昨天）
	private String shopId;//店铺id
	private String orderBy;//排序：（默认 update_time降序）
	private String orderVa;//排序方式:降序[-1]
	private Integer pageSize = 15;//默认15
	private Integer currentPage = 1;//当前页（后台处理）
	private String checkUserId;//核销人id
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrderVa() {
		return orderVa;
	}
	public void setOrderVa(String orderVa) {
		this.orderVa = orderVa;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	
	public String getCheckUserId() {
		return checkUserId;
	}
	public void setCheckUserId(String checkUserId) {
		this.checkUserId = checkUserId;
	}
	@Override
	public String toString() {
		return "CodeValidHisParam [shopId=" + shopId + ", orderBy=" + orderBy
				+ ", orderVa=" + orderVa + ", pageSize=" + pageSize
				+ ", currentPage=" + currentPage + ", checkUserId=" + checkUserId
				+ "]";
	}
}
