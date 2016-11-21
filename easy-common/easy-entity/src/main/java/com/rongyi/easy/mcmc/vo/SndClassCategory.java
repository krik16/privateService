package com.rongyi.easy.mcmc.vo;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.mcmc.CommodityCategory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 二级类目（从commodityCategorySaleVO提炼出来）
 *
 * @author wangjh7
 * @date 2016-09-28
 */
public class SndClassCategory implements Serializable, Comparable<SndClassCategory> {
    private static final long serialVersionUID = -8762888917527899984L;
    private String categoryId;
    private String categoryName;
    private String categoryLogo;
    private String categoryType;
    private Date createAt;
    private List<TrdClassCategory> subCategoryList;

    public SndClassCategory() {

    }

    public SndClassCategory(CommodityCategory commodityCategory) {
        this.categoryId = commodityCategory.getId().toString();
        this.categoryName = commodityCategory.getName();
        this.categoryLogo = commodityCategory.getLogoUrl();
        this.categoryType = "我是二级类目";
        this.createAt = commodityCategory.getCreateAt();
        this.subCategoryList = new ArrayList<>();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryLogo() {
        return categoryLogo;
    }

    public void setCategoryLogo(String categoryLogo) {
        this.categoryLogo = categoryLogo;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public List<TrdClassCategory> getSubCategoryList() {
        return subCategoryList;
    }

    public void setSubCategoryList(List<TrdClassCategory> subCategoryList) {
        this.subCategoryList = subCategoryList;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }


    public String toJson() {
        return JsonUtil.getJSONString(this);
    }

    /**
     * 排序
     */
    @Override
    public int compareTo(SndClassCategory o) {
        long t1 = this.getCreateAt().getTime();
        long t2 = o.getCreateAt().getTime();
        if (t1 < t2) {
            return -1;
        }
        if (t1 > t2) {
            return 1;
        }
        return 0;
    }
}