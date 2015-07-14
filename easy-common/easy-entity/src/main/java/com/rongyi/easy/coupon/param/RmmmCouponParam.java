/** 
 * @Title: CouponParam.java 
 * @Package com.rongyi.easy.coupon.param 
 * @Description: RMMM创建优惠券传入参数的封装
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年4月23日 上午10:57:02 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.easy.coupon.param;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author ZhengYl
 *
 */
public class RmmmCouponParam implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 券名称
	 */
	private String title;

	/**
	 * 总量
	 */
	private Integer totalCount;

	/**
	 * 每人限购数量
	 */
	private Integer limitCount;

	/**
	 * 原价
	 */
	private Double originalPrice;

	/**
	 * 现价
	 */
	private Double currentPrice;

	/**
	 * 发布开始时间 格式："yyyy-MM-dd";
	 */
	private String publishBeginDate;

	/**
	 * 发布结束时间 格式："yyyy-MM-dd";
	 */
	private String publishEndDate;

	/**
	 * 有效期开始时间 格式："yyyy-MM-dd";
	 */
	private String validBeginDate;

	/**
	 * 有效期结束时间 格式："yyyy-MM-dd";
	 */
	private String validEndDate;

	/**
	 * 使用限制
	 */
	private String useRestriction;

	/**
	 * 使用说明
	 */
	private String useDescription;

	/**
	 * 详情图url列表(0-4)张
	 */
	private List<String> detailPicUrls;

	/**
	 * 关联店铺集合 店铺id串
	 */
	private String shopId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getLimitCount() {
		return limitCount;
	}

	public void setLimitCount(Integer limitCount) {
		this.limitCount = limitCount;
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

	public String getPublishBeginDate() {
		return publishBeginDate;
	}

	public void setPublishBeginDate(String publishBeginDate) {
		this.publishBeginDate = publishBeginDate;
	}

	public String getPublishEndDate() {
		return publishEndDate;
	}

	public void setPublishEndDate(String publishEndDate) {
		this.publishEndDate = publishEndDate;
	}

	public String getValidBeginDate() {
		return validBeginDate;
	}

	public void setValidBeginDate(String validBeginDate) {
		this.validBeginDate = validBeginDate;
	}

	public String getValidEndDate() {
		return validEndDate;
	}

	public void setValidEndDate(String validEndDate) {
		this.validEndDate = validEndDate;
	}

	public String getUseRestriction() {
		return useRestriction;
	}

	public void setUseRestriction(String useRestriction) {
		this.useRestriction = useRestriction;
	}

	public String getUseDescription() {
		return useDescription;
	}

	public void setUseDescription(String useDescription) {
		this.useDescription = useDescription;
	}

	public List<String> getDetailPicUrls() {
		return detailPicUrls;
	}

	public void setDetailPicUrls(List<String> detailPicUrls) {
		this.detailPicUrls = detailPicUrls;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("title", title).append("totalCount", totalCount)
				.append("limitCount", limitCount).append("originalPrice", originalPrice)
				.append("currentPrice", currentPrice).append("publishBeginDate", publishBeginDate)
				.append("publishEndDate", publishEndDate).append("validBeginDate", validBeginDate)
				.append("validEndDate", validEndDate).append("useRestriction", useRestriction)
				.append("useDescription", useDescription).append("detailPicUrls", detailPicUrls)
				.append("shopId", shopId).toString();
	}

}
