package com.rongyi.easy.tms.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeVO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -1736356668329781965L;

	private Integer id;

	/**
	 * 下单时间
	 */
	private Date orderTime;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 提现记录ID
	 */
	private Integer drawApplyId;

	/**
	 * 提现用户ID
	 */
	private String drawUserId;

	/**
	 * 订单价格
	 */
	private BigDecimal orderPrice;

	/**
	 * 订单号
	 */
	private String orderNo;

	/**
	 * 付款单号
	 */
	private String payNo;

	/**
	 * 订单类型
	 */
	private Integer orderType;

	/**
	 * 交易类型（购买/退款/打款给卖家/异常交易）
	 */
	private Integer tradeType;

	private Integer payChannel;

	/**
	 * 交易流水号
	 */
	private String tradeNo;

	/**
	 * 退款流水号
	 */
	private String transactionId;

	/**
	 * 交易时间
	 */
	private Date tradeTime;

	/**
	 * 店铺ID
	 */
	private String shopId;

	/**
	 * 店铺名称
	 */
	private String shopName;

	/**
	 * 商场ID
	 */
	private String mallId;

	/**
	 * 商场名称
	 */
	private String mallName;

	/**
	 * 买家ID集合(查询使用)
	 */
	private String[] buyerIds;
	/**
	 * 买家ID（商品）
	 */
	private String buyerId;
	/**
	 * 买家账号(商品)
	 */
	private String buyerAccount;

	/**
	 * 买家姓名（商品）
	 */
	private String buyerName;

	/**
	 * 买家ID(优惠券)
	 */
	private String couponBuyerId;
	/**
	 * 买家账号(优惠券)
	 */
	private String couponBuyerAccount;

	/**
	 * 卖家账号
	 */
	private String sellerAccount;

	/**
	 * 卖家姓名
	 */
	private String sellerName;

	/**
	 * 卖家支付账号类型（1：支付宝;2：银行卡）
	 */
	private Integer sellerPayType;

	/**
	 * 卖家支付账号
	 */
	private String sellerPayAccount;

	/**
	 * 卖家支付账号姓名
	 */
	private String sellerPayName;

	/**
	 * 优惠信息（积分，抵扣券信息，json格式）
	 */
	// private String integralDiscount;

	/**
	 * 商品订单优惠信息（积分，红包使用记录，json格式）
	 */
	private String orderDiscountInfo;

	/**
	 * 商品使用红包 券码
	 */
	private String orderCouponCode;

	/**
	 * 优惠券订单使用积分
	 */
	private Integer score;

	/**
	 * 优惠方式(0:红包，1:优惠券)
	 */
	private Integer rebateType;

	/**优惠券红包抵扣金额
	 *
	 */
	private Integer hbDiscount;

	/**
	 * 优惠券使用红包 券码
	 */
	private String couponCashCouponCode;


	/**
	 * 使用优惠券金额
	 */
	// private Double couponDiscount;

	/**
	 * 优惠券金额整数
	 */
	private int couponDiscountInt;

	private Integer refundRejected;

	/**
	 * 买家支付账号
	 */
	private String buyerPayAccount;


	/*----查询字段----*/
	/**
	 * 交易开始时间
	 */
	private Date tradeStartTime;

	/**
	 * 交易结束时间
	 */
	private Date tradeEndTime;

	/**
	 * 最低金额
	 */
	private Double minTotalPrice;

	/**
	 * 最高金额
	 */
	private Double maxTotalPrice;

	/**
	 * 订单ID
	 */
	private String orderId;

	/**
	 * 订单用户Id
	 */
	private String orderUserId;

	/**
	 * 优惠方式
	 */
	private Integer favorType;
	/**
	 * 渠道 1：导购，2：买手
	 */
	private Integer guideType;

	/**
	 * 操作时间
	 */
	private Date opTime;

	/**
	 * 是否允许继续操作付款
	 */
	private boolean rePay=true;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDrawUserId() {
		return drawUserId;
	}

	public void setDrawUserId(String drawUserId) {
		this.drawUserId = drawUserId;
	}

	public BigDecimal getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getSellerAccount() {
		return sellerAccount;
	}

	public void setSellerAccount(String sellerAccount) {
		this.sellerAccount = sellerAccount;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getBuyerAccount() {
		return buyerAccount;
	}

	public void setBuyerAccount(String buyerAccount) {
		this.buyerAccount = buyerAccount;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String[] getBuyerIds() {
		return buyerIds;
	}

	public void setBuyerIds(String[] buyerIds) {
		this.buyerIds = buyerIds;
	}

	public Date getTradeStartTime() {
		return tradeStartTime;
	}

	public void setTradeStartTime(Date tradeStartTime) {
		this.tradeStartTime = tradeStartTime;
	}

	public Date getTradeEndTime() {
		return tradeEndTime;
	}

	public void setTradeEndTime(Date tradeEndTime) {
		this.tradeEndTime = tradeEndTime;
	}

	public Double getMinTotalPrice() {
		return minTotalPrice;
	}

	public void setMinTotalPrice(Double minTotalPrice) {
		this.minTotalPrice = minTotalPrice;
	}

	public Double getMaxTotalPrice() {
		return maxTotalPrice;
	}

	public void setMaxTotalPrice(Double maxTotalPrice) {
		this.maxTotalPrice = maxTotalPrice;
	}

	public Integer getTradeType() {
		return tradeType;
	}

	public void setTradeType(Integer tradeType) {
		this.tradeType = tradeType;
	}

	public Integer getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(Integer payChannel) {
		this.payChannel = payChannel;
	}

	public Integer getSellerPayType() {
		return sellerPayType;
	}

	public void setSellerPayType(Integer sellerPayType) {
		this.sellerPayType = sellerPayType;
	}

	public String getSellerPayAccount() {
		return sellerPayAccount;
	}

	public void setSellerPayAccount(String sellerPayAccount) {
		this.sellerPayAccount = sellerPayAccount;
	}

	public String getSellerPayName() {
		return sellerPayName;
	}

	public void setSellerPayName(String sellerPayName) {
		this.sellerPayName = sellerPayName;
	}

	public Integer getDrawApplyId() {
		return drawApplyId;
	}

	public void setDrawApplyId(Integer drawApplyId) {
		this.drawApplyId = drawApplyId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderUserId() {
		return orderUserId;
	}

	public void setOrderUserId(String orderUserId) {
		this.orderUserId = orderUserId;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public String getOrderDiscountInfo() {
		return orderDiscountInfo;
	}

	public void setOrderDiscountInfo(String orderDiscountInfo) {
		this.orderDiscountInfo = orderDiscountInfo;
	}

	public String getOrderCouponCode() {
		return orderCouponCode;
	}

	public void setOrderCouponCode(String orderCouponCode) {
		this.orderCouponCode = orderCouponCode;
	}

	public String getCouponCashCouponCode() {
		return couponCashCouponCode;
	}

	public void setCouponCashCouponCode(String couponCashCouponCode) {
		this.couponCashCouponCode = couponCashCouponCode;
	}


	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getHbDiscount() {
		return hbDiscount;
	}

	public void setHbDiscount(Integer hbDiscount) {
		this.hbDiscount = hbDiscount;
	}

	public Integer getFavorType() {
		return favorType;
	}

	public void setFavorType(Integer favorType) {
		this.favorType = favorType;
	}

	public int getCouponDiscountInt() {
		return couponDiscountInt;
	}

	public void setCouponDiscountInt(int couponDiscountInt) {
		this.couponDiscountInt = couponDiscountInt;
	}

	public String getCouponBuyerId() {
		return couponBuyerId;
	}

	public void setCouponBuyerId(String couponBuyerId) {
		this.couponBuyerId = couponBuyerId;
	}

	public String getCouponBuyerAccount() {
		return couponBuyerAccount;
	}

	public void setCouponBuyerAccount(String couponBuyerAccount) {
		this.couponBuyerAccount = couponBuyerAccount;
	}

	public Integer getRefundRejected() {
		return refundRejected;
	}

	public void setRefundRejected(Integer refundRejected) {
		this.refundRejected = refundRejected;
	}

	public Integer getGuideType() {
		return guideType;
	}

	public void setGuideType(Integer guideType) {
		this.guideType = guideType;
	}

	public String getBuyerPayAccount() {
		return buyerPayAccount;
	}

	public void setBuyerPayAccount(String buyerPayAccount) {
		this.buyerPayAccount = buyerPayAccount;
	}

	public Date getOpTime() {
		return opTime;
	}

	public void setOpTime(Date opTime) {
		this.opTime = opTime;
	}

	public boolean isRePay() {
		return rePay;
	}

	public void setRePay(boolean rePay) {
		this.rePay = rePay;
	}

	public Integer getRebateType() {
		return rebateType;
	}

	public void setRebateType(Integer rebateType) {
		this.rebateType = rebateType;
	}
}