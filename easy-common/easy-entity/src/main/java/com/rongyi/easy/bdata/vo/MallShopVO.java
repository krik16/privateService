package com.rongyi.easy.bdata.vo;

import java.io.Serializable;

public class MallShopVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7178958647862301077L;
	private String id;//id
	private String name;//名称
	private Integer type;//类型    1:商场,2:店铺
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
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "MallShopVO [id=" + id + ", name=" + name + ", type=" + type
				+ "]";
	}
	
}
