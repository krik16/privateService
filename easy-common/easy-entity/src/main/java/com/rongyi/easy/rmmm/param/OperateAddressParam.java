package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class OperateAddressParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String consignee;//收货人姓名
	private String phone;//手机号
	private String provinceId;//省ID
	private String provinceName;//省名称
	private String cityId;//市ID
	private String cityName;//市名称
	private String districtId;//区ID
	private String districtName;//区名称
	private String address;//详细地址
	private String status;//状态 :默认地址标识 1为默认，2为非默认
	/**
	 * 地址ID
	 * 非必要参数，若有则为更新地址，没有为新建地址，若只有id没有其他参数，表示删除此地址
	 */
	private String id;
	
	
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	@Override
	public String toString() {
		return "OperateAddressParam [consignee=" + consignee + ", phone="
				+ phone + ", provinceId=" + provinceId + ", provinceName="
				+ provinceName + ", cityId=" + cityId + ", cityName="
				+ cityName + ", districtId=" + districtId + ", districtName="
				+ districtName + ", address=" + address + ", status=" + status
				+ ", id=" + id + "]";
	}
	
}
