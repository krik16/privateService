package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;
public class BrandShopDetailVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shopLogo;// 店铺logo
	private String shopName;// 店铺名称
	private String berthNum;// 铺位号
	private String mallName;// 商场名称
	private String isCollection = "1";// 是否收藏 0是 1否
	private long collectionCount;// 收藏数量
	private String shopId;// 店铺id
	private String guideId;// 导购id
	private String nickName;// 导购昵称
	private String imId;// 导购环信账号
	private String userLogo;// 导购logo
	private String userName;// 导购姓名
	private String userPhone;// 导购电话
	private Boolean offlinePayment;// 线下支付
	private Boolean onlinePayment;// 线上支付
	private Boolean takeBySele;// 自提
	private Boolean express;// 快递
	private Boolean offlineRefund;// 线下退款
	private Boolean onlineRefund;// 线上退款
	private List<String> shopIM;// 店铺可用IM账号
	private String shopMid;// shop mongoId
	private int guideNum;//店铺导购数量
	private String rankAvg;//店铺评分

	public String getShopLogo() {
		return shopLogo;
	}

	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getBerthNum() {
		return berthNum;
	}

	public void setBerthNum(String berthNum) {
		this.berthNum = berthNum;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getIsCollection() {
		return isCollection;
	}

	public void setIsCollection(String isCollection) {
		this.isCollection = isCollection;
	}

	public long getCollectionCount() {
		return collectionCount;
	}

	public void setCollectionCount(long collectionCount) {
		this.collectionCount = collectionCount;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getGuideId() {
		return guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getImId() {
		return imId;
	}

	public void setImId(String imId) {
		this.imId = imId;
	}

	public String getUserLogo() {
		return userLogo;
	}

	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
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

	public Boolean getOfflinePayment() {
		return offlinePayment;
	}

	public void setOfflinePayment(Boolean offlinePayment) {
		this.offlinePayment = offlinePayment;
	}

	public Boolean getOnlinePayment() {
		return onlinePayment;
	}

	public void setOnlinePayment(Boolean onlinePayment) {
		this.onlinePayment = onlinePayment;
	}

	public Boolean getTakeBySele() {
		return takeBySele;
	}

	public void setTakeBySele(Boolean takeBySele) {
		this.takeBySele = takeBySele;
	}

	public Boolean getExpress() {
		return express;
	}

	public void setExpress(Boolean express) {
		this.express = express;
	}

	public Boolean getOfflineRefund() {
		return offlineRefund;
	}

	public void setOfflineRefund(Boolean offlineRefund) {
		this.offlineRefund = offlineRefund;
	}

	public Boolean getOnlineRefund() {
		return onlineRefund;
	}

	public void setOnlineRefund(Boolean onlineRefund) {
		this.onlineRefund = onlineRefund;
	}

	public List<String> getShopIM() {
		return shopIM;
	}

	public void setShopIM(List<String> shopIM) {
		this.shopIM = shopIM;
	}

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public int getGuideNum() {
		return guideNum;
	}

	public void setGuideNum(int guideNum) {
		this.guideNum = guideNum;
	}

	public String getRankAvg() {
		return rankAvg;
	}

	public void setRankAvg(String rankAvg) {
		this.rankAvg = rankAvg;
	}
	
}
