package com.rongyi.easy.solr.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.base.BaseParam;

/**
 * Created by xgq on 2015/10/30.
 */
public class CommodityBrandSearchParam extends BaseParam implements Serializable {
	private static final long serialVersionUID = -4936781425999899680L;
	private Integer currentPage; //当前页数,从1开始
    private Integer pageSize;//每页显示数
    private String keyword;
    private String categoryId;//分类id
    private List<String> shopList;//店铺id集合
	private List<String> categoryList;//分类id集合
    
	

	public List<String> getShopList() {
		return shopList;
	}

	public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}

	public List<String> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

	@Override
	public String toString() {
		return "CommodityBrandSearchParam [currentPage=" + currentPage
				+ ", pageSize=" + pageSize + ", keyword=" + keyword
				+ ", categoryId=" + categoryId + ", shopList=" + shopList
				+ ", categoryList=" + categoryList + "]";
	}
    
}
