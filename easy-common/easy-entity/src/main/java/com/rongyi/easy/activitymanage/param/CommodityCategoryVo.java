package com.rongyi.easy.activitymanage.param;

import java.io.Serializable;

/**
 * Created by xuying on 2016/10/26.
 */
public class CommodityCategoryVo implements Serializable{

    private String categoryId;
    private  String categoryName;

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
}
