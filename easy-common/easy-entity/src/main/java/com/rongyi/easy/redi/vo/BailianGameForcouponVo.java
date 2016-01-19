package com.rongyi.easy.redi.vo;

public class BailianGameForcouponVo implements java.io.Serializable{

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
	private String couponPicUrl;// String 否 优惠券图片url
	private String couponListPic;// String 是 优惠券分类: 0： 购物折扣券，1：餐饮折扣券，2：停车券，3：线下赠品
	private String couponDetailPic ;
	private String couponType;
	private String offsetAmount;// BigDecimal 是 券面值
	private String erCode;// String 是 二维码串
	private String resCode ;
	
	
	
	public BailianGameForcouponVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BailianGameForcouponVo(String id, String couponName,
			String couponId, String effectiveTime, String expireTime,
			String couponDesc, String couponPicUrl, String couponListPic,
			String couponDetailPic, String couponType, String offsetAmount,
			String erCode, String resCode) {
		super();
		this.id = id;
		this.couponName = couponName;
		this.couponId = couponId;
		this.effectiveTime = effectiveTime;
		this.expireTime = expireTime;
		this.couponDesc = couponDesc;
		this.couponPicUrl = couponPicUrl;
		this.couponListPic = couponListPic;
		this.couponDetailPic = couponDetailPic;
		this.couponType = couponType;
		this.offsetAmount = offsetAmount;
		this.erCode = erCode;
		this.resCode = resCode;
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
	public String getCouponPicUrl() {
		return couponPicUrl;
	}
	public void setCouponPicUrl(String couponPicUrl) {
		this.couponPicUrl = couponPicUrl;
	}
	public String getCouponListPic() {
		return couponListPic;
	}
	public void setCouponListPic(String couponListPic) {
		this.couponListPic = couponListPic;
	}
	public String getCouponDetailPic() {
		return couponDetailPic;
	}
	public void setCouponDetailPic(String couponDetailPic) {
		this.couponDetailPic = couponDetailPic;
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
	public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	
	
	


	
	
	
}