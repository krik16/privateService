package com.rongyi.easy.bdata.shop;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 商品分类
 * @author xiaobo
 *
 */
@Entity("categories")
public class Categories implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * id
	 */
	@Id
	private ObjectId id;
	/**
	 * 是否app显示
	 */
	private boolean app_show;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 旧编号
	 */
	private int old_code;
	/**
	 * 旧id
	 */
	private int old_id;
	/**
	 * 父id数组
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
	 * 品牌id列表
	 */
	private List<ObjectId> brand_ids;
	
	/**
	 * 父级id
	 */
	private ObjectId parent_id;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public boolean isApp_show() {
		return app_show;
	}

	public void setApp_show(boolean app_show) {
		this.app_show = app_show;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld_code() {
		return old_code;
	}

	public void setOld_code(int old_code) {
		this.old_code = old_code;
	}

	public int getOld_id() {
		return old_id;
	}

	public void setOld_id(int old_id) {
		this.old_id = old_id;
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

	public List<ObjectId> getBrand_ids() {
		return brand_ids;
	}

	public void setBrand_ids(List<ObjectId> brand_ids) {
		this.brand_ids = brand_ids;
	}

	public ObjectId getParent_id() {
		return parent_id;
	}

	public void setParent_id(ObjectId parent_id) {
		this.parent_id = parent_id;
	}
	
	
	
	
	

}
