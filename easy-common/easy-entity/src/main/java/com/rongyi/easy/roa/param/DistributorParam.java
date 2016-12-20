package com.rongyi.easy.roa.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.param.user.AccountParam;
/**
 * 分销商参数
 * @author user
 *
 */
public class DistributorParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;//店铺账户id
	private String userAccount;//用户名
	private String phone;//登录手机号
	private String userName;//姓名
	private String userNickName;//昵称
	private String cardId;//身份证号
	private String bindingPhone;//绑定会员手机号
	private AccountParam accountParam;//资金账户信息
	private String memo;//备注
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getBindingPhone() {
		return bindingPhone;
	}
	public void setBindingPhone(String bindingPhone) {
		this.bindingPhone = bindingPhone;
	}
	public AccountParam getAccountParam() {
		return accountParam;
	}
	public void setAccountParam(AccountParam accountParam) {
		this.accountParam = accountParam;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "DistributorParam [userId=" + userId + ", userAccount="
				+ userAccount + ", phone=" + phone + ", userName=" + userName
				+ ", userNickName=" + userNickName + ", cardId=" + cardId
				+ ", bindingPhone=" + bindingPhone + ", accountParam="
				+ accountParam + ", memo=" + memo + "]";
	}
	
	
}
