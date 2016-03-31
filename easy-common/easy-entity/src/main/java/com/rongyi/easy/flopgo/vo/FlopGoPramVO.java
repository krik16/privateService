package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;

public class FlopGoPramVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;//用户的名字
	private String channel;//用户渠道
	private String userPhone;//用户手机
	private int times;//用户的翻牌的剩余次数
	public FlopGoPramVO(){
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	
}
