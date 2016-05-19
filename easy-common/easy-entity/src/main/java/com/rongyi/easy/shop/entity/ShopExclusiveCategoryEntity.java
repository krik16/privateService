package com.rongyi.easy.shop.entity;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity("shop_exclusive_category")
public class ShopExclusiveCategoryEntity  implements java.io.Serializable{

	/**
	 * 店铺专属分类
	 */
	private static final long serialVersionUID = -3491400779856182500L;
	@Id
	private ObjectId id;
	private String name;
	private Date created_at;
	private List<ObjectId> parent_ids;
	private ObjectId parent_id;
	private int type;//0表示一级分类 1表示二级分类
	private ObjectId mall_id;//所属商场
	
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
	
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public List<ObjectId> getParent_ids() {
		return parent_ids;
	}
	public void setParent_ids(List<ObjectId> parent_ids) {
		this.parent_ids = parent_ids;
	}
	public ObjectId getParent_id() {
		return parent_id;
	}
	public void setParent_id(ObjectId parent_id) {
		this.parent_id = parent_id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public ObjectId getMall_id() {
		return mall_id;
	}
	public void setMall_id(ObjectId mall_id) {
		this.mall_id = mall_id;
	}
	
}
