/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月7日下午6:58:40
 * @Description: TODO
 *
 **/

package com.rongyi.tms.moudle.vo;

import java.util.List;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.vo.UserCouponVO;

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
	
	public class CouponVO extends Coupon{
		/**
		 * 
		 */
		private static final long serialVersionUID = -922816277882947899L;
		/**
		 * 购买数量
		 */
		private Integer count;

		public Integer getCount() {
			return count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}
	

}
