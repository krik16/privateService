package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class ExpressOrderInfoVO implements Serializable{
	
	private String company;//公司编码
	
	private Integer expressId;//相关物流公司ID，等于或者小于0时是自填
	
	private String expressBillId;//物流单号

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getExpressId() {
		return expressId;
	}

	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}

	public String getExpressBillId() {
		return expressBillId;
	}

	public void setExpressBillId(String expressBillId) {
		this.expressBillId = expressBillId;
	}

	@Override
	public String toString() {
		return "ExpressOrderInfoVO [company=" + company + ", expressId="
				+ expressId + ", expressBillId=" + expressBillId + "]";
	}

}
