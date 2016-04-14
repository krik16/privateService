/** 
 * @Title: VirtualAccountQuerySumVO.java 
 * @Package com.rongyi.va.vo 
 * @Description: 账户统计额查询视图
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月25日 下午7:05:00 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.va.vo;

import java.math.BigDecimal;

/**
 * @author ZhengYl
 * 
 */
public class VirtualAccountQuerySumVO {
	
	private String userId;
	
	/** 总收入 */
	private BigDecimal incomeSum;
	
	/** 总交易额 */
	private BigDecimal tradeSum;
	
	/** 总交易佣金收入 */
	private BigDecimal commissionSum;
	
	/**
	 * 总优惠券佣金收入
	 */
	private BigDecimal couponCommissionSum;

	/**
	 * 推广返佣收入
	 */
	private BigDecimal expandCommissionTotal;

	/**
	 * 首单返佣收入
	 */
	private BigDecimal firstCommissionTotal;

	/** 总奖金收入 */
	private BigDecimal bonusSum;
	
	/** 总提现额 */
	private BigDecimal drawSum;
	
	/** 奖金（今日） */
	private BigDecimal bonusDaily;
	
	/** 交易额（今日） */
	private BigDecimal tradeDaily;

	public BigDecimal getIncomeSum() {
		return incomeSum;
	}

	public void setIncomeSum(BigDecimal incomeSum) {
		this.incomeSum = incomeSum;
	}

	public BigDecimal getTradeSum() {
		return tradeSum;
	}

	public void setTradeSum(BigDecimal tradeSum) {
		this.tradeSum = tradeSum;
	}

	public BigDecimal getCommissionSum() {
		return commissionSum;
	}

	public void setCommissionSum(BigDecimal commissionSum) {
		this.commissionSum = commissionSum;
	}

	public BigDecimal getBonusSum() {
		return bonusSum;
	}

	public void setBonusSum(BigDecimal bonusSum) {
		this.bonusSum = bonusSum;
	}

	public BigDecimal getDrawSum() {
		return drawSum;
	}

	public void setDrawSum(BigDecimal drawSum) {
		this.drawSum = drawSum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BigDecimal getBonusDaily() {
		return bonusDaily;
	}

	public void setBonusDaily(BigDecimal bonusDaily) {
		this.bonusDaily = bonusDaily;
	}

	public BigDecimal getTradeDaily() {
		return tradeDaily;
	}

	public void setTradeDaily(BigDecimal tradeDaily) {
		this.tradeDaily = tradeDaily;
	}

	public BigDecimal getCouponCommissionSum() {
		return couponCommissionSum;
	}

	public void setCouponCommissionSum(BigDecimal couponCommissionSum) {
		this.couponCommissionSum = couponCommissionSum;
	}

	public BigDecimal getExpandCommissionTotal() {
		return expandCommissionTotal;
	}

	public void setExpandCommissionTotal(BigDecimal expandCommissionTotal) {
		this.expandCommissionTotal = expandCommissionTotal;
	}

	public BigDecimal getFirstCommissionTotal() {
		return firstCommissionTotal;
	}

	public void setFirstCommissionTotal(BigDecimal firstCommissionTotal) {
		this.firstCommissionTotal = firstCommissionTotal;
	}
}
