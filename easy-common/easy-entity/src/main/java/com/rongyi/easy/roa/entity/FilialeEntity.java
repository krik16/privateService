package com.rongyi.easy.roa.entity;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("filiale")
public class FilialeEntity implements Serializable{
	@Id
	private ObjectId id;     
	
	private String name;     //分公司名称
	
	private String manager;  //管理者
	
	@Property("brand_id")
	private ObjectId brandId;   //关联品牌ID
	
	@Property("create_at")
	private Date createAt;
	
	@Property("update_at")
	private Date updateAt;
	
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
	
	
}
