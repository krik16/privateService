package com.rongyi.easy.roa.vo;


import java.io.Serializable;

/**
 * 老优惠券店铺信息
 */
public class ShopTmpVO implements Serializable{
	private String id;
	private String name;
	private String pro;
	private String city;
	private String area;
	private String business;
	private String address;
	private String owner_id;
	private String iconUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(String owner_id) {
		this.owner_id = owner_id;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
}
