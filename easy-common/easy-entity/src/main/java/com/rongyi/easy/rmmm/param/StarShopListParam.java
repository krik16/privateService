package com.rongyi.easy.rmmm.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司 
 * author zhangzhengping 
 * Description ： 查询明星店铺列表参数
 * time ：2015年9月7日
 * History: 变更记录 <author> <time> <version> <desc> zhangzhengping 2015年6月8日 1.0 创建文件
 */
public class StarShopListParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cityId;//城市id
	private String cityName;//城市名称
	private String jsessionid;//容易逛用户jsessionId
	private String version;//版本号
	private String longitude;//当前经度
	private String latitude;//当前纬度
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
	public String getJsessionid() {
		return jsessionid;
	}
	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("cityId", cityId)
				.append("cityName", cityName)
				.append("jsessionid", jsessionid)
				.append("version", version)
				.append("longitude", longitude)
				.append("latitude", latitude)
				.toString();
	}
}
