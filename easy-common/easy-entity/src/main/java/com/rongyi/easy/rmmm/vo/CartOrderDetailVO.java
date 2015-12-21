package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CartOrderDetailVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ParentOrderVO> orderList;//中订单详情列表

	private BigDecimal rebateDiscount;// 抵扣券金额

	private String rebateName;// 抵扣券名称

	private BigDecimal scoreDiscount;// 积分抵扣金额

	private Integer score;// 使用积分

	private BigDecimal realAmount;// 总价

	private BigDecimal payAmount;// 应付价

	public List<ParentOrderVO> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<ParentOrderVO> orderList) {
		this.orderList = orderList;
	}

	public BigDecimal getRebateDiscount() {
		return rebateDiscount;
	}

	public void setRebateDiscount(BigDecimal rebateDiscount) {
		this.rebateDiscount = rebateDiscount;
	}

	public String getRebateName() {
		return rebateName;
	}

	public void setRebateName(String rebateName) {
		this.rebateName = rebateName;
	}

	public BigDecimal getScoreDiscount() {
		return scoreDiscount;
	}

	public void setScoreDiscount(BigDecimal scoreDiscount) {
		this.scoreDiscount = scoreDiscount;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public BigDecimal getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(BigDecimal realAmount) {
		this.realAmount = realAmount;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	@Override
	public String toString() {
		return "CartOrderDetailVO{" +
				"parentOrderList=" + orderList +
				", rebateDiscount='" + rebateDiscount + '\'' +
				", rebateName='" + rebateName + '\'' +
				", scoreDiscount='" + scoreDiscount + '\'' +
				", score='" + score + '\'' +
				", realAmount='" + realAmount + '\'' +
				", payAmount='" + payAmount + '\'' +
				'}';
	}
}
