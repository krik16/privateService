/**
 * 
 */
package com.rongyi.easy.roa.vo;

import java.io.Serializable;

/**
 * @author pingkang
 * @time  2014年11月25日 下午3:11:42
 */
public class MallAddressVO implements Serializable{
    private static final long serialVersionUID = 1L;
    private String pro_id;
	private String pro;//省
	private String city_id;
	private String city;//市
	private String area_id;
	private String area;//区
	private String bussiness_id;
	private String bussiness;//商圈
	private String address;//地址
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getBussiness() {
		return bussiness;
	}
	public void setBussiness(String bussiness) {
		this.bussiness = bussiness;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public String getCity_id() {
		return city_id;
	}
	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}
	public String getArea_id() {
		return area_id;
	}
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}
	public String getBussiness_id() {
		return bussiness_id;
	}
	public void setBussiness_id(String bussiness_id) {
		this.bussiness_id = bussiness_id;
	}
	
	public String getFullAddress(){
		if(this.pro == null && this.city == null && this.area == null && this.bussiness == null && this.address == null){
			return null;
		}
		return this.pro + this.city + this.area + this.bussiness + this.address;
	}
	
}
