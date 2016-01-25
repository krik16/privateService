package com.rongyi.easy.malllife.domain;

import java.io.Serializable;

public class CityDO implements Serializable {

	private String id;
	private String cityName;
	private String cityCode;
	private String letter;// 首字母
	private int sortNum;// 顺序
	private boolean hotCity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public int getSortNum() {
		return sortNum;
	}

	public void setSortNum(int sortNum) {
		this.sortNum = sortNum;
	}

	public boolean isHotCity() {
		return hotCity;
	}

	public void setHotCity(boolean hotCity) {
		this.hotCity = hotCity;
	}
}
