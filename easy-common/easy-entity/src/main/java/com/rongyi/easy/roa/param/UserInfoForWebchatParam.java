package com.rongyi.easy.roa.param;

import java.io.Serializable;
/**
 * 微信标准版商品详情获取商家，买手信息参数
 * @author user
 *
 */
public class UserInfoForWebchatParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;//摩店用户id

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
