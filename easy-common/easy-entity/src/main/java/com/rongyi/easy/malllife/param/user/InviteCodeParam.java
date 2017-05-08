package com.rongyi.easy.malllife.param.user;

import java.io.Serializable;

public class InviteCodeParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2151651080904693360L;
	
	private String shareCode;//邀请码

	public String getShareCode() {
		return shareCode;
	}

	public void setShareCode(String shareCode) {
		this.shareCode = shareCode;
	}

	@Override
	public String toString() {
		return "InviteCodeParam [shareCode=" + shareCode + "]";
	}
	
	
	
}
