package com.rongyi.easy.shop.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@SuppressWarnings("serial")
@Entity(value="zones",noClassnameStored=true)
public class FloorEntity implements Serializable{
	
	@Id
	private ObjectId id;
	
	private Integer operator_id;// 操作人
	private String _type;// 楼层类型
	private String name;// 楼层名
	
	private String address;// 楼层所在
	private String picture;// 楼层图
	private String navigation_pic;// 黑白图
	private String pathImg;// 路径图
	private Date updated_at;// 修改时间
	private Date created_at;// 创建时间
	private int countShop;// 关联店铺数
	private String old_code;
	private String old_id;
	private ObjectId parent_id;
	private List<ObjectId> parent_ids;
	
	private int systemStatus;// 系统状态 0开启 ，1关闭，2删除
	private int position;// 排序
	private String aliasName;// 别名
	private String aliasEname;// 英文别名
	private String businessType;//业态
	
	private String show_cate;
	private String show_shop;
	private boolean has_building;
	
	private String floor_number;//几号楼（楼栋幢座）
	private Integer floor_type;//楼栋类型 0楼1栋2幢3座
	private String floor_name;//楼层
	private ObjectId building_id;//楼栋id
	
	public ObjectId getId() {
		return id;
	}
	
	public void setId(ObjectId id) {
		this.id = id;
	}
	
	public Integer getOperator_id() {
		return operator_id;
	}
	
	public void setOperator_id(Integer operator_id) {
		this.operator_id = operator_id;
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
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public String getNavigation_pic() {
		return navigation_pic;
	}
	
	public void setNavigation_pic(String navigation_pic) {
		this.navigation_pic = navigation_pic;
	}
	
	public String getPathImg() {
		return pathImg;
	}
	
	public void setPathImg(String pathImg) {
		this.pathImg = pathImg;
	}
	
	public Date getUpdated_at() {
		return updated_at;
	}
	
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	public Date getCreated_at() {
		return created_at;
	}
	
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	public int getCountShop() {
		return countShop;
	}
	
	public void setCountShop(int countShop) {
		this.countShop = countShop;
	}
	
	public String getOld_code() {
		return old_code;
	}
	
	public void setOld_code(String old_code) {
		this.old_code = old_code;
	}
	
	public String getOld_id() {
		return old_id;
	}
	
	public void setOld_id(String old_id) {
		this.old_id = old_id;
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
	
	public int getSystemStatus() {
		return systemStatus;
	}
	
	public void setSystemStatus(int systemStatus) {
		this.systemStatus = systemStatus;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public String getAliasName() {
		return aliasName;
	}
	
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	
	public String getAliasEname() {
		return aliasEname;
	}
	
	public void setAliasEname(String aliasEname) {
		this.aliasEname = aliasEname;
	}
	
	public String getBusinessType() {
		return businessType;
	}
	
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
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
	
	public boolean isHas_building() {
		return has_building;
	}
	
	public void setHas_building(boolean has_building) {
		this.has_building = has_building;
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
	
	public ObjectId getBuilding_id() {
		return building_id;
	}
	
	public void setBuilding_id(ObjectId building_id) {
		this.building_id = building_id;
	}
	
 	
	
}
