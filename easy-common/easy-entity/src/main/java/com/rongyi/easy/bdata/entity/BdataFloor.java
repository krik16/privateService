package com.rongyi.easy.bdata.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Desc: floor info
 * User: sailer
 * Date: 2015/10/25 12:52
 */

@Entity(value="zones",noClassnameStored = true)
public class BdataFloor implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;
    private String _type;
    private String aliasename;
    private String aliasname;
    private ObjectId building_id;
    private String businesstype;
    private Date created_at;
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
	public ObjectId getBuilding_id() {
		return building_id;
	}
	public void setBuilding_id(ObjectId building_id) {
		this.building_id = building_id;
	}
	public String getBusinesstype() {
		return businesstype;
	}
	public void setBusinesstype(String businesstype) {
		this.businesstype = businesstype;
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
	public String getNavigation_pic() {
		return navigation_pic;
	}
	public void setNavigation_pic(String navigation_pic) {
		this.navigation_pic = navigation_pic;
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
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getLast_update_id() {
		return last_update_id;
	}
	public void setLast_update_id(String last_update_id) {
		this.last_update_id = last_update_id;
	}
	private String name;
    private String navigation_pic;//黑白图
    private String operator_id;
    private ObjectId parent_id;
    private List<ObjectId> parent_ids;
    private String pathImg;//路径图
    private String picture;//楼层图
    private Integer position;//排序
    private String simpleFloorName;//楼层图
    private Integer systemStatus;//1 隐藏 0正常
    private Integer system_status;//1 隐藏 0正常
    private Date  updated_at;
    private String last_update_id;//最近修改人
    private String reason;//操作描述
    private String swf;//swf图--商家后台用的

	public String getFmap() {
		return fmap;
	}

	public void setFmap(String fmap) {
		this.fmap = fmap;
	}

	private String fmap;//fmap图--商家后台用的


	public String getSwf() {
		return swf;
	}
	public void setSwf(String swf) {
		this.swf = swf;
	}
	public Integer getSystem_status() {
		return system_status;
	}
	public void setSystem_status(Integer system_status) {
		this.system_status = system_status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	private  Integer createSource;//创建来源 0大运营后台  1  商家后台


	public Integer getCreateSource() {
		return createSource;
	}

	public void setCreateSource(Integer createSource) {
		this.createSource = createSource;
	}
	private Integer updateSource ;
	public Integer getUpdateSource() {
		return updateSource;
	}

	public void setUpdateSource(Integer updateSource) {
		this.updateSource = updateSource;
	}
	
   

}
