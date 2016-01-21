package com.rongyi.easy.shop.entity;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@SuppressWarnings("serial")
@Entity(value="custom_category",noClassnameStored=true)
public class MallCustomCategoryEntity  implements java.io.Serializable{

	/**
	 * 商场自定义分类
	 */
	@Id
	private ObjectId id;
	private String name;
	private ObjectId mall_id;//所属商场
	//private List<ObjectId> parent_ids;
	private ObjectId parent_id;
	private int position;
	private int level;//0表示一级分类 1表示二级分类
	private int valid;//0表示正常 2删除
	private List<ObjectId> categorys_id;//品牌分类
	
	private Date created_at;
	private Date updated_at;
	private int created_by;
	private int updated_by;
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
	public ObjectId getMall_id() {
		return mall_id;
	}
	public void setMall_id(ObjectId mall_id) {
		this.mall_id = mall_id;
	}
	public ObjectId getParent_id() {
		return parent_id;
	}
	public void setParent_id(ObjectId parent_id) {
		this.parent_id = parent_id;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getValid() {
		return valid;
	}
	public void setValid(int valid) {
		this.valid = valid;
	}
	public List<ObjectId> getCategorys_id() {
		return categorys_id;
	}
	public void setCategorys_id(List<ObjectId> categorys_id) {
		this.categorys_id = categorys_id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public int getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}
	
	
	
}
