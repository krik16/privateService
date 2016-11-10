package com.rongyi.easy.ryoms.param.buyer;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.param.user.AccountParam;

public class BuyerParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2376186400000952219L;
	private Integer id;//买手账号id
	private String phone;//手机号
	private String userName;//姓名
	private String userNickName;//昵称
	private String remark;//备注
	private String userLogo;//头像
	private String userAccount;//买手账号
	private Integer createBy;//创建人id
	private String cardId;//身份证号
	private List<AccountParam> accountList;//账号信息
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUserLogo() {
		return userLogo;
	}
	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public Integer getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public List<AccountParam> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<AccountParam> accountList) {
		this.accountList = accountList;
	}
	
	
}
