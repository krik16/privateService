package com.rongyi.easy.mcmc;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 品牌
 * 
 * @author xiaobo
 *
 */
@Entity(value="brands",noClassnameStored=true)
public class LiveBrand implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * mongo id
	 */
	@Id
	private ObjectId id;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 英文名称
	 */
	private String ename;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 关键标签
	 */
	private String key_tags;
	/**
	 * 品类
	 */
	private String categories_tags;
	/**
	 * 品牌描述
	 */
	private String description;
	/**
	 * 品牌标签
	 */
	private String tags;

	public String getIcon() {
		return icon;
	}

	public String getEname() {
		return ename;
	}

	public String getName() {
		return name;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullIcon() {
		return "http://rongyi.b0.upaiyun.com/system/brand/icon/" + id + "/" + icon;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getCategories_tags() {
		return categories_tags;
	}

	public void setCategories_tags(String categories_tags) {
		this.categories_tags = categories_tags;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getKey_tags() {
		return key_tags;
	}

	public void setKey_tags(String key_tags) {
		this.key_tags = key_tags;
	}

}
