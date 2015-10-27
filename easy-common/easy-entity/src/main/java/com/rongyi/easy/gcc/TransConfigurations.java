package com.rongyi.easy.gcc;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransConfigurations implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1069138562075625222L;
	private int CommissionCountMax  = 0;//这个是同一卖家在同一天与同一买家交易量中，最多能获取的返佣单数
	private int CashCouponUseMax = 0;//这个是同一个买家同一天允许使用的现金卷的次数
	private BigDecimal  CommissionPrice = new BigDecimal(0); //这个是每单返回佣金的金额	
	private int SettleDateEarly = 0;//范围1-28   这个是月初结算日
	private int SettleDateLate = 0;//范围1-28    这个是月末结算日
	private int DrawCountMax = 0;//这个是同一天同一个卖家允许提现的次数

	/**
	 * 以下是买手相关的配置
	 */
	private int MaiShouCommissionCountMax  = 0;//这个是同一卖家在同一天与同一买家交易量中，最多能获取的返佣单数-买手
	private int MaiShouCashCouponUseMax = 0;//这个是同一个买家同一天允许使用的现金卷的次数-买手
	private BigDecimal MaiShouCommissionPrice = new BigDecimal(0);//返佣金额-买手
	private int MaiShouSettleDateEarly = 0;//范围1-28   这个是月初结算日-买手
	private int MaiShouSettleDateLate = 0;//范围1-28    这个是月末结算日-买手
	private int MaiShouDrawCountMax = 0;//这个是同一天同一个卖家允许提现的次数-买手

	public BigDecimal getMaiShouCommissionPrice() {
		return MaiShouCommissionPrice;
	}

	public void setMaiShouCommissionPrice(BigDecimal maiShouCommissionPrice) {
		MaiShouCommissionPrice = maiShouCommissionPrice;
	}

	public int getMaiShouSettleDateEarly() {
		return MaiShouSettleDateEarly;
	}

	public void setMaiShouSettleDateEarly(int maiShouSettleDateEarly) {
		MaiShouSettleDateEarly = maiShouSettleDateEarly;
	}

	public int getMaiShouSettleDateLate() {
		return MaiShouSettleDateLate;
	}

	public void setMaiShouSettleDateLate(int maiShouSettleDateLate) {
		MaiShouSettleDateLate = maiShouSettleDateLate;
	}

	public int getMaiShouDrawCountMax() {
		return MaiShouDrawCountMax;
	}

	public void setMaiShouDrawCountMax(int maiShouDrawCountMax) {
		MaiShouDrawCountMax = maiShouDrawCountMax;
	}

	public int getCommissionCountMax() {
		return CommissionCountMax;
	}
	public void setCommissionCountMax(int commissionCountMax) {
		CommissionCountMax = commissionCountMax;
	}
	public int getCashCouponUseMax() {
		return CashCouponUseMax;
	}
	public void setCashCouponUseMax(int cashCouponUseMax) {
		CashCouponUseMax = cashCouponUseMax;
	}
	public BigDecimal getCommissionPrice() {
		return CommissionPrice;
	}
	public void setCommissionPrice(BigDecimal commissionPrice) {
		CommissionPrice = commissionPrice;
	}
	public int getSettleDateEarly() {
		return SettleDateEarly;
	}
	public void setSettleDateEarly(int settleDateEarly) {
		SettleDateEarly = settleDateEarly;
	}
	public int getSettleDateLate() {
		return SettleDateLate;
	}
	public void setSettleDateLate(int settleDateLate) {
		SettleDateLate = settleDateLate;
	}
	public int getDrawCountMax() {
		return DrawCountMax;
	}
	public void setDrawCountMax(int drawCountMax) {
		DrawCountMax = drawCountMax;
	}
	
}
