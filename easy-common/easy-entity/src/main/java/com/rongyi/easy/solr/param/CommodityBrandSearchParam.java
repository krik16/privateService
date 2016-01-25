package com.rongyi.easy.solr.param;

import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;

/**
 * Created by xgq on 2015/10/30.
 */
public class CommodityBrandSearchParam extends BaseParam implements Serializable {
     private Integer currentPage; //当前页数,从1开始
    private Integer pageSize;//每页显示数
    private String keyword;
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	private String categoryId;
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
}
