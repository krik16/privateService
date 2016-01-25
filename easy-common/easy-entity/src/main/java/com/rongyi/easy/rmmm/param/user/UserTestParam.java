package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;

public class UserTestParam implements Serializable{


	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;

	private String proposerAccount;
	
	private Integer number;

	public String getProposerAccount() {
		return proposerAccount;
	}

	public void setProposerAccount(String proposerAccount) {
		this.proposerAccount = proposerAccount;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
