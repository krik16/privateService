package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.List;

public class PositionVO implements Serializable {
	private Integer id;
	/**位置名字*/
	 private String name;
	 /**城市id*/
	 private String provId;
	 /**省份id*/
	 private String cityId;
     /**内容*/
	 private List<ContentVO> content;
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public List<ContentVO> getContent() {
		return content;
	}

	public void setContent(List<ContentVO> content) {
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	 
	 
}
