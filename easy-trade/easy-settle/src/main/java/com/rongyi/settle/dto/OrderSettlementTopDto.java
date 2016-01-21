/**   
* @Title: OrderSettlementTopVO.java 
* @Package com.rongyi.settle.dto 
* @Description: 商品对账单汇总数据Excel视图
* @author ZhengYl   
* @date 2015年12月8日 下午12:35:06 
* @version V1.0   
*/
package com.rongyi.settle.dto;

/**
 * @author ZhengYl
 *
 */
public class OrderSettlementTopDto {
	
    /** 收入类型 */
    private String incomeType;
    
    /** 订单类型 */
    private String orderType;
    
    /** 订单数量 */
    private Integer orderCount;
    
    /** 红包抵扣金额（汇总） */
    private Double hbDiscountTotal;
    
    /** 积分抵扣金额（汇总） */
    private Double scoreDiscountTotal;
    
    /** 商品订单总金额 （汇总）*/
    private Double orderAmountTotal;
    
    /** 商品订单补贴金额（汇总） */
    private Double orderDiscountTotal;

	/** 店铺名称 */
	private String shopName;

	/**
	 * @return the incomeType
	 */
	public String getIncomeType() {
		return incomeType;
	}

	/**
	 * @param incomeType the incomeType to set
	 */
	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	/**
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * @return the orderCount
	 */
	public Integer getOrderCount() {
		return orderCount;
	}

	/**
	 * @param orderCount the orderCount to set
	 */
	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	/**
	 * @return the hbDiscountTotal
	 */
	public Double getHbDiscountTotal() {
		return hbDiscountTotal;
	}

	/**
	 * @param hbDiscountTotal the hbDiscountTotal to set
	 */
	public void setHbDiscountTotal(Double hbDiscountTotal) {
		this.hbDiscountTotal = hbDiscountTotal;
	}

	/**
	 * @return the scoreDiscountTotal
	 */
	public Double getScoreDiscountTotal() {
		return scoreDiscountTotal;
	}

	/**
	 * @param scoreDiscountTotal the scoreDiscountTotal to set
	 */
	public void setScoreDiscountTotal(Double scoreDiscountTotal) {
		this.scoreDiscountTotal = scoreDiscountTotal;
	}

	/**
	 * @return the orderAmountTotal
	 */
	public Double getOrderAmountTotal() {
		return orderAmountTotal;
	}

	/**
	 * @param orderAmountTotal the orderAmountTotal to set
	 */
	public void setOrderAmountTotal(Double orderAmountTotal) {
		this.orderAmountTotal = orderAmountTotal;
	}

	/**
	 * @return the orderDiscountTotal
	 */
	public Double getOrderDiscountTotal() {
		return orderDiscountTotal;
	}

	/**
	 * @param orderDiscountTotal the orderDiscountTotal to set
	 */
	public void setOrderDiscountTotal(Double orderDiscountTotal) {
		this.orderDiscountTotal = orderDiscountTotal;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
}
