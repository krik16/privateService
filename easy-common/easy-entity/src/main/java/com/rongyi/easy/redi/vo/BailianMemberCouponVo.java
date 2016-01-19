package com.rongyi.easy.redi.vo;

import com.rongyi.core.common.util.DateUtil;

public class BailianMemberCouponVo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String couponName;
	private String couponListUrl;
	private String effectiveTime;
	private String expireTime;
	private String couponDesc;
	private String couponType;
	private String couponPicUrl;
	private String couponStatus;
	private String validType;
	private String couponDetailUrl;
	private Integer waitDays;
	private Integer effectDays;
	private String couponShortDesc;
	private String erCode;
	private String couponId;
	private Integer showOrder;
	private String couponStatusId;
	private String enableTimeDescription;

	public BailianMemberCouponVo() {
		super();
	}

	public BailianMemberCouponVo(Integer id, String couponName, String couponListUrl, String effectiveTime, String expireTime, String couponDesc, String couponType, String couponPicUrl, String couponStatus, String validType, String couponDetailUrl, Integer waitDays, Integer effectDays, String couponShortDesc, String erCode, String couponId, Integer showOrder, String couponStatusId,String enableTimeDescription) {
		super();
		this.id = id;
		this.couponName = couponName;
		this.couponListUrl = couponListUrl;
		this.effectiveTime = effectiveTime;
		this.expireTime = expireTime;
		this.couponDesc = couponDesc;
		this.couponType = couponType;
		this.couponPicUrl = couponPicUrl;
		this.couponStatus = couponStatus;
		this.validType = validType;
		this.couponDetailUrl = couponDetailUrl;
		this.waitDays = waitDays;
		this.effectDays = effectDays;
		this.couponShortDesc = couponShortDesc;
		this.erCode = erCode;
		this.couponId = couponId;
		this.showOrder = showOrder;
		this.couponStatusId = couponStatusId;
		this.enableTimeDescription = enableTimeDescription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponListUrl() {
		return couponListUrl;
	}

	public void setCouponListUrl(String couponListUrl) {
		this.couponListUrl = couponListUrl;
	}

	public String getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getCouponDesc() {
		return couponDesc;
	}

	public void setCouponDesc(String couponDesc) {
		this.couponDesc = couponDesc;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getCouponPicUrl() {
		return couponPicUrl;
	}

	public void setCouponPicUrl(String couponPicUrl) {
		this.couponPicUrl = couponPicUrl;
	}

	public String getCouponStatus() {
		return couponStatus;
	}

	public void setCouponStatus(String couponStatus) {
		this.couponStatus = couponStatus;
	}

	public String getValidType() {
		return validType;
	}

	public void setValidType(String validType) {
		this.validType = validType;
	}

	public String getCouponDetailUrl() {
		return couponDetailUrl;
	}

	public void setCouponDetailUrl(String couponDetailUrl) {
		this.couponDetailUrl = couponDetailUrl;
	}

	public Integer getWaitDays() {
		return waitDays;
	}

	public void setWaitDays(Integer waitDays) {
		this.waitDays = waitDays;
	}

	public Integer getEffectDays() {
		return effectDays;
	}

	public void setEffectDays(Integer effectDays) {
		this.effectDays = effectDays;
	}

	public String getCouponShortDesc() {
		return couponShortDesc;
	}

	public void setCouponShortDesc(String couponShortDesc) {
		this.couponShortDesc = couponShortDesc;
	}

	public String getErCode() {
		return erCode;
	}

	public void setErCode(String erCode) {
		this.erCode = erCode;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public Integer getShowOrder() {
		return showOrder;
	}

	public void setShowOrder(Integer showOrder) {
		this.showOrder = showOrder;
	}

	public String getCouponStatusId() {
		return couponStatusId;
	}

	public void setCouponStatusId(String couponStatusId) {
		this.couponStatusId = couponStatusId;
	}
	
	public String getEnableTimeDescription() {
		return enableTimeDescription;
	}

	public void setEnableTimeDescription(String enableTimeDescription) {
		this.enableTimeDescription = enableTimeDescription;
	}
}