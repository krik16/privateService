package com.rongyi.easy.rmmm.vo;

import com.rongyi.easy.usercenter.entity.MalllifeUserAddressEntity;

import java.io.Serializable;


public class UserAddressVO implements Serializable{
	private String defaultStatus;//1 为默认地址 ，2为非默认地址
	private String id;//地址id
	private String address;//用户地址
	private String phone;//电话号码
	private String consignee;//收货人
	private String provinceName;//省名称
	private String cityName;//市名称
	private String districtName;//区/县名称
	private String provinceId;//省id
	private String cityId;//市id
	private String districtId;//区/县id
	
	
	public String getDefaultStatus() {
		return defaultStatus;
	}
	public void setDefaultStatus(String defaultStatus) {
		this.defaultStatus = defaultStatus;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
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
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public UserAddressVO() {
		super();
	}
	public UserAddressVO(MalllifeUserAddressEntity entity) {
		super();
		this.defaultStatus = String.valueOf(entity.getStatus());
		this.id = entity.getId().toString();
		this.address = entity.getDetailAddress();
		this.phone = entity.getPhone();
		this.consignee = entity.getConsignee();
		this.provinceName = entity.getProvinceName();
		if(entity.getProvinceId() != null){
			this.provinceId = entity.getProvinceId().toString();
		}
		this.cityName = entity.getCityName();
		if(entity.getCityId() != null){
			this.cityId = entity.getCityId().toString();
		}
		this.districtName = entity.getDistrictName();
		if(entity.getDistrictId() != null){
			this.districtId = entity.getDistrictId().toString();
		}
	}
	@Override
	public String toString() {
		return "UserAddressVO [defaultStatus=" + defaultStatus + ", id=" + id
				+ ", address=" + address + ", phone=" + phone + ", consignee="
				+ consignee + ", provinceName=" + provinceName + ", cityName="
				+ cityName + ", districtName=" + districtName + ", provinceId="
				+ provinceId + ", cityId=" + cityId + ", districtId="
				+ districtId + "]";
	}

}
