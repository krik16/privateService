package com.rongyi.easy.rmmm.param;

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
	
}
