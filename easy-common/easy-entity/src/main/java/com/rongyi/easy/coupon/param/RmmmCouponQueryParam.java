/** 
 * @Title: RmmmCouponQueryParam.java 
 * @Package com.rongyi.easy.coupon.param 
 * @Description: RMMM查询红包动作的请求参数封装
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年4月24日 下午4:19:40 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.easy.coupon.param;

import java.io.Serializable;

/**
 * @author ZhengYl
 * 
 */
public class RmmmCouponQueryParam implements Serializable {

	/**
	 * 当前页
	 */
	private Integer currentPage;

	/**
	 * 页大小
	 */
	private Integer pageSize;

	/**
	 * 店铺ID
	 */
	private String shopId;

	/**
	 * 红包状态
	 */
	private String status;

	/**
	 * 优惠券券码
	 */
	private String couponCode;

	/**
	 * 优惠券Id
	 */
	private String couponId;

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

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

}
