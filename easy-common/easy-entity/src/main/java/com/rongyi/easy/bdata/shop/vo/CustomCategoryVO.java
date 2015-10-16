package com.rongyi.easy.bdata.shop.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 用户自定义分类
 * 
 * @author rongyi
 *
 */
public class CustomCategoryVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * id
	 */
	private String id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 商场id
	 */
	private String mallId;
	/**
	 * 父id
	 */
	private String parentId;
	/**
	 * 位置
	 */
	private int position;
	/**
	 * 层级
	 */
	private int level;
	/**
	 * 有效状态
	 */
	private int valid;
	/**
	 * 分类id列表
	 */
	private List<String> categorysId;
	/**
	 * 创建时间
	 */
	private long createdAt;
	/**
	 * 更新时间
	 */
	private long updatedAt;
	/**
	 * 创建人
	 */
	private int createdBy;
	/**
	 * 更新人
	 */
	private int updatedBy;

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

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	public List<String> getCategorysId() {
		return categorysId;
	}

	public void setCategorysId(List<String> categorysId) {
		this.categorysId = categorysId;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}
}
