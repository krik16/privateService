/**
 * 
 */
package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年9月23日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年9月23日 1.0 创建文件
 */
public class KillActivityVO implements Serializable {

	private String couponId;
	private String title;
	private String currentPrice;
	private String originalPrice;
	private String picUrl;
	private String shopName;
	private String mallName;
	private Integer limitPublishCount;
	private Integer limitCount;
	private List<Double> location;// 店铺的 经纬度
	private int couponNum;// 剩余库存
	private String type = "1";//”1代金券 2商品”

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
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

	public Integer getLimitPublishCount() {
		return limitPublishCount;
	}

	public void setLimitPublishCount(Integer limitPublishCount) {
		this.limitPublishCount = limitPublishCount;
	}

	public Integer getLimitCount() {
		return limitCount;
	}

	public void setLimitCount(Integer limitCount) {
		this.limitCount = limitCount;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public int getCouponNum() {
		return couponNum;
	}

	public void setCouponNum(int couponNum) {
		this.couponNum = couponNum;
	}

	@Override
	public String toString() {
		return "KillActivityVO [couponId=" + couponId + ", title=" + title + ", currentPrice=" + currentPrice
				+ ", originalPrice=" + originalPrice + ", picUrl=" + picUrl + ", shopName=" + shopName + ", mallName=" + mallName
				+ ", limitPublishCount=" + limitPublishCount + ", limitCount=" + limitCount + ", location=" + location
				+ ", couponNum=" + couponNum + ", type=" + type + "]";
	}

}
