package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class IncomeDetailVo implements Serializable {

	private static final long serialVersionUID = 7266627322594910368L;
	
	/**  资金收入（积累） */
	private BigDecimal incomeTotal;
	/**  交易佣金（积累） */
	private BigDecimal commissionTotal;
	/**  奖励佣金（积累） */
	private BigDecimal bonusTotal;
	/**  已提佣金（积累） */
	private BigDecimal drawTotal;
	/**  交易金额（积累） */
	private BigDecimal tradeAmountTotal;
	
	/**  资金收入（积累） */
	public BigDecimal getIncomeTotal() {
		return incomeTotal;
	}
	/**  资金收入（积累） */
	public void setIncomeTotal(BigDecimal incomeTotal) {
		this.incomeTotal = incomeTotal;
	}
	/**  交易佣金（积累） */
	public BigDecimal getCommissionTotal() {
		return commissionTotal;
	}
	/**  交易佣金（积累） */
	public void setCommissionTotal(BigDecimal commissionTotal) {
		this.commissionTotal = commissionTotal;
	}
	/**  奖励佣金（积累） */
	public BigDecimal getBonusTotal() {
		return bonusTotal;
	}
	/**  奖励佣金（积累） */
	public void setBonusTotal(BigDecimal bonusTotal) {
		this.bonusTotal = bonusTotal;
	}
	/**  
	 * 已提佣金（积累） 
	 */
	public BigDecimal getDrawTotal() {
		return drawTotal;
	}
	/**  
	 * 已提佣金（积累）
	 */
	public void setDrawTotal(BigDecimal drawTotal) {
		this.drawTotal = drawTotal;
	}
	/**  
	 * 交易金额（积累） 
	 */
	public BigDecimal getTradeAmountTotal() {
		return tradeAmountTotal;
	}
	/**  
	 * 交易金额（积累） 
	 */
	public void setTradeAmountTotal(BigDecimal tradeAmountTotal) {
		this.tradeAmountTotal = tradeAmountTotal;
	}
	@Override
	public String toString() {
		return "IncomeDetailVo [incomeTotal=" + incomeTotal
				+ ", commissionTotal=" + commissionTotal + ", bonusTotal="
				+ bonusTotal + ", drawTotal=" + drawTotal
				+ ", tradeAmountTotal=" + tradeAmountTotal + "]";
	}

	
	
}
