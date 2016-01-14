/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public class RebateCouponVO implements Serializable{
	
	private String couponId;//代金券id
	
	private String title;//代金券名称
	
	private String shopName;//店铺名称
	
	private Double currentPrice;//现价

	private Double originalPrice;//原价
	
	private Integer sold;//销量
	
	private String thumbnail;//列表图url
	
	private List<Double> location;//代金券所在位置
	
	private Double distance = 0.0;//距离
	
	private Boolean ifLimit = false;//true表示限购，false表示不限购”(Boolean型)

	public Boolean getIfLimit() {
		return ifLimit;
	}

	public void setIfLimit(Boolean ifLimit) {
		this.ifLimit = ifLimit;
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

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Integer getSold() {
		return sold;
	}

	public void setSold(Integer sold) {
		this.sold = sold;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "RebateCouponVO [couponId=" + couponId + ", title=" + title + ", shopName=" + shopName + 
				", currentPrice=" + currentPrice + ", originalPrice=" + originalPrice + ", sold=" + sold + ", thumbnail="
				+ thumbnail + ", location=" + location + ", distance=" + distance + "]";
	}

}
