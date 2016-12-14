package com.rongyi.easy.ryoms.user.param;

import java.io.Serializable;

public class RoleParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1312922967054366873L;

	private Integer id;//角色id
	
	private String name;//角色名称
	
	private String remark;//备注
	
	private Byte status;//0启用  1停用
	
	private String reason;//停用理由

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "RoleParam [id=" + id + ", name=" + name + ", remark=" + remark
				+ ", status=" + status + ", reason=" + reason + "]";
	}

	
}
