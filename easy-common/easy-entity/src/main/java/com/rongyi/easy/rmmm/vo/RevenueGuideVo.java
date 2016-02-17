package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 导购收入管理首页
 * 
 * @author hebo
 * 
 */
public class RevenueGuideVo implements Serializable {

	private static final long serialVersionUID = 8615290341525164727L;

	/** 可提金额 */
	private BigDecimal amountTotal;
	/** 审核中佣金（全部） */
	private BigDecimal auditCommissionTotal;
	/** 奖励佣金（当日） */
	private BigDecimal bonusToday;
	/** 提现中金额（全部） */
	private BigDecimal drawingTotal;
	/** 交易金额（当日） */
	private BigDecimal tradeAmountToday;
	/**
	 * 失败佣金
	 */
	private BigDecimal faleCommission;
	
	private Integer drawCountMax = 0;//这个是同一天同一个卖家允许提现的次数
	
	/**  当日营业额 */
	private BigDecimal turnoverToday;

	public BigDecimal getTurnoverToday() {
		return turnoverToday;
	}

	public void setTurnoverToday(BigDecimal turnoverToday) {
		this.turnoverToday = turnoverToday;
	}

	public Integer getDrawCountMax() {
		return drawCountMax;
	}

	public void setDrawCountMax(Integer drawCountMax) {
		this.drawCountMax = drawCountMax;
	}

	public BigDecimal getAmountTotal() {
		return amountTotal;
	}

	/** 可提金额 */
	public void setAmountTotal(BigDecimal amountTotal) {
		this.amountTotal = amountTotal;
	}

	public BigDecimal getAuditCommissionTotal() {
		return auditCommissionTotal;
	}

	public void setAuditCommissionTotal(BigDecimal auditCommissionTotal) {
		this.auditCommissionTotal = auditCommissionTotal;
	}

	public BigDecimal getBonusToday() {
		return bonusToday;
	}

	public void setBonusToday(BigDecimal bonusToday) {
		this.bonusToday = bonusToday;
	}

	public BigDecimal getDrawingTotal() {
		return drawingTotal;
	}

	public void setDrawingTotal(BigDecimal drawingTotal) {
		this.drawingTotal = drawingTotal;
	}

	public BigDecimal getTradeAmountToday() {
		return tradeAmountToday;
	}

	public void setTradeAmountToday(BigDecimal tradeAmountToday) {
		this.tradeAmountToday = tradeAmountToday;
	}

	public BigDecimal getFaleCommission() {
		return faleCommission;
	}

	public void setFaleCommission(BigDecimal faleCommission) {
		this.faleCommission = faleCommission;
	}

	@Override
	public String toString() {
		return "RevenueGuideVo [amountTotal=" + amountTotal + ", auditCommissionTotal=" + auditCommissionTotal + ", bonusToday="
				+ bonusToday + ", drawingTotal=" + drawingTotal + ", tradeAmountToday=" + tradeAmountToday + ", faleCommission="
				+ faleCommission + ", drawCountMax=" + drawCountMax + ", turnoverToday=" + turnoverToday + "]";
	}

}
