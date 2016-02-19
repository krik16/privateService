package com.rongyi.easy.ryoms.advert.vo;

/**
 * @Description: 城市VO类
 * @author wangjh
 * @date 2016年2月18日
 */
public class CityVO {
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
