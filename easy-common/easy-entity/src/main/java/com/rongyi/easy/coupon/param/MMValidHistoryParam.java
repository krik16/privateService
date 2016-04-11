package com.rongyi.easy.coupon.param;

import java.io.Serializable;
/**
 * 分页查询历史记录参数
 * @author hebo 07/01
 *
 */
public class MMValidHistoryParam implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer date;//时间（0所有时间，1当天，2当周，3当月，4昨天）
	private String shopId;//店铺id
	private String orderBy;//排序：（默认 update_time降序）
	private String orderVa;//排序方式:降序[-1]
	private Integer pageSize = 15;//默认15
	private Integer currentPage = 1;//当前页（后台处理）
	private String sellerId;//核销人id
	private Integer status;//0全部 1已发放 2处理中 3失败
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
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
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
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
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "MMValidHistoryParam [shopId=" + shopId + ", orderBy=" + orderBy
				+ ", orderVa=" + orderVa + ", pageSize=" + pageSize + ", status=" + status
				+ ", currentPage=" + currentPage + ", sellerId=" + sellerId
				+ "]";
	}
	
}
