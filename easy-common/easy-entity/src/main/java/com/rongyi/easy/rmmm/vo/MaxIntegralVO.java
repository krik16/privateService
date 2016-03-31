/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.math.BigDecimal;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年7月27日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年7月27日 1.0 创建文件
 */
public class MaxIntegralVO {

	private int maxIntegral;// 最大抵扣积分

	private double integralRatio;// 积分抵扣比例

	private int myIntegral;// 我的积分
	
	private Integer rebateNum = 0;// 可使用抵扣券数量
	
	private Integer hongBaoNum = 0;// 可使用红包数量
	
	private BigDecimal realOrderPrice;//不包含积分的支付价格

	public BigDecimal getRealOrderPrice() {
		return realOrderPrice;
	}

	public void setRealOrderPrice(BigDecimal realOrderPrice) {
		this.realOrderPrice = realOrderPrice;
	}

	public Integer getRebateNum() {
		return rebateNum;
	}

	public void setRebateNum(Integer rebateNum) {
		this.rebateNum = rebateNum;
	}

	public Integer getHongBaoNum() {
		return hongBaoNum;
	}

	public void setHongBaoNum(Integer hongBaoNum) {
		this.hongBaoNum = hongBaoNum;
	}

	public int getMaxIntegral() {
		return maxIntegral;
	}

	public void setMaxIntegral(int maxIntegral) {
		this.maxIntegral = maxIntegral;
	}

	public double getIntegralRatio() {
		return integralRatio;
	}

	public void setIntegralRatio(double integralRatio) {
		this.integralRatio = integralRatio;
	}

	public int getMyIntegral() {
		return myIntegral;
	}

	public void setMyIntegral(int myIntegral) {
		this.myIntegral = myIntegral;
	}

}
