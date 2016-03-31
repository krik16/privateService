package com.rongyi.easy.rmmm.vo.merchant_inviteCode;

import java.io.Serializable;


public class MerchantUserPhoneVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//用户表id
	private String userPhone;//用户帐号  手机号码
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
