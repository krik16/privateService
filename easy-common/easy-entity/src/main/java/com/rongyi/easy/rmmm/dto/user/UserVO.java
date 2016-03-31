/**
 * 
 */
package com.rongyi.easy.rmmm.dto.user;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： 买家信息 time
 * ：2015年5月14日 History: 变更记录 <author> <time> <version> <desc> chenjun 2015年5月14日
 * 1.0 创建文件
 */
public class UserVO implements Serializable {

	private String userId;// 买家id
	private String userName; // 买家用户名
	private String userPhone;// 买家电话
	private String nickname;// 买家昵称

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone + ", nickname=" + nickname
				+ "]";
	}

}
