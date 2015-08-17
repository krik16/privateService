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
	private Date receive_dt;
	
	/**
	 * 使用时间
	 */
	private Date use_dt;

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

	public Date getReceive_dt() {
		return receive_dt;
	}

	public void setReceive_dt(Date receive_dt) {
		this.receive_dt = receive_dt;
	}

	public Date getUse_dt() {
		return use_dt;
	}

	public void setUse_dt(Date use_dt) {
		this.use_dt = use_dt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponCodeInfoVO [couponCode=").append(couponCode).append(", orderNo=").append(orderNo)
				.append(", status=").append(status).append(", userAccount=").append(userAccount).append(", name=")
				.append(name).append(", channel=").append(channel).append(", receive_dt=").append(receive_dt)
				.append(", use_dt=").append(use_dt).append("]");
		return builder.toString();
	}
	
}
