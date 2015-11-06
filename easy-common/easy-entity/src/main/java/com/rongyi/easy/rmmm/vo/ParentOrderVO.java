package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ParentOrderVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String orderId;// 大订单id

	private String mallName;// 商场名称

	private String brandName;// 品牌名称

	private String shopName;// 店铺名称

	private List<String> shopIM;// 店铺可用IM账号

	private String totalPrice;// 总价

	private String parentOrderStatus;// 父订单状态

	private String nextStatusTime;// 预计进入下一状态的时间

	private List<SonOrderVO> sonOrderList;// 子订单

	private String consignee;// 收件人姓名

	private String phone;// 收件人电话

	private String address;// 邮寄地址

	private String provinceName;// 省名称

	private String cityName;// 市名称

	private String districtName;// 区名称

	private String commodityPostage;// 运费

	private String orderNum;// 订单编号

	private String comment;// 买家备注

	private String payTime;// 付款时间

	private String commitOrderTime;// 提交订单时间

	private String deliverTime;// 发货时间

	private String shopId;// 店铺mysql的id

	private String shopMid;// 店铺mongoId

	private String shopLogo;// 店铺logo

	private String isComment;// 是否评价  -1:表示不可以评价 0：表示未评价 1：表示已评价

	private String closeType;// 父订单关闭类型 (0完成 1关闭)

	private String closeReason;// 关闭原因

	private String originalTotalPrice;// 原来的总价

	private String buyerNickName;// 收货人昵称
	private String buyerPhone;// 买家手机号（买家账号）
	private String receiveType;// 收货方式 0快递 1无需快递
	private String nickName;// 导购昵称
	private String imId;// 导购环信账号
	private String userLogo;// 导购logo
	private String userName;// 导购姓名
	private String userPhone;// 导购电话
	private String guideId;// 导购id
	private Integer guideType;// 1是导购 2是买手
	private String receiveTime;// 确认收货时间
	private String cancelTime;// 卖家取消订单时间
	private String closeTime;// 订单关闭时间
	private String statusRoute;// 状态路径

	/*
	 * private String expressBillId;// 物流单号ID
	 * 
	 * private String expressName;// 物流名称
	 */

	private String expressBillId;// 物流单号ID

	private String expressName;// 物流名称
	private BigDecimal discountFee;// 商品折扣价

	private String score;// 使用的颜值
	private String scoreDeduction;// 颜值抵扣金额
	private String DeductCouponAmount;// 抵扣券实际抵扣价格

	private String liveName;//直播名

	public String getLiveName() {
		return liveName;
	}

	public void setLiveName(String liveName) {
		this.liveName = liveName;
	}

	public Integer getGuideType() {
		return guideType;
	}

	public void setGuideType(Integer guideType) {
		this.guideType = guideType;
	}

	public BigDecimal getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(BigDecimal discountFee) {
		this.discountFee = discountFee;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getBuyerPhone() {
		return buyerPhone;
	}

	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<String> getShopIM() {
		return shopIM;
	}

	public void setShopIM(List<String> shopIM) {
		this.shopIM = shopIM;
	}

	public List<SonOrderVO> getSonOrderList() {
		return sonOrderList;
	}

	public void setSonOrderList(List<SonOrderVO> sonOrderList) {
		this.sonOrderList = sonOrderList;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getParentOrderStatus() {
		return parentOrderStatus;
	}

	public void setParentOrderStatus(String parentOrderStatus) {
		this.parentOrderStatus = parentOrderStatus;
	}

	public String getNextStatusTime() {
		return nextStatusTime;
	}

	public void setNextStatusTime(String nextStatusTime) {
		this.nextStatusTime = nextStatusTime;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public String getCommodityPostage() {
		return commodityPostage;
	}

	public void setCommodityPostage(String commodityPostage) {
		this.commodityPostage = commodityPostage;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getCommitOrderTime() {
		return commitOrderTime;
	}

	public void setCommitOrderTime(String commitOrderTime) {
		this.commitOrderTime = commitOrderTime;
	}

	public String getDeliverTime() {
		return deliverTime;
	}

	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopLogo() {
		return shopLogo;
	}

	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}

	public String getIsComment() {
		return isComment;
	}

	public void setIsComment(String isComment) {
		this.isComment = isComment;
	}

	public String getCloseType() {
		return closeType;
	}

	public void setCloseType(String closeType) {
		this.closeType = closeType;
	}

	public String getCloseReason() {
		return closeReason;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getOriginalTotalPrice() {
		return originalTotalPrice;
	}

	public void setOriginalTotalPrice(String originalTotalPrice) {
		this.originalTotalPrice = originalTotalPrice;
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

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public String getExpressBillId() {
		return expressBillId;
	}

	public void setExpressBillId(String expressBillId) {
		this.expressBillId = expressBillId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
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

	public String getBuyerNickName() {
		return buyerNickName;
	}

	public void setBuyerNickName(String buyerNickName) {
		this.buyerNickName = buyerNickName;
	}

	public String getReceiveType() {
		return receiveType;
	}

	public void setReceiveType(String receiveType) {
		this.receiveType = receiveType;
	}

	public String getGuideId() {
		return guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	public String getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getCancelTime() {
		return cancelTime;
	}

	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getStatusRoute() {
		return statusRoute;
	}

	public void setStatusRoute(String statusRoute) {
		this.statusRoute = statusRoute;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getScoreDeduction() {
		return scoreDeduction;
	}

	public void setScoreDeduction(String scoreDeduction) {
		this.scoreDeduction = scoreDeduction;
	}

	public String getDeductCouponAmount() {
		return DeductCouponAmount;
	}

	public void setDeductCouponAmount(String deductCouponAmount) {
		DeductCouponAmount = deductCouponAmount;
	}

	@Override
	public String toString() {
		return "ParentOrderVO{" +
				"orderId='" + orderId + '\'' +
				", mallName='" + mallName + '\'' +
				", brandName='" + brandName + '\'' +
				", shopName='" + shopName + '\'' +
				", shopIM=" + shopIM +
				", totalPrice='" + totalPrice + '\'' +
				", parentOrderStatus='" + parentOrderStatus + '\'' +
				", nextStatusTime='" + nextStatusTime + '\'' +
				", sonOrderList=" + sonOrderList +
				", consignee='" + consignee + '\'' +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", provinceName='" + provinceName + '\'' +
				", cityName='" + cityName + '\'' +
				", districtName='" + districtName + '\'' +
				", commodityPostage='" + commodityPostage + '\'' +
				", orderNum='" + orderNum + '\'' +
				", comment='" + comment + '\'' +
				", payTime='" + payTime + '\'' +
				", commitOrderTime='" + commitOrderTime + '\'' +
				", deliverTime='" + deliverTime + '\'' +
				", shopId='" + shopId + '\'' +
				", shopMid='" + shopMid + '\'' +
				", shopLogo='" + shopLogo + '\'' +
				", isComment='" + isComment + '\'' +
				", closeType='" + closeType + '\'' +
				", closeReason='" + closeReason + '\'' +
				", originalTotalPrice='" + originalTotalPrice + '\'' +
				", buyerNickName='" + buyerNickName + '\'' +
				", buyerPhone='" + buyerPhone + '\'' +
				", receiveType='" + receiveType + '\'' +
				", nickName='" + nickName + '\'' +
				", imId='" + imId + '\'' +
				", userLogo='" + userLogo + '\'' +
				", userName='" + userName + '\'' +
				", userPhone='" + userPhone + '\'' +
				", guideId='" + guideId + '\'' +
				", guideType=" + guideType +
				", receiveTime='" + receiveTime + '\'' +
				", cancelTime='" + cancelTime + '\'' +
				", closeTime='" + closeTime + '\'' +
				", statusRoute='" + statusRoute + '\'' +
				", expressBillId='" + expressBillId + '\'' +
				", expressName='" + expressName + '\'' +
				", discountFee=" + discountFee +
				", score='" + score + '\'' +
				", scoreDeduction='" + scoreDeduction + '\'' +
				", DeductCouponAmount='" + DeductCouponAmount + '\'' +
				", liveName='" + liveName + '\'' +
				'}';
	}
}
