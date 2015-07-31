package com.rongyi.easy.coupon.vo.operation;

/**
 * @Description:统计卡券各个状态数量
 * @author:lqy
 * @time:2015年7月31日 下午6:08:29
 */
public class CouponCountVO {

	/**
	 * 总数量
	 */
	private Integer count_all;

	/**
	 * 待审核数量
	 */
	private Integer count_0;

	/**
	 * 审核未通过数量
	 */
	private Integer count_1;

	/**
	 * 待发布数量
	 */
	private Integer count_2;

	/**
	 * 进行中数量
	 */
	private Integer count_3;

	/**
	 * 已结束数量
	 */
	private Integer count_4;

	/**
	 * 已下架数量
	 */
	private Integer count_5;

	public Integer getCount_all() {
		return count_all;
	}

	public void setCount_all(Integer count_all) {
		this.count_all = count_all;
	}

	public Integer getCount_0() {
		return count_0;
	}

	public void setCount_0(Integer count_0) {
		this.count_0 = count_0;
	}

	public Integer getCount_1() {
		return count_1;
	}

	public void setCount_1(Integer count_1) {
		this.count_1 = count_1;
	}

	public Integer getCount_2() {
		return count_2;
	}

	public void setCount_2(Integer count_2) {
		this.count_2 = count_2;
	}

	public Integer getCount_3() {
		return count_3;
	}

	public void setCount_3(Integer count_3) {
		this.count_3 = count_3;
	}

	public Integer getCount_4() {
		return count_4;
	}

	public void setCount_4(Integer count_4) {
		this.count_4 = count_4;
	}

	public Integer getCount_5() {
		return count_5;
	}

	public void setCount_5(Integer count_5) {
		this.count_5 = count_5;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponCountVO [count_all=").append(count_all)
				.append(", count_0=").append(count_0).append(", count_1=")
				.append(count_1).append(", count_2=").append(count_2)
				.append(", count_3=").append(count_3).append(", count_4=")
				.append(count_4).append(", count_5=").append(count_5)
				.append("]");
		return builder.toString();
	}
}
