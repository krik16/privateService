package com.rongyi.easy.bdata.vo;

import java.io.Serializable;

public class MallShopVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7178958647862301077L;
	private String id;//id
	private String name;//名称
	private Integer type;//类型    1:商场,2:店铺
	private String address;//地址
	private String provinceName;//省名称
	private String cityName;//市名称
	private String districtName;//区名称
	private String businessDistrictName;//
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getBusinessDistrictName() {
		return businessDistrictName;
	}
	public void setBusinessDistrictName(String businessDistrictName) {
		this.businessDistrictName = businessDistrictName;
	}
	@Override
	public String toString() {
		return "MallShopVO [id=" + id + ", name=" + name + ", type=" + type
				+ ", address=" + address + ", provinceName=" + provinceName
				+ ", cityName=" + cityName + ", districtName=" + districtName
				+ ", businessDistrictName=" + businessDistrictName + "]";
	}
	
}
