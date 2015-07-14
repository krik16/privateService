/** 
 * @Title: RmmmCouponQueryParam.java 
 * @Package com.rongyi.easy.coupon.param 
 * @Description: RMMM查询优惠券返回结果的封装
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年4月23日 下午4:42:32 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.easy.coupon.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZhengYl
 *
 */
public class RmmmCouponVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 优惠券Id
	 */
	private String couponId;

	/**
	 * 券名称
	 */
	private String title;

	/**
	 * 列表图url
	 */
	private String listPicUrl;

	/**
	 * 详情图url
	 */
	private List<String> detailPicUrls;

	/**
	 * 店铺名称
	 */
	private List<String> shopNameList;

	/**
	 * 原价
	 */
	private Double originalPrice;

	/**
	 * 现价
	 */
	private Double currentPrice;

	/**
	 * 状态(审核中、已上线、已过期、已下线、已使用)
	 */
	private String status;


	/**
	 * 已使用次数
	 */
	private int usedAmount;

	/**
	 * 优惠券总量
	 */
	private int  totalCount;



	/**
	 * @param  couponId 卡券Id
	 * @param title 卡券名称
	 * @param detailPicUrls 详图列表
	 * @param shopNameList  店铺名列表
	 * @param originalPrice 原价
	 * @param currentPrice 现价
	 * @param status 状态
	 * @param usedAmount 已购数量
	 * @param totalCount 总量
	 */
	public RmmmCouponVO(String couponId, String title, List<String> detailPicUrls, List<String> shopNameList, Double originalPrice,
						Double currentPrice, String status, int usedAmount, int totalCount) {
		super();
		this.couponId = couponId;
		this.title = title;
		this.detailPicUrls = detailPicUrls;
		this.shopNameList = shopNameList;
		this.originalPrice = originalPrice;
		this.currentPrice = currentPrice;
		this.status = status;
		this.usedAmount = usedAmount;
		this.totalCount  = totalCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getUsedAmount() {
		return usedAmount;
	}

	public void setUsedAmount(int usedAmount) {
		this.usedAmount = usedAmount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getListPicUrl() {
		return listPicUrl;
	}

	public void setListPicUrl(String listPicUrl) {
		this.listPicUrl = listPicUrl;
	}

	public List<String> getShopNameList() {
		return shopNameList;
	}

	public void setShopNameList(List<String> shopNameList) {
		this.shopNameList = shopNameList;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getDetailPicUrls() {
		return detailPicUrls;
	}

	public void setDetailPicUrls(List<String> detailPicUrls) {
		this.detailPicUrls = detailPicUrls;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
}
