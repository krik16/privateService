package com.rongyi.easy.bdata.entity;

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
@Entity(value="categories", noClassnameStored = true)
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
	 * 父级id
	 */
	private ObjectId parent_id;

	private String ename ;  //英文名称

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

	public ObjectId getParent_id() {
		return parent_id;
	}

	public void setParent_id(ObjectId parent_id) {
		this.parent_id = parent_id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
}
