package com.rongyi.easy.rmmm.vo;

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
	private Byte payChannel;

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
