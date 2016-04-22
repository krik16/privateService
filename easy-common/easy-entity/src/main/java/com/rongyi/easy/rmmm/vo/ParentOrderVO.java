package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ParentOrderVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String orderId;// 大订单id
	private String orderCartNo;// 购物车订单号
	private String paymentIdList;// 支付流水号
	private String couponCodes;// 券码（多个逗号隔开）
	private Byte payChannel;// 券码（多个逗号隔开）

	private String mallName;// 商场名称

	private String brandName;// 品牌名称

	private String shopName;// 店铺名称

	private List<String> shopIM;// 店铺可用IM账号

	private String totalPrice = "0";// 总价
	private BigDecimal payAmount = new BigDecimal(0);// 实际支付价格

	private String parentOrderStatus;// 父订单状态 1未付款 2待发货 3已发货 4确认收货 5已关闭

	private String nextStatusTime;// 预计进入下一状态的时间

	private List<SonOrderVO> sonOrderList;// 子订单

	private String consignee;// 收件人姓名

	private String phone;// 收件人电话

	private String address;// 邮寄地址

	private String provinceName;// 省名称

	private String cityName;// 市名称

	private String districtName;// 区名称

	private String commodityPostage = "0";// 运费

	private String orderNum;// 订单编号

	private String comment;// 买家备注

	private String payTime;// 付款时间

	private String commitOrderTime;// 提交订单时间

	private String deliverTime;// 发货时间

	private String shopId;// 店铺mysql的id

	private String shopMid;// 店铺mongoId

	private String shopLogo;// 店铺logo

	private String isComment = "-1";// 是否评价  -1:表示不可以评价 0：表示未评价 1：表示已评价

	private String closeType = "0";// 父订单关闭类型 (0完成 1关闭)

	private String closeReason;// 关闭原因

	private String originalTotalPrice  = "0";// 原来的总价

	private String buyerNickName;// 收货人昵称
	private String buyerPhone;// 买家手机号（买家账号）
	private String receiveType = "1";// 收货方式 0快递 1无需快递
	private String nickName;// 导购昵称
	private String imId;// 导购环信账号
	private String userLogo;// 导购logo
	private String userName;// 导购姓名
	private String userAccount;// 导购账号
	private String userPhone;// 导购电话
	private String guideId;// 导购id
	private Integer guideType;// 1是导购 2是买手
	private String receiveTime;// 确认收货时间
	private String cancelTime;// 卖家取消订单时间
	private String closeTime;// 订单关闭时间
	private String commentTime;// 评价时间
	private String statusRoute;// 状态路径
	private String platformRebateAmount = "0";//用户使用抵扣券后对该订单实际抵扣的金额
	/*
	 * private String expressBillId;// 物流单号ID
	 * 
	 * private String expressName;// 物流名称
	 */

	private String expressBillId;// 物流单号ID

	private String expressName;// 物流名称
	private BigDecimal discountFee = BigDecimal.valueOf(0.00);// 商品折扣价

	private String score = "0";// 使用的颜值
	private String scoreDeduction = "0";// 颜值抵扣金额
	private String DeductCouponAmount = "0";// 抵扣券实际抵扣价格

	private String liveName;//直播名

	private BigDecimal orderScoreDiscount = BigDecimal.valueOf(0.00);//购物车分摊的积分优惠
	private BigDecimal orderCouponDiscount = BigDecimal.valueOf(0.00);//购物车分摊的抵扣券优惠
	private BigDecimal couponDiscount = BigDecimal.valueOf(0.00);//非购物车订单抵扣券抵扣金额

	private BigDecimal orderRebateDiscount = BigDecimal.valueOf(0.00);//购物车分摊的抵扣券优惠

	private Date createAt;//创建时间
	
	private String expressOrderInfoId;//物流信息主键id
	private boolean ifOnDisplayExpress = false;//true显示查看物流按钮 false不显示

	public String getExpressOrderInfoId() {
		return expressOrderInfoId;
	}

	public void setExpressOrderInfoId(String expressOrderInfoId) {
		this.expressOrderInfoId = expressOrderInfoId;
	}

	public boolean isIfOnDisplayExpress() {
		return ifOnDisplayExpress;
	}

	public void setIfOnDisplayExpress(boolean ifOnDisplayExpress) {
		this.ifOnDisplayExpress = ifOnDisplayExpress;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getOrderCartNo() {
		return orderCartNo;
	}

	public void setOrderCartNo(String orderCartNo) {
		this.orderCartNo = orderCartNo;
	}

	public String getPaymentIdList() {
		return paymentIdList;
	}

	public void setPaymentIdList(String paymentIdList) {
		this.paymentIdList = paymentIdList;
	}

	public Byte getPayChannel() {
		return payChannel;
	}

	public BigDecimal getOrderCouponDiscount() {
		return orderCouponDiscount;
	}

	public void setOrderCouponDiscount(BigDecimal orderCouponDiscount) {
		this.orderCouponDiscount = orderCouponDiscount;
	}

	public BigDecimal getCouponDiscount() {
		return couponDiscount;
	}

	public void setCouponDiscount(BigDecimal couponDiscount) {
		this.couponDiscount = couponDiscount;
	}

	public void setPayChannel(Byte payChannel) {
		this.payChannel = payChannel;
	}

	public String getCouponCodes() {
		return couponCodes;
	}

	public void setCouponCodes(String couponCodes) {
		this.couponCodes = couponCodes;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	private String changePriceFlag;//改价标志（0没改价,1改价,2改价影响抵扣券）

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	private Integer shopNum = 0;//店铺数量

	private BigDecimal totalHongBaoAmount = BigDecimal.valueOf(0.0);//红包实际抵扣价格
	/**
	 *是否是购物车订单
	 */
	private boolean isCartOrder;
	
	private boolean ifDeleteOrder = false;//true表示可以删除订单 false
	
	private boolean ifOnDisplay = false;//true表示横着显示 false表示竖着显示

	public boolean isIfOnDisplay() {
		return ifOnDisplay;
	}

	public void setIfOnDisplay(boolean ifOnDisplay) {
		this.ifOnDisplay = ifOnDisplay;
	}

	public boolean isIfDeleteOrder() {
		return ifDeleteOrder;
	}

	public void setIfDeleteOrder(boolean ifDeleteOrder) {
		this.ifDeleteOrder = ifDeleteOrder;
	}

	public void setCartOrder(boolean isCartOrder) {
		this.isCartOrder = isCartOrder;
	}

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

	public String getPlatformRebateAmount() {
		return platformRebateAmount;
	}

	public void setPlatformRebateAmount(String platformRebateAmount) {
		this.platformRebateAmount = platformRebateAmount;
	}

	public BigDecimal getOrderScoreDiscount() {
		return orderScoreDiscount;
	}

	public void setOrderScoreDiscount(BigDecimal orderScoreDiscount) {
		this.orderScoreDiscount = orderScoreDiscount;
	}

	public BigDecimal getOrderRebateDiscount() {
		return orderRebateDiscount;
	}

	public void setOrderRebateDiscount(BigDecimal orderRebateDiscount) {
		this.orderRebateDiscount = orderRebateDiscount;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getChangePriceFlag() {
		return changePriceFlag;
	}

	public void setChangePriceFlag(String changePriceFlag) {
		this.changePriceFlag = changePriceFlag;
	}

	public Integer getShopNum() {
		return shopNum;
	}

	public void setShopNum(Integer shopNum) {
		this.shopNum = shopNum;
	}

	public BigDecimal getTotalHongBaoAmount() {
		return totalHongBaoAmount;
	}

	public void setTotalHongBaoAmount(BigDecimal totalHongBaoAmount) {
		this.totalHongBaoAmount = totalHongBaoAmount;
	}

	public boolean isCartOrder() {
		return isCartOrder;
	}

	public void setIsCartOrder(boolean isCartOrder) {
		this.isCartOrder = isCartOrder;
	}

	public String getCommentTime()
	{
		return commentTime;
	}

	public void setCommentTime(String commentTime)
	{
		this.commentTime = commentTime;
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
				", platformRebateAmount='" + platformRebateAmount + '\'' +
				", expressBillId='" + expressBillId + '\'' +
				", expressName='" + expressName + '\'' +
				", discountFee=" + discountFee +
				", score='" + score + '\'' +
				", scoreDeduction='" + scoreDeduction + '\'' +
				", DeductCouponAmount='" + DeductCouponAmount + '\'' +
				", liveName='" + liveName + '\'' +
				", orderScoreDiscount=" + orderScoreDiscount +
				", orderRebateDiscount=" + orderRebateDiscount +
				", createAt=" + createAt +
				", changePriceFlag='" + changePriceFlag + '\'' +
				", shopNum=" + shopNum +
				", totalHongBaoAmount=" + totalHongBaoAmount +
				", isCartOrder=" + isCartOrder +
				", expressOrderInfoId=" + expressOrderInfoId +
				", ifOnDisplayExpress=" + ifOnDisplayExpress +
				'}';
	}
}