package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class ShareCouponDetailVO implements Serializable{
	
	private String desc;// 红包文案
	private String headImg;// 分享平台头像
	private double price;// 红包金额
	private String nickName;// 分享平台昵称
	private String receiveTime;// 领取时间
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getHeadImg() {
		return headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}
	@Override
	public String toString() {
		return "ShareCouponDetailVO [desc=" + desc + ", headImg=" + headImg
				+ ", price=" + price + ", nickName=" + nickName
				+ ", receiveTime=" + receiveTime + "]";
	}

}
