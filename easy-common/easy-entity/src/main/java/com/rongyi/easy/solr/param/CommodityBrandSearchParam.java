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
    private List<String> brandIds;//品牌id集合
    private List<String> mallIds;//商场id集合
    private List<String> shopIds;//店铺id集合
    private List<String> categoryIds;//分类id集合
    
	public List<String> getBrandIds() {
		return brandIds;
	}

	public void setBrandIds(List<String> brandIds) {
		this.brandIds = brandIds;
	}

	public List<String> getMallIds() {
		return mallIds;
	}

	public void setMallIds(List<String> mallIds) {
		this.mallIds = mallIds;
	}

	public List<String> getShopIds() {
		return shopIds;
	}

	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public List<String> getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
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
				+ ", categoryId=" + categoryId + ", brandIds=" + brandIds
				+ ", mallIds=" + mallIds + ", shopIds=" + shopIds
				+ ", categoryIds=" + categoryIds + "]";
	}
    
}
