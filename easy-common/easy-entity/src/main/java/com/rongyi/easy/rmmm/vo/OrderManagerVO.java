package com.rongyi.easy.rmmm.vo;

import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderManagerVO implements Serializable {

	private static final long serialVersionUID = -3282385450935379778L;
	/**  大订单号 */
	private String orderNo;
	private Integer orderId;
	/**  昵称 */
	private String nickname;
	/**  用户名 */
	private String userId;
	private String username;
	private String mallName;
	private String shopName;
	/**  订单状态 */
	private String status;
	/**  状态路径 */
	private String statusRoute;
	/**  实际运费 */
	private BigDecimal expressFee;
	/** 订单总价 */
	private BigDecimal orderTotalAmount;
	private Date createAt;
	/** 折扣 */
	private BigDecimal discountFee;
	private Integer guideType;
	private Byte payChannel;//支付渠道
	private String orderCartNo;//母订单号
	private String sellerAccount;//卖家账号
	private BigDecimal realAmount;//订单金额
	private BigDecimal payAmount;//支付金额
	private BigDecimal couponAmount;//平台促销抵扣
	private BigDecimal integralAmount;//积分抵扣
	private Integer orderSource;//订单来源



	/**
	 * 商品编码
	 */
	private String commodityMid;
	/**
	 * 购买数量
	 */
	private Integer quantity;
	/**
	 * 商品规格id
	 */
	private String commoditySpecMid;

	/**
	 * 商品名称
	 */
	private String commodityName;
	/**
	 * 商品编码
	 */
	private String commodityNo;

	/**
	 * 商品现价
	 */
	private String commodityCurrentPrice;

	/**
	 * 规格
	 */
	private List<CommoditySpecColumnVO> CommoditySpecColumnList;

	/**
	 * 商品图片
	 */
	List<String> picList;

	/*
	 *单价
	 */
	private Double unitPrice;
	public String getOrderCartNo() {
		return orderCartNo;
	}

	public void setOrderCartNo(String orderCartNo) {
		this.orderCartNo = orderCartNo;
	}

	public String getSellerAccount() {
		return sellerAccount;
	}

	public void setSellerAccount(String sellerAccount) {
		this.sellerAccount = sellerAccount;
	}

	public BigDecimal getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(BigDecimal realAmount) {
		this.realAmount = realAmount;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public BigDecimal getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}

	public BigDecimal getIntegralAmount() {
		return integralAmount;
	}

	public void setIntegralAmount(BigDecimal integralAmount) {
		this.integralAmount = integralAmount;
	}

	public Integer getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(Integer orderSource) {
		this.orderSource = orderSource;
	}

	public Byte getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(Byte payChannel) {
		this.payChannel = payChannel;
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
	public BigDecimal getOrderTotalAmount() {
		return orderTotalAmount;
	}
	public void setOrderTotalAmount(BigDecimal orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusRoute() {
		return statusRoute;
	}
	public void setStatusRoute(String statusRoute) {
		this.statusRoute = statusRoute;
	}
	public BigDecimal getExpressFee() {
		return expressFee;
	}
	public void setExpressFee(BigDecimal expressFee) {
		this.expressFee = expressFee;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCommodityMid() {
		return commodityMid;
	}

	public void setCommodityMid(String commodityMid) {
		this.commodityMid = commodityMid;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getCommoditySpecMid() {
		return commoditySpecMid;
	}

	public void setCommoditySpecMid(String commoditySpecMid) {
		this.commoditySpecMid = commoditySpecMid;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public List<CommoditySpecColumnVO> getCommoditySpecColumnList() {
		return CommoditySpecColumnList;
	}

	public void setCommoditySpecColumnList(List<CommoditySpecColumnVO> commoditySpecColumnList) {
		CommoditySpecColumnList = commoditySpecColumnList;
	}

	public String getCommodityNo() {
		return commodityNo;
	}

	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}

	public List<String> getPicList() {
		return picList;
	}

	public void setPicList(List<String> picList) {
		this.picList = picList;
	}

	public String getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}

	public void setCommodityCurrentPrice(String commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "OrderManagerVO [orderNo=" + orderNo + ", orderId=" + orderId
				+ ", nickname=" + nickname + ", userId=" + userId
				+ ", username=" + username + ", mallName=" + mallName
				+ ", shopName=" + shopName + ", status=" + status
				+ ", statusRoute=" + statusRoute + ", expressFee=" + expressFee
				+ ", orderTotalAmount=" + orderTotalAmount + ", createAt="
				+ createAt + ", discountFee=" + discountFee + "]";
	}
	
}
