package com.rongyi.easy.redi.vo;

public class BailianCouponVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;// Long 是 券id
	private String couponName;// String 是 券名称
	private String couponId;// String 是 券号
	private String effectiveTime;// String 是 生效时间
	private String expireTime;// String 是 失效时间
	private String couponDesc;// String 否 优惠券描述
	private String couponMobilePicUrl;// String 否 优惠券图片url
	private String couponType;// String 是 优惠券分类: 0： 购物折扣券，1：餐饮折扣券，2：停车券，3：线下赠品
	private String offsetAmount;// BigDecimal 是 券面值
	private String erCode;// String 是 二维码串

	
	private String couponShortDesc;
	private String couponPicUrl;
	private String couponListUrl;
	private String couponDetailUrl;
	
	private Integer pointsValue;


	public BailianCouponVo() {
		super();
	}
 
	
	public BailianCouponVo(String id, String couponName, String couponId, String effectiveTime, String expireTime, String couponDesc, String couponMobilePicUrl, String couponType, String offsetAmount, String erCode, String couponShortDesc, String couponPicUrl, String couponListUrl, String couponDetailUrl, Integer pointsValue) {
		super();
		this.id = id;
		this.couponName = couponName;
		this.couponId = couponId;
		this.effectiveTime = effectiveTime;
		this.expireTime = expireTime;
		this.couponDesc = couponDesc;
		this.couponMobilePicUrl = couponMobilePicUrl;
		this.couponType = couponType;
		this.offsetAmount = offsetAmount;
		this.erCode = erCode;
		this.couponShortDesc = couponShortDesc;
		this.couponPicUrl = couponPicUrl;
		this.couponListUrl = couponListUrl;
		this.couponDetailUrl = couponDetailUrl;
		this.pointsValue = pointsValue;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
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

	public String getCouponMobilePicUrl() {
		return couponMobilePicUrl;
	}

	public void setCouponMobilePicUrl(String couponMobilePicUrl) {
		this.couponMobilePicUrl = couponMobilePicUrl;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getOffsetAmount() {
		return offsetAmount;
	}

	public void setOffsetAmount(String offsetAmount) {
		this.offsetAmount = offsetAmount;
	}

	public String getErCode() {
		return erCode;
	}

	public void setErCode(String erCode) {
		this.erCode = erCode;
	}

	public String getCouponShortDesc() {
		return couponShortDesc;
	}

	public void setCouponShortDesc(String couponShortDesc) {
		this.couponShortDesc = couponShortDesc;
	}

	public String getCouponPicUrl() {
		return couponPicUrl;
	}

	public void setCouponPicUrl(String couponPicUrl) {
		this.couponPicUrl = couponPicUrl;
	}

	public String getCouponListUrl() {
		return couponListUrl;
	}

	public void setCouponListUrl(String couponListUrl) {
		this.couponListUrl = couponListUrl;
	}

	public String getCouponDetailUrl() {
		return couponDetailUrl;
	}

	public void setCouponDetailUrl(String couponDetailUrl) {
		this.couponDetailUrl = couponDetailUrl;
	}



	public Integer getPointsValue() {
		return pointsValue;
	}



	public void setPointsValue(Integer pointsValue) {
		this.pointsValue = pointsValue;
	}

}