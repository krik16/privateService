/** 
* @Title: OrderCouponInfo.java 
* @Package com.rongyi.easy.rmmm.vo 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年7月7日 下午3:49:54 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author ZhengYl
 *
 */
public class OrderCouponInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8418265345007036683L;

	/** 券码 */
	private String couponCode;
	
	/** 现金券模板ID */
	private String couponId;
	
	/** 现金券金额 */
	private BigDecimal couponDiscount;
	
	/** 推荐说明 */
	private String recommend;

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public BigDecimal getCouponDiscount() {
		return couponDiscount;
	}

	public void setCouponDiscount(BigDecimal couponDiscount) {
		this.couponDiscount = couponDiscount;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	
}
