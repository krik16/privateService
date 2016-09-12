package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BdataFloorVO implements Serializable {
	
	@Override
	public String toString() {
		return "BdataFloorVO [id=" + id + ", type=" + type + ", aliasename=" + aliasename + ", aliasname=" + aliasname
				+ ", buildingId=" + buildingId + ", businesstype=" + businesstype + ", createdAt=" + createdAt
				+ ", name=" + name + ", navigationPic=" + navigationPic + ", operatorId=" + operatorId + ", parentId="
				+ parentId + ", parentIds=" + parentIds + ", pathImg=" + pathImg + ", picture=" + picture
				+ ", position=" + position + ", simpleFloorName=" + simpleFloorName + ", systemStatus=" + systemStatus
				+ ", updated_at=" + updated_at + ", last_updateId=" + last_updateId + ", countShop=" + countShop + "]";
	}
	private static final long serialVersionUID = 1L;
	
	private String id;
    private String type;
    private String aliasename;
    private String aliasname;
    private String buildingId;
    private String buildingType;
    private String businesstype;
    private Date createdAt;
    private String name;
    private String navigationPic;//黑白图
    private String operatorId;
    private String operatorName;
    private String lastUpdateName;
    private String parentId;
    private List<String> parentIds;
    private String pathImg;//路径图
    private String picture;//楼层图
    private Integer position;//排序
    private String simpleFloorName;//楼层图
    private Integer systemStatus;//1 隐藏 0正常
    private Date  updated_at;
    private String reason;//操作描述
    private String swf;//swf图--商家后台用的

	public String getFmap() {
		return fmap;
	}

	public void setFmap(String fmap) {
		this.fmap = fmap;
	}

	private String fmap;//蜂鸟版图片



	private  Integer createSource;//创建来源 0大运营后台  1  商家后台
	private Integer updateSource ;

	public Integer getUpdateSource() {
		return updateSource;
	}

	public void setUpdateSource(Integer updateSource) {
		this.updateSource = updateSource;
	}

	public Integer getCreateSource() {
		return createSource;
	}

	public void setCreateSource(Integer createSource) {
		this.createSource = createSource;
	}

	public String getSwf() {
		return swf;
	}
	public void setSwf(String swf) {
		this.swf = swf;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getLastUpdateName() {
		return lastUpdateName;
	}
	public void setLastUpdateName(String lastUpdateName) {
		this.lastUpdateName = lastUpdateName;
	}
	public String getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}
	public int getCountShop() {
		return countShop;
	}
	public void setCountShop(int countShop) {
		this.countShop = countShop;
	}
	private String last_updateId;//最近修改人
    private int countShop;// 关联店铺数
    
    

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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

	public String getBusinesstype() {
		return businesstype;
	}
	public void setBusinesstype(String businesstype) {
		this.businesstype = businesstype;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNavigationPic() {
		return navigationPic;
	}
	public void setNavigationPic(String navigationPic) {
		this.navigationPic = navigationPic;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
	public List<String> getParentIds() {
		return parentIds;
	}
	public void setParentIds(List<String> parentIds) {
		this.parentIds = parentIds;
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
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public String getSimpleFloorName() {
		return simpleFloorName;
	}
	public void setSimpleFloorName(String simpleFloorName) {
		this.simpleFloorName = simpleFloorName;
	}
	public Integer getSystemStatus() {
		return systemStatus;
	}
	public void setSystemStatus(Integer systemStatus) {
		this.systemStatus = systemStatus;
	}

	public String getLast_updateId() {
		return last_updateId;
	}
	public void setLast_updateId(String last_updateId) {
		this.last_updateId = last_updateId;
	}
	
	
	
}
