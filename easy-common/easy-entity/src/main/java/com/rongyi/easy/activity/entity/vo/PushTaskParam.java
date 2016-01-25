package com.rongyi.easy.activity.entity.vo;

import java.io.Serializable;
import java.util.List;

import net.sf.json.JSONObject;



public class PushTaskParam implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id;
	
	private String name;
	private String time;
	private String coupons;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCoupons() {
		return coupons;
	}
	public void setCoupons(String coupons) {
		this.coupons = coupons;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PushTaskParam [id=" + id + ", name=" + name + ", time=" + time
				+ ", coupons=" + coupons + "]";
	}
	
}
