package com.rongyi.easy.rmmm.vo.merchant_inviteCode;

import java.io.Serializable;

public class BDUserAccountVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//大运营后台用户账号id
	private String userAccount;//大运营后台账号
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	
}
