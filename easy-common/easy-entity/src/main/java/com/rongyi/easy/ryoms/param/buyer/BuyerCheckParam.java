package com.rongyi.easy.ryoms.param.buyer;

import java.io.Serializable;

public class BuyerCheckParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2894056688660232891L;
	private Integer status;//审核状态（0:通过，1:不通过）
	private String reason;//审核不通过理由
	private Integer id;//买手账号id
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BuyerCheckParam [status=" + status + ", reason=" + reason
				+ ", id=" + id + "]";
	}
	
}
