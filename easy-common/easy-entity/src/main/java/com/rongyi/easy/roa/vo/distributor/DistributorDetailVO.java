package com.rongyi.easy.roa.vo.distributor;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.param.user.AccountParam;
/**
 * 分销商账户信息详情
 * @author user
 *
 */
public class DistributorDetailVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4016043572445905767L;
	private Integer id;//表id
	private String userAccount;//用户名
	private String phone;//登录手机号
	private String userName;//姓名
	private String userNickName;//昵称
	private String cardId;//身份证号
	private UserCashAccountVO cashAccount;//银行卡配置信息
	private String memo;//备注
	private UserAlipyVO userAlipy;//支付宝配置信息
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
	public UserCashAccountVO getCashAccount() {
		return cashAccount;
	}
	public void setCashAccount(UserCashAccountVO cashAccount) {
		this.cashAccount = cashAccount;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public UserAlipyVO getUserAlipy() {
		return userAlipy;
	}
	public void setUserAlipy(UserAlipyVO userAlipy) {
		this.userAlipy = userAlipy;
	}
	@Override
	public String toString() {
		return "DistributorDetailVO [id=" + id + ", userAccount=" + userAccount
				+ ", phone=" + phone + ", userName=" + userName
				+ ", userNickName=" + userNickName + ", cardId=" + cardId
				+ ", cashAccount=" + cashAccount + ", memo=" + memo
				+ ", userAlipy=" + userAlipy + "]";
	}
	
}
