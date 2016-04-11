package com.rongyi.easy.roa.vo;

import java.io.Serializable;
/**
 * 微信标准版商家/买手个人信息返回VO
 * @author user
 *
 */
public class UserInfoForWevbchatVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;//用户id
	private String userNickName;//用户昵称
	private String userPhone;//用户手机号码
	private String userName;//用户名称
	private Double userScore;//用户评分
	private String userLogo;//用户头像
	private Integer userType;//用户类型   1 导购/商家   2买手
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Double getUserScore() {
		return userScore;
	}
	public void setUserScore(Double userScore) {
		this.userScore = userScore;
	}
	public String getUserLogo() {
		return userLogo;
	}
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "UserInfoForWevbchatVO [userId=" + userId + ", userNickName="
				+ userNickName + ", userPhone=" + userPhone + ", userName="
				+ userName + ", userScore=" + userScore + ", userLogo="
				+ userLogo + ", userType=" + userType + "]";
	}
	
}
