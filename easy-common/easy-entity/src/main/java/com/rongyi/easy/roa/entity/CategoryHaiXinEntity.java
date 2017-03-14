package com.rongyi.easy.roa.entity;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value ="category_haixin", noClassnameStored = true)
public class CategoryHaiXinEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    private ObjectId id;
	private String code;     //编码
	private String name;     //名称
	private String upperCode;//上级编码
	private Integer level;   //级别
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpperCode() {
		return upperCode;
	}
	public void setUpperCode(String upperCode) {
		this.upperCode = upperCode;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "CategoryHaiXinEntity [id=" + id + ", code=" + code + ", name="
				+ name + ", upperCode=" + upperCode + ", level=" + level + "]";
	}
	
}
