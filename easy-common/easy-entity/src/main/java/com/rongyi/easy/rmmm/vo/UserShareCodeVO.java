package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class UserShareCodeVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userLogo;//用户头像
	private String inviteCode;//邀请码
	private String inviteType;//被邀请人对象  1容易逛  2买手  3导购  4摩店全部
	public String getUserLogo() {
		return userLogo;
	}
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public String getInviteType() {
		return inviteType;
	}
	public void setInviteType(String inviteType) {
		this.inviteType = inviteType;
	}
	
	
	
}
