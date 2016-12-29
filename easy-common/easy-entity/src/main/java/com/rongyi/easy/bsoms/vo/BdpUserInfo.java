package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;

public class BdpUserInfo implements Serializable{
    
	private static final long serialVersionUID = -9020826658789303498L;

	private Integer id;
    
    private String userAccount;

    private String userNickName;

    private String theme;
    
    private String language;

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

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
    
}
