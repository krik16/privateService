package com.rongyi.easy.malllife.vo.province_city;

import java.io.Serializable;
import java.util.List;

public class CityListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<CityVO> cityList;

	public List<CityVO> getCityList() {
		return cityList;
	}

	public void setCityList(List<CityVO> cityList) {
		this.cityList = cityList;
	}
	
}
