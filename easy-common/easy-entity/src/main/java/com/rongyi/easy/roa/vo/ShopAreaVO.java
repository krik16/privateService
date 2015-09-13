package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 获取集团、商场、品牌、店铺集合下所有店铺位置信息(省市)
 * @author Ventures
 *
 */
public class ShopAreaVO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String provinceId;//省id
	private String provinceName;//省名称
	private List<City> citys;
	
	public static class City implements Serializable {
		private static final long serialVersionUID = 1L;
		private String cityId;//市id
		private String cityName;//市名称
		public String getCityId() {
			return cityId;
		}
		public void setCityId(String cityId) {
			this.cityId = cityId;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		@Override
		public String toString() {
			return "City [cityId=" + cityId + ", cityName=" + cityName + "]";
		}
		
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public List<City> getCitys() {
		return citys;
	}

	public void setCitys(List<City> citys) {
		this.citys = citys;
	}

	@Override
	public String toString() {
		return "ShopAreaVO [provinceId=" + provinceId + ", provinceName="
				+ provinceName + ", citys=" + citys + "]";
	}
	
	
}
