package com.rongyi.easy.rmmm.param.commission;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;
/**
 *邀请返佣  用户点击领取参数 
 * @author user
 *
 */
public class CommissionDiscountParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String phone;//手机号码
	private String inviteCode;//邀请码
	private Integer type;//1 邀请容易逛用户   2 邀请摩店用户
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
}
