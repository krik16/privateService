package com.rongyi.easy.bdata.shop.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.mongodb.morphia.annotations.Id;
/**
 * 楼层vo
 * @author xiaobo
 *
 */
public class FloorVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 楼层id
	 */
	@Id
	private String id;
	/**
	 * 区域类型
	 */
	private String type;
	/**
	 * app图片名
	 */
	private String appPicture;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 是否热门 1热门 0非热门
	 */
	private int hotDistrict;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 父id
	 */
	private String parentId;
	/**
	 * 父id列表
	 */
	private List<String> parentIds;
	/**
	 * 位置
	 */
	private int position;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 * 更新人id
	 */
	private int updatedUserId;
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
	public String getAppPicture() {
		return appPicture;
	}
	public void setAppPicture(String appPicture) {
		this.appPicture = appPicture;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getHotDistrict() {
		return hotDistrict;
	}
	public void setHotDistrict(int hotDistrict) {
		this.hotDistrict = hotDistrict;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public List<String> getParentIds() {
		return parentIds;
	}
	public void setParentIds(List<String> parentIds) {
		this.parentIds = parentIds;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public int getUpdatedUserId() {
		return updatedUserId;
	}
	public void setUpdatedUserId(int updatedUserId) {
		this.updatedUserId = updatedUserId;
	}
	
	

}
