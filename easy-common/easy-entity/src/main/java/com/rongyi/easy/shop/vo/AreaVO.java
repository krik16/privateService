package com.rongyi.easy.shop.vo;

import java.io.Serializable;

public class AreaVO  implements Comparable<AreaVO>,Serializable{

	private String id;
	private String type;
	private String name;
	private String floorNumber;//几号楼（楼栋幢座）
	private Integer floorType;//楼栋类型 0楼1栋2幢3座
	private String floorName;//楼层
	
	
	
	public AreaVO() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Integer getFloorType() {
		return floorType;
	}

	public void setFloorType(Integer floorType) {
		this.floorType = floorType;
	}

	public String getFloorName() {
		return floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}

	@Override
	public int compareTo(AreaVO o) {
		
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "AreaVO [id=" + id + ", type=" + type + ", name=" + name + ", floorNumber=" + floorNumber
				+ ", floorType=" + floorType + ", floorName=" + floorName + "]";
	}
}
