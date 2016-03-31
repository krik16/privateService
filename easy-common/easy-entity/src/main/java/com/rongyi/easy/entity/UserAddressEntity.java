/*
package com.rongyi.easy.entity;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

*
 * 类UserAddressPojo.java的实现描述：TODO 类实现描述
 * 
 * @author Lc 2015年2月12日 下午2:12:03


@Entity(value = "user_address", noClassnameStored = true)
public class UserAddressEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;

* 默认地址标识 1为默认，2为非默认

	@Property("default_status")
	private String defaultStatus;

* 最新更新时间

	@Property("updated_at")
	private Date updatedAt;

* 创建时间

	@Property("create_at")
	private Date createAt;
* 收货人电话

	@Property("phone")
	private String phone;

* 收货人姓名

	@Property("consignee")
	private String consignee;

* 详细地址

	@Property("detail_address")
	private String detailAddress;

* 省ID

	@Property("province_id")
	private ObjectId provinceId;

* 市ID

	@Property("city_id")
	private ObjectId cityId;

* 区ID

	@Property("district_id")
	private ObjectId districtId;

* 省名称

	@Property("province_name")
	private String provinceName;

* 市名称

	@Property("city_name")
	private String cityName;

* 区名称

	@Property("district_name")
	private String districtName;

* 用户ID

	@Property("user_id")
	private ObjectId userId;

*判断是否删除 0是 1否

	@Property("is_delete")
	private String isDelete;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getDefaultStatus() {
		return defaultStatus;
	}

	public void setDefaultStatus(String defaultStatus) {
		this.defaultStatus = defaultStatus;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public ObjectId getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(ObjectId provinceId) {
		this.provinceId = provinceId;
	}

	public ObjectId getCityId() {
		return cityId;
	}

	public void setCityId(ObjectId cityId) {
		this.cityId = cityId;
	}

	public ObjectId getDistrictId() {
		return districtId;
	}

	public void setDistrictId(ObjectId districtId) {
		this.districtId = districtId;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
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

	public ObjectId getUserId() {
		return userId;
	}

	public void setUserId(ObjectId userId) {
		this.userId = userId;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

}
*/
