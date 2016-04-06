package com.rongyi.easy.rmmm.param;

import java.util.List;

import com.rongyi.easy.rmmm.base.BaseParam;

public class CouponParam extends BaseParam{

	private String couponCode;// 卡券码
	
	private String couponId;// 卡券Id
	
	private Integer num;//数量
	
	private Integer currentPage;
	
	private Integer pageSize;
	
	private String orderId;//订单号
	
	private List<Double> userLocation;//用户地理位置
	
	private String shopId;//店铺mongoid

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<Double> getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(List<Double> userLocation) {
		this.userLocation = userLocation;
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
