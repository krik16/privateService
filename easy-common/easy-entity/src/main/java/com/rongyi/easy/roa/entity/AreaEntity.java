package com.rongyi.easy.roa.entity;

import java.io.Serializable;
import java.util.List;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("zones")
public class AreaEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String _type;
	private String name;
	private String parent_id;
	private List<String> parent_ids;
	private String hotDistrict;
	private String floor_name;//值从楼 栋 幢 座 取一
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String get_type() {
		return _type;
	}
	public void set_type(String _type) {
		this._type = _type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public List<String> getParent_ids() {
		return parent_ids;
	}
	public void setParent_ids(List<String> parent_ids) {
		this.parent_ids = parent_ids;
	}
	public String getHotDistrict() {
		return hotDistrict;
	}
	public void setHotDistrict(String hotDistrict) {
		this.hotDistrict = hotDistrict;
	}
	public String getFloor_name() {
		return floor_name;
	}
	public void setFloor_name(String floor_name) {
		this.floor_name = floor_name;
	}
	
}
