package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class LoginUserParam implements Serializable{
	String phone;
	String pswd;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
}
