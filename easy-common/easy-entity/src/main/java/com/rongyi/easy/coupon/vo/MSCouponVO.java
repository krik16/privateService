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

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZhengYl
 *
 */
public class MSCouponVO implements Serializable {
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
	 * 状态(审核中[0]、已上线[1]、已使用[2]、已过期[3]、已下线[4])
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
	 * true表示限购，false表示不限购
	 */
	private Boolean ifLimit;

	/**
	 * 店铺名称
	 */
    private String shopName;

    /**
	 * 商场名称
	 */
    private String mallName;

	/**
	 * 大运营[0] 商家[1]
	 */
	private Integer couponPublishChannel;

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
	 * @param ifLimit true表示限购，false表示不限购
	 * @param shopName 店铺名称
	 * @param mallName 商场名称
	 */
	public MSCouponVO(String couponId, String title, List<String> detailPicUrls, List<String> shopNameList, Double originalPrice,
					  Double currentPrice, String status, int usedAmount, int totalCount, Boolean ifLimit, String shopName, String mallName) {
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
		this.ifLimit = ifLimit;
		this.shopName = shopName;
		this.mallName = mallName;
	}

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
	 * @param ifLimit true表示限购，false表示不限购
	 * @param shopName 店铺名称
	 * @param mallName 商场名称
	 * @param couponPublishChannel 发布渠道
	 */
	public MSCouponVO(String couponId, String title, List<String> detailPicUrls, List<String> shopNameList, Double originalPrice,
					  Double currentPrice, String status, int usedAmount, int totalCount, Boolean ifLimit, String shopName, String mallName, Integer couponPublishChannel) {
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
		this.ifLimit = ifLimit;
		this.shopName = shopName;
		this.mallName = mallName;
		this.couponPublishChannel = couponPublishChannel;
	}

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
	public MSCouponVO(String couponId, String title, List<String> detailPicUrls, List<String> shopNameList, Double originalPrice,
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

	public Boolean getIfLimit() {
		return ifLimit;
	}

	public void setIfLimit(Boolean ifLimit) {
		this.ifLimit = ifLimit;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public Integer getCouponPublishChannel() {
		return couponPublishChannel;
	}

	public void setCouponPublishChannel(Integer couponPublishChannel) {
		this.couponPublishChannel = couponPublishChannel;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("couponId", couponId)
				.append("title", title)
				.append("listPicUrl", listPicUrl)
				.append("detailPicUrls", detailPicUrls)
				.append("shopNameList", shopNameList)
				.append("originalPrice", originalPrice)
				.append("currentPrice", currentPrice)
				.append("status", status)
				.append("usedAmount", usedAmount)
				.append("totalCount", totalCount)
				.append("ifLimit", ifLimit)
				.append("shopName", shopName)
				.append("mallName", mallName)
				.append("couponPublishChannel", couponPublishChannel)
				.toString();
	}
}
