package com.rongyi.easy.bdata.shop.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 商品分类
 * 
 * @author xiaobo
 *
 */
public class CategoriesVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * id
	 */
	private String id;
	/**
	 * 是否app显示
	 */
	private boolean appShow;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 旧编号
	 */
	private int oldCode;
	/**
	 * 旧id
	 */
	private int oldId;
	/**
	 * 父id数组
	 */
	private List<String> parentIds;
	/**
	 * 位置
	 */
	private int position;
	/**
	 * 更新时间
	 */
	private long updatedAt;

	/**
	 * 品牌id列表
	 */
	private List<String> brandIds;

	/**
	 * 父级id
	 */
	private String parentId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isAppShow() {
		return appShow;
	}

	public void setAppShow(boolean appShow) {
		this.appShow = appShow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOldCode() {
		return oldCode;
	}

	public void setOldCode(int oldCode) {
		this.oldCode = oldCode;
	}

	public int getOldId() {
		return oldId;
	}

	public void setOldId(int oldId) {
		this.oldId = oldId;
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

	public long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<String> getBrandIds() {
		return brandIds;
	}

	public void setBrandIds(List<String> brandIds) {
		this.brandIds = brandIds;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
}
