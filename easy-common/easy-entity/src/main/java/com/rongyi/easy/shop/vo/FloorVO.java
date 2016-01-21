package com.rongyi.easy.shop.vo;

import java.io.Serializable;

/**
 * 增加楼层
 * 
 * @author wzh
 *
 */
public class FloorVO implements Serializable {
	
	private Integer type;//0楼1栋2幢3座
	
	private String floorNumber;//楼栋信息
	
	private String mallId;
	
	private String floorName;//楼层名字
	
	private String buildingId;//楼栋id
	
	private int position;//位置 用于排序
	
	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getFloorName() {
		return floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	
	
	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	@Override
	public String toString() {
		return "FloorVO [type=" + type + ", floorNumber=" + floorNumber
				+ ", mallId=" + mallId + ", floorName=" + floorName
				+ ", position=" + position + "]";
	}
	
	
}
