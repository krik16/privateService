/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月7日下午6:58:40
 * @Description: TODO
 *
 **/

package com.rongyi.tms.moudle.vo;

import com.rongyi.easy.coupon.vo.UserCouponVO;
import com.rongyi.easy.tradecenter.TradeUserCode;

import java.util.Date;
import java.util.List;

/**	
 * @Author:  柯军
 * @Description: 优惠券明细VO 
 * @datetime:2015年9月7日下午6:58:40
 *
 **/

public class CouponOrderDetailVO extends CouponOrderVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6566859312021262905L;
	/**
	 * 券面值总价
	 */
	private Double origTotalPrice;

	/**
	 * 券现价
	 */
	private Double unitTotalPrice;


	/*
	 *红包抵扣金额
	 */
	private Double hbDiscountTotalPrice;

	/**
	 * 购买的优惠券列表
	 */
	private List<CouponVO> couponList;
	
	/**
	 * 红包使用记录
	 */
	private List<UserCouponVO> hbList;


	public List<CouponVO> getCouponList() {
		return couponList;
	}

	public void setCouponList(List<CouponVO> couponList) {
		this.couponList = couponList;
	}

	public List<UserCouponVO> getHbList() {
		return hbList;
	}

	public void setHbList(List<UserCouponVO> hbList) {
		this.hbList = hbList;
	}


	public Double getOrigTotalPrice() {
		return origTotalPrice;
	}

	public void setOrigTotalPrice(Double origTotalPrice) {
		this.origTotalPrice = origTotalPrice;
	}

	public Double getUnitTotalPrice() {
		return unitTotalPrice;
	}

	public void setUnitTotalPrice(Double unitTotalPrice) {
		this.unitTotalPrice = unitTotalPrice;
	}

	public Double getHbDiscountTotalPrice() {
		return hbDiscountTotalPrice;
	}

	public void setHbDiscountTotalPrice(Double hbDiscountTotalPrice) {
		this.hbDiscountTotalPrice = hbDiscountTotalPrice;
	}

	public class CouponVO extends TradeUserCode{
		/**
		 * 
		 */
		private static final long serialVersionUID = -922816277882947899L;
		/**
		 * 购买数量
		 */
		private Integer count;

		private Double hbDiscount;

		private Double scoreDisCount;

		private Double rebateDisCount;

		/**
		 * 每张券实收金额
		 */
		private Double payAmount;

		/**
		 * 有效期起始时间
		 */
		private Date validBeginDate;

		/**
		 * 有效期结束时间
		 */
		private Date validEndDate;

		/**
		 * 促销券补贴类型 0：平台补贴 1：商家补贴
		 */
		private Byte couponDiscountType;

		public Integer getCount() {
			return count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Double getHbDiscount() {
			return hbDiscount;
		}

		public void setHbDiscount(Double hbDiscount) {
			this.hbDiscount = hbDiscount;
		}

		public Double getScoreDisCount() {
			return scoreDisCount;
		}

		public void setScoreDisCount(Double scoreDisCount) {
			this.scoreDisCount = scoreDisCount;
		}

		public Double getPayAmount() {
			return payAmount;
		}

		public void setPayAmount(Double payAmount) {
			this.payAmount = payAmount;
		}

		public Date getValidBeginDate() {
			return validBeginDate;
		}

		public void setValidBeginDate(Date validBeginDate) {
			this.validBeginDate = validBeginDate;
		}

		public Date getValidEndDate() {
			return validEndDate;
		}

		public void setValidEndDate(Date validEndDate) {
			this.validEndDate = validEndDate;
		}

		public Double getRebateDisCount() {
			return rebateDisCount;
		}

		public void setRebateDisCount(Double rebateDisCount) {
			this.rebateDisCount = rebateDisCount;
		}

		public Byte getCouponDiscountType() {
			return couponDiscountType;
		}

		public void setCouponDiscountType(Byte couponDiscountType) {
			this.couponDiscountType = couponDiscountType;
		}
	}
	

}
