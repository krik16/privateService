package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.malllife.constants.Constants;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 区域
 * @author rongyi
 *
 */
@Entity(value="zones",noClassnameStored=true)
public class Zones implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 区域id
	 */
	@Id
	private ObjectId id;
	/**
	 * 区域类型
	 */
	private String _type;
	/**
	 * app图片名
	 */
	private String app_picture;
	/**
	 * 创建时间
	 */
	private Date created_at;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 是否热门 1热门 0非热门
	 */
	private int hot_district;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 旧编号
	 */
	private String old_code;
	/**
	 * 旧id
	 */
	private int old_id;
	/**
	 * 父id
	 */
	private ObjectId parent_id;
	/**
	 * 父id列表
	 */
	private List<ObjectId> parent_ids;
	/**
	 * 位置
	 */
	private int position;
	/**
	 * 更新时间
	 */
	private Date updated_at;
	/**
	 * 更新人id
	 */
	private int updated_user_id;
	
	/**
	 * 坐标
	 */
	private List<Double> location;
	
	/**
	 * 分类ids
	 */
	private List<ObjectId> category_ids;
	
	private List<ObjectId> watcher_ids;

	//商场logo
	private String icon;

	//商场地址
	private  String address;

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

	public String getApp_picture() {
		return app_picture;
	}

	public void setApp_picture(String app_picture) {
		this.app_picture = app_picture;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHot_district() {
		return hot_district;
	}

	public void setHot_district(int hot_district) {
		this.hot_district = hot_district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOld_code() {
		return old_code;
	}

	public void setOld_code(String old_code) {
		this.old_code = old_code;
	}

	public int getOld_id() {
		return old_id;
	}

	public void setOld_id(int old_id) {
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

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public int getUpdated_user_id() {
		return updated_user_id;
	}

	public void setUpdated_user_id(int updated_user_id) {
		this.updated_user_id = updated_user_id;
	}

	public List<ObjectId> getWatcher_ids() {
		return watcher_ids;
	}

	public void setWatcher_ids(List<ObjectId> watcher_ids) {
		this.watcher_ids = watcher_ids;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public List<ObjectId> getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(List<ObjectId> category_ids) {
		this.category_ids = category_ids;
	}

	public String getFullIcon() {
		return Constants.Common.UPAIYUN_URL_MALL_ICON + getId().toString() + "/" + getIcon().toString();
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
