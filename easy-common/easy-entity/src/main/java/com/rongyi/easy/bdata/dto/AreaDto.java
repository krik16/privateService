package com.rongyi.easy.bdata.dto;

import java.io.Serializable;

public class AreaDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;      
	private Integer areaId;       //区域ID
	private Integer parentId;     //父级ID
	private String cnname;        //名称
	private String name;          //拼音名称
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
