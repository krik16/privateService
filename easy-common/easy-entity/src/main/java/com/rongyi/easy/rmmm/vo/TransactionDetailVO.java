package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class TransactionDetailVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String consignee;// 收货人姓名

	private String phone;// 手机号

	private String address;// 邮寄地址

	private String provinceName;// 省名称

	private String cityName;// 市名称

	private String districtName;// 区名称

	private String commitOrderTime;// 下单时间

	private String payTime;// 付款时间

	private List<String> orderNums;// 大订单号集合
	
	private Integer userId;//导购id
	
	private String userLogo;//导购头像
	
	private Double userScore;//导购获得的评分
	
	private String userNickName;//导购昵称
	
	private String userName;//导购姓名
	
	private String userPhone;//导购电话号码
	
	private Integer guideType;// 1是导购 2是买手
	
	private String integral;//积分
	
	private String imId;//导购环信id
	
	private Boolean isBelong;//是否专属
	
	private Integer shopId;//店铺id
	
	private String shopMId;//店铺mongoid
	
	private String shopName;//店铺名
	
	private String mallMId;// 商场mongoId

	/** 返回的信息 */
	private String msg;
	/** 错误编码 */
	private Integer errno;
	/** 翻牌购拼接的url */
	private String url;
	
	private String isCollection="0";//是否收藏了店铺 0否 1是
	
	private Integer ifAttention = 0;// 是否已关注0否1是

	public Integer getIfAttention() {
		return ifAttention;
	}

	public void setIfAttention(Integer ifAttention) {
		this.ifAttention = ifAttention;
	}

	public String getIsCollection() {
		return isCollection;
	}

	public void setIsCollection(String isCollection) {
		this.isCollection = isCollection;
	}

	public Integer getGuideType() {
		return guideType;
	}

	public void setGuideType(Integer guideType) {
		this.guideType = guideType;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCommitOrderTime() {
		return commitOrderTime;
	}

	public void setCommitOrderTime(String commitOrderTime) {
		this.commitOrderTime = commitOrderTime;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public List<String> getOrderNums() {
		return orderNums;
	}

	public void setOrderNums(List<String> orderNums) {
		this.orderNums = orderNums;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserLogo() {
		return userLogo;
	}

	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}

	public Double getUserScore() {
		return userScore;
	}

	public void setUserScore(Double userScore) {
		this.userScore = userScore;
	}

	public Boolean getIsBelong() {
		return isBelong;
	}

	public void setIsBelong(Boolean isBelong) {
		this.isBelong = isBelong;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopMId() {
		return shopMId;
	}

	public void setShopMId(String shopMId) {
		this.shopMId = shopMId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getIntegral() {
		return integral;
	}

	public void setIntegral(String integral) {
		this.integral = integral;
	}

	public String getImId() {
		return imId;
	}

	public void setImId(String imId) {
		this.imId = imId;
	}

	public String getMallMId() {
		return mallMId;
	}

	public void setMallMId(String mallMId) {
		this.mallMId = mallMId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getErrno() {
		return errno;
	}

	public void setErrno(Integer errno) {
		this.errno = errno;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "TransactionDetailVO{" +
				"consignee='" + consignee + '\'' +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", provinceName='" + provinceName + '\'' +
				", cityName='" + cityName + '\'' +
				", districtName='" + districtName + '\'' +
				", commitOrderTime='" + commitOrderTime + '\'' +
				", payTime='" + payTime + '\'' +
				", orderNums=" + orderNums +
				", userId=" + userId +
				", userLogo='" + userLogo + '\'' +
				", userScore=" + userScore +
				", userNickName='" + userNickName + '\'' +
				", userName='" + userName + '\'' +
				", userPhone='" + userPhone + '\'' +
				", guideType=" + guideType +
				", integral='" + integral + '\'' +
				", imId='" + imId + '\'' +
				", isBelong=" + isBelong +
				", shopId=" + shopId +
				", shopMId='" + shopMId + '\'' +
				", shopName='" + shopName + '\'' +
				", mallMId='" + mallMId + '\'' +
				", msg='" + msg + '\'' +
				", errno=" + errno +
				", url='" + url + '\'' +
				", isCollection='" + isCollection + '\'' +
				", ifAttention=" + ifAttention +
				'}';
	}
}
