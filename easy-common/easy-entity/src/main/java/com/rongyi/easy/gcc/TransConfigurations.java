package com.rongyi.easy.gcc;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransConfigurations implements Serializable{

	private static final long serialVersionUID = 1L;


	private int CommissionCountMax  = 0;//这个是同一卖家在同一天与同一买家交易量中，最多能获取的返佣单数
	private int CashCouponUseMax = 0;//这个是同一个买家同一天允许使用的现金卷的次数
	private BigDecimal  CommissionPrice = new BigDecimal(0); //这个是每单返回佣金的金额	
	private int SettleDateEarly = 0;//范围1-28   这个是月初结算日
	private int SettleDateLate = 0;//范围1-28    这个是月末结算日
	private int DrawCountMax = 0;//这个是同一天同一个卖家允许提现的次数

	/*俞志坚 新加字段 有时间你们记得重构吧*/
	//验码返佣金
	private BigDecimal  checkCodePrice = new BigDecimal(0); //这个是每单返回佣金的金额
	private int checkCodeDateEarly = 0;//范围1-28   这个是月初结算日 开始日期
	private int checkCodeDateLate = 0;//范围1-28    这个是月末结算日 结束日期
	private int checkCodeMax = 0;//同一导购最多能获取反单数
	//首单返佣金
	private BigDecimal  firstPrice = new BigDecimal(0); //这个是每单返回佣金的金额
	private int firstDateEarly = 0;//范围1-28   这个是月初结算日 开始日期
	private int firstDateLate = 0;//范围1-28    这个是月末结算日 结束日期
	private int firstMax = 0;//同一导购最多能获取反单数
	//注册返佣
	private BigDecimal  registPrice = new BigDecimal(0); //这个是每单返回佣金的金额
	private int  registType= 0;// 0表示系统 1 表示手动
	private int registMax = 0;//同一导购最多能获取反单数


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

	public BigDecimal getCheckCodePrice() {
		return checkCodePrice;
	}

	public void setCheckCodePrice(BigDecimal checkCodePrice) {
		this.checkCodePrice = checkCodePrice;
	}

	public int getCheckCodeDateEarly() {
		return checkCodeDateEarly;
	}

	public void setCheckCodeDateEarly(int checkCodeDateEarly) {
		this.checkCodeDateEarly = checkCodeDateEarly;
	}

	public int getCheckCodeDateLate() {
		return checkCodeDateLate;
	}

	public void setCheckCodeDateLate(int checkCodeDateLate) {
		this.checkCodeDateLate = checkCodeDateLate;
	}

	public int getCheckCodeMax() {
		return checkCodeMax;
	}

	public void setCheckCodeMax(int checkCodeMax) {
		this.checkCodeMax = checkCodeMax;
	}

	public BigDecimal getFirstPrice() {
		return firstPrice;
	}

	public void setFirstPrice(BigDecimal firstPrice) {
		this.firstPrice = firstPrice;
	}

	public int getFirstDateEarly() {
		return firstDateEarly;
	}

	public void setFirstDateEarly(int firstDateEarly) {
		this.firstDateEarly = firstDateEarly;
	}

	public int getFirstDateLate() {
		return firstDateLate;
	}

	public void setFirstDateLate(int firstDateLate) {
		this.firstDateLate = firstDateLate;
	}

	public int getFirstMax() {
		return firstMax;
	}

	public void setFirstMax(int firstMax) {
		this.firstMax = firstMax;
	}

	public BigDecimal getRegistPrice() {
		return registPrice;
	}

	public void setRegistPrice(BigDecimal registPrice) {
		this.registPrice = registPrice;
	}

	public int getRegistType() {
		return registType;
	}

	public void setRegistType(int registType) {
		this.registType = registType;
	}

	public int getRegistMax() {
		return registMax;
	}

	public void setRegistMax(int registMax) {
		this.registMax = registMax;
	}
}
