package com.rongyi.easy.rmmm.param;

import com.rongyi.easy.rmmm.base.BaseParam;

public class CouponParam extends BaseParam{

	private String couponCode;// 卡券码
	
	private String couponId;// 卡券Id
	
	private Integer num;//数量
	
	private Integer currentPage;
	
	private Integer pageSize;
	
	private String orderId;//订单号

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

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "CouponParam [couponCode=" + couponCode + ", couponId=" + couponId + ", num=" + num + ", currentPage="
				+ currentPage + ", pageSize=" + pageSize + ", orderId=" + orderId + "]";
	}

}
