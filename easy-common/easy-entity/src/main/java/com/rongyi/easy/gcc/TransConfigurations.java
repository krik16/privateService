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
	private BigDecimal MaiShouCommissionPirce = new BigDecimal(0);//买手返佣金额

	public BigDecimal getMaiShouCommissionPirce() {
		return MaiShouCommissionPirce;
	}

	public void setMaiShouCommissionPirce(BigDecimal maiShouCommissionPirce) {
		MaiShouCommissionPirce = maiShouCommissionPirce;
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
