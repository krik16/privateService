package com.rongyi.easy.coupon.param;

import java.io.Serializable;
/**
 * 分页查询历史记录参数
 * @author hebo 07/01
 *
 */
public class MMValidHistoryParam implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String shopId;//店铺id
	private String orderBy;//排序：（默认 update_time降序）
	private String orderVa;//排序方式:降序[-1]
	private Integer pageSize;//默认15
	private Integer currentPage;//当前页（后台处理）
	private String sellerId;//卖家id
	
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
	@Override
	public String toString() {
		return "MMValidHistoryParam [shopId=" + shopId + ", orderBy=" + orderBy
				+ ", orderVa=" + orderVa + ", pageSize=" + pageSize
				+ ", currentPage=" + currentPage + ", sellerId=" + sellerId
				+ "]";
	}
	
}
