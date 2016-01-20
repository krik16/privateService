/** 
 * @Title: VirtualAccountVO.java 
 * @Package com.rongyi.easy.va.vo 
 * @Description: 虚拟账户综合查询视图
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月25日 下午4:54:41 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.easy.va.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ZhengYl
 * 
 */
public class VirtualAccountVO implements Serializable {
	private static final long serialVersionUID = -7647979818874548559L;

	/** 用户id */
	private String userId;

	/** 用户名 */
	private String userName;

	/** 是否冻结 */
	private Boolean isSuspended;
	
	/** 是否冻结 */
	private Date stopAt;
	
	/** 冻结原因 */
	private String stopReason;

	/** 账户余额 */
	private BigDecimal balance;

	/** 交易额总计 */
	private BigDecimal tradeTotal;

	/** 交易额今日 */
	private BigDecimal tradeDaily;

	/** 奖金今日 */
	private BigDecimal bonusDaily;

	/** 收入总计 */
	private BigDecimal incomeTotal;

	/** 提现总计 */
	private BigDecimal drawnTotal;

	/** 奖金总计 */
	private BigDecimal bonusTotal;

	/** 返佣总计 */
	private BigDecimal commissionTotal;

	/** 提现中 */
	private BigDecimal drawForAuditTotal;

	/** 返佣审核中 */
	private BigDecimal commissionForAuditTotal;
	
	/**
	 * 失败佣金
	 */
	private BigDecimal faleCommissionMonth;
	
	/**
	 * 总佣金收入（包含交易佣金，优惠券佣金，奖金佣金）
	 */
	private BigDecimal commissionIncome;
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getIncomeTotal() {
		return incomeTotal;
	}

	public void setIncomeTotal(BigDecimal incomeTotal) {
		this.incomeTotal = incomeTotal;
	}

	public BigDecimal getDrawnTotal() {
		return drawnTotal;
	}

	public void setDrawnTotal(BigDecimal drawnTotal) {
		this.drawnTotal = drawnTotal;
	}

	public BigDecimal getTradeTotal() {
		return tradeTotal;
	}

	public void setTradeTotal(BigDecimal tradeTotal) {
		this.tradeTotal = tradeTotal;
	}

	public BigDecimal getTradeDaily() {
		return tradeDaily;
	}

	public void setTradeDaily(BigDecimal tradeDaily) {
		this.tradeDaily = tradeDaily;
	}

	public BigDecimal getBonusDaily() {
		return bonusDaily;
	}

	public void setBonusDaily(BigDecimal bonusDaily) {
		this.bonusDaily = bonusDaily;
	}

	public BigDecimal getDrawForAuditTotal() {
		return drawForAuditTotal;
	}

	public void setDrawForAuditTotal(BigDecimal drawForAuditTotal) {
		this.drawForAuditTotal = drawForAuditTotal;
	}

	public BigDecimal getCommissionForAuditTotal() {
		return commissionForAuditTotal;
	}

	public void setCommissionForAuditTotal(BigDecimal commissionForAuditTotal) {
		this.commissionForAuditTotal = commissionForAuditTotal;
	}

	public BigDecimal getBonusTotal() {
		return bonusTotal;
	}

	public void setBonusTotal(BigDecimal bonusTotal) {
		this.bonusTotal = bonusTotal;
	}

	public BigDecimal getCommissionTotal() {
		return commissionTotal;
	}

	public void setCommissionTotal(BigDecimal commissionTotal) {
		this.commissionTotal = commissionTotal;
	}

	public Boolean getIsSuspended() {
		return isSuspended;
	}

	public void setIsSuspended(Boolean isSuspended) {
		this.isSuspended = isSuspended;
	}

	public String getStopReason() {
		return stopReason;
	}

	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}

	public BigDecimal getFaleCommissionMonth() {
		return faleCommissionMonth;
	}

	public void setFaleCommissionMonth(BigDecimal faleCommissionMonth) {
		this.faleCommissionMonth = faleCommissionMonth;
	}

	public BigDecimal getCommissionIncome() {
		return commissionIncome;
	}

	public void setCommissionIncome(BigDecimal commissionIncome) {
		this.commissionIncome = commissionIncome;
	}

	public Date getStopAt() {
		return stopAt;
	}

	public void setStopAt(Date stopAt) {
		this.stopAt = stopAt;
	}
	
	
}