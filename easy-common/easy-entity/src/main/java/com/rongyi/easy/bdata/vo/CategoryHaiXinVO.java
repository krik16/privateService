package com.rongyi.easy.bdata.vo;

import java.io.Serializable;


public class CategoryHaiXinVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String code;     //编码
	private String name;     //名称
	private String upperCode;//上级编码
	private Integer level;   //级别
	private String shopMid;

	public String getShopMid() {
		return shopMid;
	}

	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpperCode() {
		return upperCode;
	}
	public void setUpperCode(String upperCode) {
		this.upperCode = upperCode;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "CategoryHaiXinVO [id=" + id + ", code=" + code + ", name="
				+ name + ", upperCode=" + upperCode + ", level=" + level + "]";
	}
	
}
