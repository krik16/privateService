package com.rongyi.easy.rmmm.param;

import java.io.Serializable;


/**
 * 店员认证参数，店员认证参数
 * 
 * @author chenjun 2015/1/22
 * 
 */
public class PrincipalAndCategoryParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId;// 要搜索品牌所属Mall的Mongo ID
	private String brandId;//要搜索品牌所属Brand的Mongo ID
	private String name;//店员姓名
	private String password;// 密码
	private String phone;//店员电话
	private String shopId;

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
