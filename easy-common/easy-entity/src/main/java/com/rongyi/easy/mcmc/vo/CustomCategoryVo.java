package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * Created by xuying on 2017/1/19.
 */
public class CustomCategoryVo implements Serializable{

    private String customCategoryId;

    private String customCategoryName;

    private String parentId;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCustomCategoryId() {
        return customCategoryId;
    }

    public void setCustomCategoryId(String customCategoryId) {
        this.customCategoryId = customCategoryId;
    }

    public String getCustomCategoryName() {
        return customCategoryName;
    }

    public void setCustomCategoryName(String customCategoryName) {
        this.customCategoryName = customCategoryName;
    }
    @Override
    public String toString() {
        return "CustomCategoryParam{" +
                "customCategoryId=" + customCategoryId +
                ", customCategoryName=" + customCategoryName +
                '}';
    }
}
