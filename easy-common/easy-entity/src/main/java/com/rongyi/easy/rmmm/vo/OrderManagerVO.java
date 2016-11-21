package com.rongyi.easy.rmmm.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
	private BigDecimal hbAmount;//红包抵扣
	private Integer orderSource;//订单来源
	private Integer activityType;//活动类型 0不参与活动 3秒杀 4拼团
	private Long activityRoundId;//活动场次
	private String activityName;//活动名称
	private String activityStatus;//活动状态

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

	public BigDecimal getHbAmount() {
		return hbAmount;
	}

	public void setHbAmount(BigDecimal hbAmount) {
		this.hbAmount = hbAmount;
	}

	public Integer getActivityType() {
		return activityType;
	}

	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}

	public Long getActivityRoundId() {
		return activityRoundId;
	}

	public void setActivityRoundId(Long activityRoundId) {
		this.activityRoundId = activityRoundId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}

}
