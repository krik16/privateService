package com.rongyi.easy.shop.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("zones")
public class FloorEntity implements Serializable{
	
	@Id
	private ObjectId id;
	
	private String _type;
	private Integer system_status;
	private Date created_at;
	private String name;
	private String operator_id;
	private ObjectId parent_id;
	private List<ObjectId> parent_ids;
	private Date updated_at;
	private String show_cate;
	private String show_shop;
	private String has_building;
	private Integer position;
	private String picture;
	private String floor_number;//几号楼（栋幢座）
	private Integer floor_type;//楼栋类型 0楼1栋2幢3座
	private String floor_name;//楼层
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String get_type() {
		return _type;
	}
	public void set_type(String _type) {
		this._type = _type;
	}
	public Integer getSystem_status() {
		return system_status;
	}
	public void setSystem_status(Integer system_status) {
		this.system_status = system_status;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(String operator_id) {
		this.operator_id = operator_id;
	}
	public ObjectId getParent_id() {
		return parent_id;
	}
	public void setParent_id(ObjectId parent_id) {
		this.parent_id = parent_id;
	}
	public List<ObjectId> getParent_ids() {
		return parent_ids;
	}
	public void setParent_ids(List<ObjectId> parent_ids) {
		this.parent_ids = parent_ids;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getShow_cate() {
		return show_cate;
	}
	public void setShow_cate(String show_cate) {
		this.show_cate = show_cate;
	}
	public String getShow_shop() {
		return show_shop;
	}
	public void setShow_shop(String show_shop) {
		this.show_shop = show_shop;
	}
	public String getHas_building() {
		return has_building;
	}
	public void setHas_building(String has_building) {
		this.has_building = has_building;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getFloor_number() {
		return floor_number;
	}
	public void setFloor_number(String floor_number) {
		this.floor_number = floor_number;
	}
	public Integer getFloor_type() {
		return floor_type;
	}
	public void setFloor_type(Integer floor_type) {
		this.floor_type = floor_type;
	}
	public String getFloor_name() {
		return floor_name;
	}
	public void setFloor_name(String floor_name) {
		this.floor_name = floor_name;
	}
	
 	
	
}
