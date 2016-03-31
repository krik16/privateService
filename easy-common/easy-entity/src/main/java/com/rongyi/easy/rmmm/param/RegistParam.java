package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class RegistParam implements Serializable{
	String phone;
	String checkcode;
	String nickname;
	String pswd;
	String delayTime;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCheckcode() {
		return checkcode;
	}
	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getDelayTime() {
		return delayTime;
	}
	public void setDelayTime(String delayTime) {
		this.delayTime = delayTime;
	}
	
	
}
