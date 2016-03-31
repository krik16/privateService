/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年7月15日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年7月15日 1.0 创建文件
 */
public class ValidCouponVO implements Serializable{

	private String status;// 验证失败[0],验证成功[1],已过期[2],已使用[3]

	private String title;// 券名称

	private String originalPrice;// 原价

	private String currentPrice;// 现价

	private String couponId;// 优惠券id

	private String listPicUrl;// 列表图url,
	
	private String message;//信息

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getListPicUrl() {
		return listPicUrl;
	}

	public void setListPicUrl(String listPicUrl) {
		this.listPicUrl = listPicUrl;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
