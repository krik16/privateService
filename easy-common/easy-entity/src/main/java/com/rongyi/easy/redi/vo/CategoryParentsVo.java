package com.rongyi.easy.redi.vo;

import java.io.Serializable;
import java.util.List;

public class CategoryParentsVo implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 4389787820338036311L;

    /**  分类id */
    private String   categoryId;

    /** 分类编码*/
    private String sortOrder ;
    /** 级别 1 一级 2 二级 */
    private String   lev;

    /** 父级id -1没有父级 */
    private Long   parentId;
    /** */
    private String categoryName ;

    private List<CategorySonsVo> categorySons ;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getLev() {
		return lev;
	}

	public void setLev(String lev) {
		this.lev = lev;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<CategorySonsVo> getCategorySons() {
		return categorySons;
	}

	public void setCategorySons(List<CategorySonsVo> categorySons) {
		this.categorySons = categorySons;
	}
    
}
