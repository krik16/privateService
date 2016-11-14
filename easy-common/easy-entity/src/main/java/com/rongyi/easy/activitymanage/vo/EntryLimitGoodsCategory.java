package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/9/20.
 */
public class EntryLimitGoodsCategory implements Serializable {

    private String categoryId;//分类id
    private String categoryName;
    private Integer level;//商品分类等级

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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("categoryId", categoryId)
                .append("categoryName", categoryName)
                .append("level", level)
                .toString();
    }
}
