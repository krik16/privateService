package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;

public class BsUserVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
    private Integer type;//0商场、1品牌、2买手
    private Integer identity;//0集团管理员、1商场管理员、4店长、5导购、6买手
    private Integer userStatus;//0未提交审核 2审核中 1审核通过 4审核不通过
    private Integer isDisabled;//是否禁用0正常 1禁用
    private Integer isChief;  //是否主账号 0是1否
    private Integer level;   //等级  1 2 3
    private Integer chiefId;  //主账号id
    private Integer isAllowBindingWechat;//是否允许分店绑定微信 0否，1是
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getIdentity() {
		return identity;
	}
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	public Integer getIsDisabled() {
		return isDisabled;
	}
	public void setIsDisabled(Integer isDisabled) {
		this.isDisabled = isDisabled;
	}
	public Integer getIsChief() {
		return isChief;
	}
	public void setIsChief(Integer isChief) {
		this.isChief = isChief;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getChiefId() {
		return chiefId;
	}
	public void setChiefId(Integer chiefId) {
		this.chiefId = chiefId;
	}
	public Integer getIsAllowBindingWechat() {
		return isAllowBindingWechat;
	}
	public void setIsAllowBindingWechat(Integer isAllowBindingWechat) {
		this.isAllowBindingWechat = isAllowBindingWechat;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", type=" + type + ", identity=" + identity
				+ ", userStatus=" + userStatus + ", isDisabled=" + isDisabled
				+ ", isChief=" + isChief + ", level=" + level + ", chiefId="
				+ chiefId + ", isAllowBindingWechat=" + isAllowBindingWechat
				+ "]";
	}
	
}
