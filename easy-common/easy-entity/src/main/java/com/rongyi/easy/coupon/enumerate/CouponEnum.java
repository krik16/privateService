package com.rongyi.easy.coupon.enumerate;

/**
 * @Description:卡券枚举
 * @author:lqy
 * @time:2015年7月21日 下午3:10:57
 */
public enum CouponEnum {

	/** Coupon start */
	/** 卡券类型 couponType */
	VOUCHER(0,"代金券"), REBATE(1,"抵扣券"), REDENVELOPE(2,"红包"),
	
	/** 验证方式 validateType */
	AFTER_CHECK(0,"容易后验证"), INTERACT_CHECK(1,"互动屏票据"), ALL(2,"两者兼容"),
	
	/** 卡券关联类型 relatedType */
	GROUP(0,"集团"), BRAND(1,"品牌"), MALL(2,"商场"), SHOP(3,"店铺"), ALL_COURT(0,"全场"), COMMODITY(1,"商品"),
	
	/** 卡券发布渠道 publishChannel */
	OPERATION(0,"大运营平台"), MERCHANT(1,"商家管理后台"),
	
	/** 状态 status */
	UNCHECK(0,"待审核"), UNPASS(1,"未通过"), PASS(2,"已通过"),
	/** Coupon end */
	
	
	/** CouponRejectRecord start */
	/** 审核下架记录类型 type */
	VERIFY(0,"审核"), OFFSTOCK(1,"下架"),
	/** CouponRejectRecord end */
	
	
	/** VoucherCouponParam start */
	
	/** 发布状态 publishStatus */
	UNPUBLISH(0,"待发布"), PROCEEING(1,"进行中"), ENDED(2,"已结束"), OFF(3,"已下架"),
	
	/** 时间类型 dateType  */
	PUBLISH_START(0,"发布开始时间"), PUBLISH_END(1,"发布结束时间"), VALID_START(2,"有效期开始时间"), VALID_END(3,"有效期结束时间"),
	
	/** 置顶状态 stickStatus*/
	UNSTICK(0,"未置顶"), STICKED(1,"已置顶"),
	
	/** VoucherCouponParam end */
	
	/** tab */
	TAB_ALL("all","全部"), TAB_STICKED("sticked","已置顶"), TAB_UNCHECK("uncheck","待审核"), TAB_PASS("PASS","已审核"), TAB_PROCEEING("proceeing","进行中"),
	
	SUCCESS(1,"正常"), ERROR(0,"系统错误"), ERROR_PARAM(0,"参数不合法");
	
	private Integer value;
	
	private String message;
	
	private String valueStr;
	
	private CouponEnum(Integer value, String message) {
		this.value = value;
		this.message = message;
	}
	
	private CouponEnum(String valueStr, String message) {
		this.valueStr = valueStr;
		this.message = message;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public String getMessage() {
		return message;
	}

	public String getValueStr() {
		return valueStr;
	}

	public void setValueStr(String valueStr) {
		this.valueStr = valueStr;
	}
	
}
