package com.rongyi.easy.roa.vo;

import java.io.Serializable;

public class MallGroupVO implements Serializable{
    private static final long serialVersionUID = 1L;
	private String id;//集团ID
	private String name;//集团名称
	private Integer status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	
	
	
}
