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
	private String pro;//省
	private String city;//市
	private String area;//区
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

}
