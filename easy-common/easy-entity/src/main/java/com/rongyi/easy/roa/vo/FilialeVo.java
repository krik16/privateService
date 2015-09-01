package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

public class FilialeVo implements Serializable{
	private ObjectId id;     
	
	private String name;     //分公司名称
	
	private String manager;  //管理者
	
	private ObjectId brandId;   //关联品牌ID
	
	private Date createAt;
	
	private Date updateAt;
	
	private String brandName; //关联品牌名称

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

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
}
