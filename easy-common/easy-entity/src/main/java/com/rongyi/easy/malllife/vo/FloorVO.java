package com.rongyi.easy.malllife.vo;

import java.io.Serializable;


public class FloorVO implements Serializable{
	private String id;
//	private String type;//楼层类型
	private String name;//楼层名
//	private String address;//楼层所在
	private String picture;//楼层图
//	private String navigation_pic;//黑白图
//	private String pathImg;//路径图
//	private ObjectId[] parent_ids; 四期下注释。
	private String mall_id;//父id
	private int position;//排序
	
//	private String updated_at;//修改时间
//	private String created_at;//创建时间
	
	private String buildingName;//楼层所属栋名
	
	//四期添加
	private String show_cate;
	private String show_shop;

	public String getId() {
		return id;
	}
//	public String getType() {
//		return type;
//	}
	public String getName() {
		return name;
	}
//	public String getAddress() {
//		return address;
//	}
	public String getPicture() {
		return picture;
	}
//	public String getNavigation_pic() {
//		return navigation_pic;
//	}
//	public String getPathImg() {
//		return pathImg;
//	}
//	public ObjectId[] getParent_ids() {
//		return parent_ids;
//	}
	public String getMall_id() {
		return mall_id;
	}
	public int getPosition() {
		return position;
	}
	public void setId(String id) {
		this.id = id;
	}
//	public void setType(String type) {
//		this.type = type;
//	}
	public void setName(String name) {
		this.name = name;
	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
//	public void setNavigation_pic(String navigation_pic) {
//		this.navigation_pic = navigation_pic;
//	}
//	public void setPathImg(String pathImg) {
//		this.pathImg = pathImg;
//	}
//	public void setParent_ids(ObjectId[] parent_ids) {
//		this.parent_ids = parent_ids;
//	}
	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
	}
	public void setPosition(int position) {
		this.position = position;
	}
//	public String getUpdated_at() {
//		return updated_at;
//	}
//	public String getCreated_at() {
//		return created_at;
//	}
//	public void setUpdated_at(String updated_at) {
//		this.updated_at = updated_at;
//	}
//	public void setCreated_at(String created_at) {
//		this.created_at = created_at;
//	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
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
}
