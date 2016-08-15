package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.Date;
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
	private Date updatedAt;

	/**
	 * 品牌id列表
	 */
	private List<String> brandIds;

	/**
	 * 父级id
	 */
	private String parentId;

	private String ename ;  //英文名称
	
	
	private List<CategoriesVO> nextLevel;
	
	
	

	public List<CategoriesVO> getNextLevel() {
		return nextLevel;
	}

	public void setNextLevel(List<CategoriesVO> nextLevel) {
		this.nextLevel = nextLevel;
	}

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

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
}
