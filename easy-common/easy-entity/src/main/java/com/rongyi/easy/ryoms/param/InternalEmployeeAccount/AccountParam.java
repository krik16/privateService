package com.rongyi.easy.ryoms.param.InternalEmployeeAccount;

import java.io.Serializable;

public class AccountParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5666643262059118296L;
	private Integer id;//用户账号id
	private String account;//账号
	private String name;//姓名
	private String nickName;//昵称
	private String phone;//手机号
	private String remark;//备注
	private String createBy;//创建人id
	private String password;//密码
	private Byte status;//1：启用   2：停用
	private String reason;//停用理由
	private String newPassword;//新密码
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	@Override
	public String toString() {
		return "AccountParam [id=" + id + ", account=" + account + ", name="
				+ name + ", nickName=" + nickName + ", phone=" + phone
				+ ", remark=" + remark + ", createBy=" + createBy
				+ ", password=" + password + ", status=" + status + ", reason="
				+ reason + ", newPassword=" + newPassword + "]";
	}
	
}
