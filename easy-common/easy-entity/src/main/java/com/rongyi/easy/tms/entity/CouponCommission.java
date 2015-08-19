package com.rongyi.easy.tms.entity;

import java.io.Serializable;
import java.util.Date;

public class CouponCommission implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 331839316938693375L;

	private Integer id;

	/**
	 * 导购ID
	 */
	private String guideId;

	/**
	 * 优惠券码
	 */
	private String couponCode;

	/**
	 * 佣金金额
	 */
	private Double commissionAmount;

	/**
	 * 买家ID
	 */
	private String buyerId;

	/**
	 * 创建时间
	 */
	private Date createAt;

	/**
	 * 状态
	 */
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGuideId() {
		return guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}


	public Double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}