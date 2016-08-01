package com.rongyi.easy.bdata.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 商场自定义分类 
 * @author user
 *
 */
public class CustomCategoryDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id ;
	private String name ;
	private String mallId;  //商场ID
	private String parentId; //上级ID
	private int level ; //层级
	private List<String> categorysId ; //下级id集合
	private List<CustomCategoryDto> categorys ;
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public List<String> getCategorysId() {
		return categorysId;
	}
	public void setCategorysId(List<String> categorysId) {
		this.categorysId = categorysId;
	}
	public List<CustomCategoryDto> getCategorys() {
		return categorys;
	}
	public void setCategorys(List<CustomCategoryDto> categorys) {
		this.categorys = categorys;
	}
}
