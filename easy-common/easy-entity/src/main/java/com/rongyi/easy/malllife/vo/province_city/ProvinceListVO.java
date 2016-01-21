package com.rongyi.easy.malllife.vo.province_city;

import java.io.Serializable;
import java.util.List;

public class ProvinceListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ProvinceVO> provinceList;
	public List<ProvinceVO> getProvinceList() {
		return provinceList;
	}
	public void setProvinceList(List<ProvinceVO> provinceList) {
		this.provinceList = provinceList;
	}
	
}
