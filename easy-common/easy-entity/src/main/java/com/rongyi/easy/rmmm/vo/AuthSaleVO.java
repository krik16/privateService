package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class AuthSaleVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId;// 要搜索品牌所属Mall的Mongo ID
	private String mallName;//商场名字
	private String brandId;//要搜索品牌所属Brand的Mongo ID
	private String brandName;//品牌名字
	private String name;//店员姓名
	private String phone;//店员电话
    private String principal;//负责人	
	private String principalId;//负责人id
	private String category;//品类
	private String accountId;//账号
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
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
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getPrincipalId() {
		return principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
}
