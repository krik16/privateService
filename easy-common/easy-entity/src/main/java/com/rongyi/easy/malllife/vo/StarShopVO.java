package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

public class StarShopVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;//标题
	private String provId;//省id
	private String cityId;//城市id
	private List<APPShopVO> shops;//店铺相关信息
	private List<String> shopIds;//店铺id,多个以逗号分隔
	private String publishBeginAt;//明星店铺发布开始时间
	private String publishEndAt;//明星店铺发布结束时间
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProvId() {
		return provId;
	}
	public void setProvId(String provId) {
		this.provId = provId;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public List<APPShopVO> getShops() {
		return shops;
	}
	public void setShops(List<APPShopVO> shops) {
		this.shops = shops;
	}
	public List<String> getShopIds() {
		return shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}
	public String getPublishBeginAt() {
		return publishBeginAt;
	}
	public void setPublishBeginAt(String publishBeginAt) {
		this.publishBeginAt = publishBeginAt;
	}
	public String getPublishEndAt() {
		return publishEndAt;
	}
	public void setPublishEndAt(String publishEndAt) {
		this.publishEndAt = publishEndAt;
	}
	
}
