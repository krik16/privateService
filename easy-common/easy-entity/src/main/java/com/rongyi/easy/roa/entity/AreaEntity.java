package com.rongyi.easy.roa.entity;

import java.io.Serializable;
import java.util.List;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("zones")
public class AreaEntity implements Serializable , Comparable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String _type;
	private String name;
	private String parent_id;
	private List<String> parent_ids;
	private String hotDistrict;
	private String floor_name;//值从楼 栋 幢 座 取一
	private Integer systemStatus;//1 隐藏 0正常
	private Integer system_status;//1 隐藏 0正常

	public Integer getSystemStatus() {
		return systemStatus;
	}

	public void setSystemStatus(Integer systemStatus) {
		this.systemStatus = systemStatus;
	}

	public Integer getSystem_status() {
		return system_status;
	}

	public void setSystem_status(Integer system_status) {
		this.system_status = system_status;
	}

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

	@Override
	public String toString() {
		return "AreaEntity{" +
				"id='" + id + '\'' +
				", _type='" + _type + '\'' +
				", name='" + name + '\'' +
				", parent_id='" + parent_id + '\'' +
				", parent_ids=" + parent_ids +
				", hotDistrict='" + hotDistrict + '\'' +
				", floor_name='" + floor_name + '\'' +
				", systemStatus=" + systemStatus +
				", system_status=" + system_status +
				'}';
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof  AreaEntity) {
			return this.getName().compareTo(((AreaEntity)o).getName());
		}
		return  0;
	}
}
