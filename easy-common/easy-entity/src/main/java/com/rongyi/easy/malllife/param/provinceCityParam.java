package com.rongyi.easy.malllife.param;

import java.io.Serializable;

public class provinceCityParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//
	/**City    市

    District  区

    BusinessDistrict 商圈
    */
	private String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
