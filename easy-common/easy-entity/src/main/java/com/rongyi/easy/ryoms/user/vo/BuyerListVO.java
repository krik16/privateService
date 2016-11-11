package com.rongyi.easy.ryoms.user.vo;

import java.io.Serializable;
import java.util.Date;

public class BuyerListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5886330627922339180L;
	private Integer id;//用户id
	private String userPhone;//用户账号 （手机号）
	private String userAccount;//  用户账号
	private String userName;//用户姓名
	private String nickName;//用户昵称
	private Integer isDisabled;//账号状态：是否禁用 0正常 1禁用'
	private Integer isSuspended;//资金账户：是否冻结    0正常，1冻结
	private Date virtualStopAt;//资金账户停用时间
	private String virtualStopReason;//资金账户停用原因
	private Date stopAt;//账号停用时间
	private String stopReason;//账号停用理由
	private Integer status;//0未提交审核 2审核中 1审核通过 4审核不通过 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getIsDisabled() {
		return isDisabled;
	}
	public void setIsDisabled(Integer isDisabled) {
		this.isDisabled = isDisabled;
	}
	public Integer getIsSuspended() {
		return isSuspended;
	}
	public void setIsSuspended(Integer isSuspended) {
		this.isSuspended = isSuspended;
	}
	public Date getVirtualStopAt() {
		return virtualStopAt;
	}
	public void setVirtualStopAt(Date virtualStopAt) {
		this.virtualStopAt = virtualStopAt;
	}
	public String getVirtualStopReason() {
		return virtualStopReason;
	}
	public void setVirtualStopReason(String virtualStopReason) {
		this.virtualStopReason = virtualStopReason;
	}
	public Date getStopAt() {
		return stopAt;
	}
	public void setStopAt(Date stopAt) {
		this.stopAt = stopAt;
	}
	public String getStopReason() {
		return stopReason;
	}
	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BuyerListVO [id=" + id + ", userPhone=" + userPhone
				+ ", userAccount=" + userAccount + ", userName=" + userName
				+ ", nickName=" + nickName + ", isDisabled=" + isDisabled
				+ ", isSuspended=" + isSuspended + ", virtualStopAt="
				+ virtualStopAt + ", virtualStopReason=" + virtualStopReason
				+ ", stopAt=" + stopAt + ", stopReason=" + stopReason
				+ ", status=" + status + "]";
	}
	
}
