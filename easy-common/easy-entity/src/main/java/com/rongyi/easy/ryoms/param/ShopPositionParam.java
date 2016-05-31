package com.rongyi.easy.ryoms.param;

import java.io.Serializable;

/**
 * 店铺位置信息
 * @author user
 *
 */
public class ShopPositionParam implements Serializable{
	private static final long serialVersionUID = 1L;
	private String proId;
	private String cityId ;
	private String businessId ;
	private String areaId ;
	private String mallId;
	private String floorId;
	private String lastFloorId;   
	
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getFloorId() {
		return floorId;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}
	public String getLastFloorId() {
		return lastFloorId;
	}
	public void setLastFloorId(String lastFloorId) {
		this.lastFloorId = lastFloorId;
	}
}
