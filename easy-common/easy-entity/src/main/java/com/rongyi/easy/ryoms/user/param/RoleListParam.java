package com.rongyi.easy.ryoms.user.param;

import java.io.Serializable;

import com.rongyi.easy.bsoms.param.BaseParam;

public class RoleListParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8901328770556663385L;

	private String name;//角色名称
	
	private Integer status;//状态   0 正常，1停用， 空值为全部

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RoleListParam [name=" + name + ", status=" + status + "]";
	}
	
	
	
}
