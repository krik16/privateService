package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class BindAccountParam implements Serializable{
	String type;
	String bankid;
	String userid;
	String name;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBankid() {
		return bankid;
	}
	public void setBankid(String bankid) {
		this.bankid = bankid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
