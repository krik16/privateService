package com.rongyi.easy.coupon.vo.operation;

import java.util.Date;

/**
 * @author lqy
 * 券码明细VO
 */
public class CouponCodeInfoVO {
	/**
	 * 券码
	 */
	private String couponCode;
	
	/**
	 * 订单编号
	 */
	private String orderNo;
	
	/**
	 * 状态
	 */
	private Integer status;
	
	/**
	 * 领取账号
	 */
	private String userAccount;
	
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 领取渠道
	 */
	private String channel;
	
	/**
	 * 领取时间
	 */
	private Date receive_at;
	
	/**
	 * 使用时间
	 */
	private Date use_at;

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Date getReceive_at() {
		return receive_at;
	}

	public void setReceive_at(Date receive_at) {
		this.receive_at = receive_at;
	}

	public Date getUse_at() {
		return use_at;
	}

	public void setUse_at(Date use_at) {
		this.use_at = use_at;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponCodeInfoVO [couponCode=").append(couponCode).append(", orderNo=").append(orderNo)
				.append(", status=").append(status).append(", userAccount=").append(userAccount).append(", name=")
				.append(name).append(", channel=").append(channel).append(", receive_at=").append(receive_at)
				.append(", use_at=").append(use_at).append("]");
		return builder.toString();
	}
}
