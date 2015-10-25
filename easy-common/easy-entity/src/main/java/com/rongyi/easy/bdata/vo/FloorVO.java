package com.rongyi.easy.bdata.vo;

import java.io.Serializable;

/**
 * 楼层vo
 * @author xiaobo
 *
 */
public class FloorVO implements Serializable {
	private static final long serialVersionUID = -9048996615361544871L;
	private String id;
	private String name;
	private String buildingName;
	private Integer systemStatus;
	private Integer position;
	private String navigationPic;
	private String pathImg;
	private String picture;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public Integer getSystemStatus() {
		return systemStatus;
	}
	public void setSystemStatus(Integer systemStatus) {
		this.systemStatus = systemStatus;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public String getNavigationPic() {
		return navigationPic;
	}
	public void setNavigationPic(String navigationPic) {
		this.navigationPic = navigationPic;
	}
	public String getPathImg() {
		return pathImg;
	}
	public void setPathImg(String pathImg) {
		this.pathImg = pathImg;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
}
