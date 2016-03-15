package com.rongyi.easy.bdata.dto;

import java.io.Serializable;

public class AreaDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer areaId;       //区域ID
	private Integer parentId;     //父级ID
	private String cnname;        //名称
	
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getCnname() {
		return cnname;
	}
	public void setCnname(String cnname) {
		this.cnname = cnname;
	}
	
}
