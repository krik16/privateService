package com.rongyi.easy.bdata.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("filiale")
public class Filiale implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;     
	
	private String name;     //分公司名称
	
	private String manager;  //管理者
	
	@Property("brand_id")
	private ObjectId brandId;   //关联品牌ID
	
	@Property("created_at")
	private Date createAt;
	
	@Property("updated_at")
	private Date updateAt;
	
	private String telephone;  //联系电话
	 
	private String address;   //详细地址 
	
	private List<ObjectId> zone_ids;
	
	@Property("valid")
	private int valid;//0 运营中 1已停运

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public ObjectId getBrandId() {
		return brandId;
	}

	public void setBrandId(ObjectId brandId) {
		this.brandId = brandId;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<ObjectId> getZone_ids() {
		return zone_ids;
	}

	public void setZone_ids(List<ObjectId> zone_ids) {
		this.zone_ids = zone_ids;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}
}
