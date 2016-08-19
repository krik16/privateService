package com.rongyi.easy.rmmm.vo.commission;

import java.io.Serializable;

public class CommissionDiscountVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;//容易逛，导购，买手，摩店用户
	private Double commission;//佣金金额
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getCommission() {
		return commission;
	}
	public void setCommission(Double commission) {
		this.commission = commission;
	}
	
}
