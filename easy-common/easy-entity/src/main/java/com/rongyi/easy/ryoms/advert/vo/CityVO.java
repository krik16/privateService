package com.rongyi.easy.ryoms.advert.vo;

import java.io.Serializable;

/**
 * @Description: 城市VO类
 * @author wangjh
 * @date 2016年2月18日
 */
public class CityVO implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -7899784813285846003L;
	public String getCityMId() {
		return cityMId;
	}

	public void setCityMId(String cityMId) {
		this.cityMId = cityMId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	// 城市MId
	private String cityMId = "";
	// 城市名称
	private String cityName = "";
}
