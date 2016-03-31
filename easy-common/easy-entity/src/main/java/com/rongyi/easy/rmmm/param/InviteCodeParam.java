package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class InviteCodeParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String number;
	private String proposerAccount;

	private int type=0;//2为买手


	private String shopName;//":店名
	private String cityName;//":城市名
	private String address;//":门店地址
	private String userName;//":称呼
	private String phone;//":联系方式




	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getProposerAccount() {
		return proposerAccount;
	}
	public void setProposerAccount(String proposerAccount) {
		this.proposerAccount = proposerAccount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
