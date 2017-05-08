package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.List;

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
	
	
	private String swfPic;
	    private String fmap;//fmap图--商家后台用的

    private String aliasename;
    private String aliasname;
    private String   tmap;//图聚版地图
    private String thirdFloorId;//第三方楼层id

    public String getThirdFloorId() {
        return thirdFloorId;
    }

    public void setThirdFloorId(String thirdFloorId) {
        this.thirdFloorId = thirdFloorId;
    }


    public String getTmap() {
        return tmap;
    }

    public void setTmap(String tmap) {
        this.tmap = tmap;
    }

    public String getAliasename() {
        return aliasename;
    }

    public void setAliasename(String aliasename) {
        this.aliasename = aliasename;
    }

    public String getAliasname() {
        return aliasname;
    }

    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
    }

    public String getSwfPic() {
			return swfPic;
		}

		public void setSwfPic(String swfPic) {
			this.swfPic = swfPic;
		}

		public String getFmap() {
			return fmap;
		}

		public void setFmap(String fmap) {
			this.fmap = fmap;
		}

	private List<String> parentIds;
	private String parentId;

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

    public List<String> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "FloorVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", systemStatus=" + systemStatus +
                ", position=" + position +
                ", navigationPic='" + navigationPic + '\'' +
                ", pathImg='" + pathImg + '\'' +
                ", picture='" + picture + '\'' +
                ", swfPic='" + swfPic + '\'' +
                ", fmap='" + fmap + '\'' +
                ", aliasename='" + aliasename + '\'' +
                ", aliasname='" + aliasname + '\'' +
                ", parentIds=" + parentIds +
                ", parentId='" + parentId + '\'' +
                '}';
    }


}
