package com.rongyi.easy.shop.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
@Entity(value="category",noClassnameStored=true)
public class CategoryEntity implements java.io.Serializable{

	/**
	 * 品牌分类
	 */
	@Id
	private ObjectId id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}
}
