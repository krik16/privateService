package com.rongyi.easy.coupon.vo.operation;

import java.io.Serializable;

/**
 * @Description:统计卡券各个状态数量
 * @author:lqy
 * @time:2015年7月31日 下午6:08:29
 */
public class CouponCountVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 总数量
	 */
	private Integer count_all;

	/**
	 * 待审核数量
	 */
	private Integer count_uncheck;

	/**
	 * 审核未通过数量
	 */
	private Integer count_unpass;

	/**
	 * 待发布数量
	 */
	private Integer count_unpublish;

	/**
	 * 进行中数量
	 */
	private Integer count_proceeing;

	/**
	 * 已结束数量
	 */
	private Integer count_ended;

	/**
	 * 已下架数量
	 */
	private Integer count_off;

	public Integer getCount_all() {
		return count_all;
	}

	public void setCount_all(Integer count_all) {
		this.count_all = count_all;
	}

	public Integer getCount_uncheck() {
		return count_uncheck;
	}

	public void setCount_uncheck(Integer count_uncheck) {
		this.count_uncheck = count_uncheck;
	}

	public Integer getCount_unpass() {
		return count_unpass;
	}

	public void setCount_unpass(Integer count_unpass) {
		this.count_unpass = count_unpass;
	}

	public Integer getCount_unpublish() {
		return count_unpublish;
	}

	public void setCount_unpublish(Integer count_unpublish) {
		this.count_unpublish = count_unpublish;
	}

	public Integer getCount_proceeing() {
		return count_proceeing;
	}

	public void setCount_proceeing(Integer count_proceeing) {
		this.count_proceeing = count_proceeing;
	}

	public Integer getCount_ended() {
		return count_ended;
	}

	public void setCount_ended(Integer count_ended) {
		this.count_ended = count_ended;
	}

	public Integer getCount_off() {
		return count_off;
	}

	public void setCount_off(Integer count_off) {
		this.count_off = count_off;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponCountVO [count_all=").append(count_all).append(", count_uncheck=").append(count_uncheck)
				.append(", count_unpass=").append(count_unpass).append(", count_unpublish=").append(count_unpublish)
				.append(", count_proceeing=").append(count_proceeing).append(", count_ended=").append(count_ended)
				.append(", count_off=").append(count_off).append("]");
		return builder.toString();
	}

}
