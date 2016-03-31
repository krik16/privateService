package com.rongyi.easy.coupon.vo;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 提供给摩店 (订单管理)红包VO
 * @author hebo
 *
 */
public class MMUserCouponVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String couponCode;// 卡券码

    private String title;// 券名称

    private BigDecimal discount;// 抵扣金额(红包面值)

    private String validBeginDate;// 有效期开始时间

    private String validEndDate;// 有效期结束时间
    
    private BigDecimal realDiscount;//该商品子实际抵扣金额

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getValidBeginDate() {
		return validBeginDate;
	}

	public void setValidBeginDate(String validBeginDate) {
		this.validBeginDate = validBeginDate;
	}

	public String getValidEndDate() {
		return validEndDate;
	}

	public void setValidEndDate(String validEndDate) {
		this.validEndDate = validEndDate;
	}

	public BigDecimal getRealDiscount() {
		return realDiscount;
	}

	public void setRealDiscount(BigDecimal realDiscount) {
		this.realDiscount = realDiscount;
	}

	@Override
	public String toString() {
		return "MMUserCouponVO [couponCode=" + couponCode + ", title=" + title
				+ ", discount=" + discount + ", validBeginDate="
				+ validBeginDate + ", validEndDate=" + validEndDate
				+ ", realDiscount=" + realDiscount + "]";
	}
	
	
}
