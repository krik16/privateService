package com.rongyi.easy.content_v2.param;

import java.io.Serializable;

public class ForumParam implements Serializable{
	/**省份id 0代表全国*/
	private String provId;
	/**城市id 0代表全国*/
	private String cityId;
	/**模版类型 V1banner等*/
	private String modelName;
	public String getProvId() {
		return provId;
	}
	public void setProvId(String provId) {
		this.provId = provId;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
}
