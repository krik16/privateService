package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class ShareCouponParam  extends MalllifeBaseParam implements Serializable{
	
	private String shareId;//分享红包id
	
	private String 	orderNum;//订单号
	
	private String  phone;//手机号
	
	private String openId;//微信openId或微博uid
	
	private String headImg;//分享平台头像完整url
	
	private String nickName;//	分享平台昵称
	
	private Integer type;//1微信 2新浪微博
	
	private String couponCode;//券码
	
	private Integer orderType;//1商品订单 2代金券订单
	
	private Integer price;//红包金额 精确到分
	
	private Integer userOpenidId;//
	
	private String way;//0：领取红包接口成功  1领取红包接口失败 2不是来源于领取红包接口

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public Integer getUserOpenidId() {
		return userOpenidId;
	}

	public void setUserOpenidId(Integer userOpenidId) {
		this.userOpenidId = userOpenidId;
	}

	public String getShareId() {
		return shareId;
	}

	public void setShareId(String shareId) {
		this.shareId = shareId;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShareCouponParam [shareId=" + shareId + ", orderNum="
				+ orderNum + ", phone=" + phone + ", openId=" + openId
				+ ", headImg=" + headImg + ", nickName=" + nickName + ", type="
				+ type + ", couponCode=" + couponCode + ", orderType="
				+ orderType + ", price=" + price + ", userOpenidId="
				+ userOpenidId + ", way=" + way + "]";
	}

}
