package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * 店员信息
 * 
 * @author user
 * 
 */
public class AssistantVO implements Serializable{
	private String saleLogo;// 店员的头像
	private String saleId;// 店员id
	private String name;// 店员姓名
	private String phone;// 店员电话
	private String status;// （状态： 1为通过，2 为审核中）

	private Integer shopId;//商店Id

	public String getSaleLogo() {
		return saleLogo;
	}

	public void setSaleLogo(String saleLogo) {
		this.saleLogo = saleLogo;
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
}
