package com.rongyi.easy.redi.param;

import java.io.Serializable;

/**
 * 
 * @author rongyi
 */
public class AddressInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String addressId;// String 地址ID
	
	private String province;// 省编码
	
	private String provinceName;//省名称
	
	private String city;//市编码
	
	private String cityName;//市名称
	
	private String district;//区域编码
	
	private String districtName;//区域名称
	
	private String districtType;//区域杂项码
	
	private String districtTypeName;//区域杂项名称
	
	private String address;//街道详情
	
	private String zipcode;//邮编
	
	private String receiverName;//收货人
	
	private String receiverMphone;//收货人手机号
	
	private String receiverTel;//固定电话
	
	private String receiverEmail;//邮箱
	
	private String addrAlias;//地址别名

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictType() {
		return districtType;
	}

	public void setDistrictType(String districtType) {
		this.districtType = districtType;
	}

	public String getDistrictTypeName() {
		return districtTypeName;
	}

	public void setDistrictTypeName(String districtTypeName) {
		this.districtTypeName = districtTypeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverMphone() {
		return receiverMphone;
	}

	public void setReceiverMphone(String receiverMphone) {
		this.receiverMphone = receiverMphone;
	}

	public String getReceiverTel() {
		return receiverTel;
	}

	public void setReceiverTel(String receiverTel) {
		this.receiverTel = receiverTel;
	}

	public String getReceiverEmail() {
		return receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getAddrAlias() {
		return addrAlias;
	}

	public void setAddrAlias(String addrAlias) {
		this.addrAlias = addrAlias;
	}
	
	
}
