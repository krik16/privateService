package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.mcmc.CommodityCategory;

import java.io.Serializable;
import java.util.List;

/**
 * 三级类目（从commodityCategorySaleVO提炼出来）
 *
 * @author wangjh7
 * @date 2016-09-22
 */
public class TrdClassCategory implements Serializable {
    private static final long serialVersionUID = 3027565667824642164L;
    private String categoryId;
    private String categoryName;
    private String categoryLogo;
    private String categoryType;
    private List<CommoditySpecColumnVO> categoryColumList;

    public TrdClassCategory() {

    }

    public TrdClassCategory(CommodityCategory commodityCategory) {
        this.categoryId = commodityCategory.getId().toString();
        this.categoryName = commodityCategory.getName();
        this.categoryLogo = commodityCategory.getLogoUrl();
        this.categoryType = "我是三级类目";
    }

    public List<CommoditySpecColumnVO> getCategoryColumList() {
        return categoryColumList;
    }

    public void setCategoryColumList(List<CommoditySpecColumnVO> categoryColumList) {
        this.categoryColumList = categoryColumList;
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

    @Override
    public String toString() {
        return "TrdClassCategory{" +
                "categoryColumList=" + categoryColumList +
                ", categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryLogo='" + categoryLogo + '\'' +
                ", categoryType='" + categoryType + '\'' +
                '}';
    }
}
