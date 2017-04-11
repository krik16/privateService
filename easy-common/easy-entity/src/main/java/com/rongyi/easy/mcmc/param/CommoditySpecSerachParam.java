package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * Created by xuying on 2017/2/22.
 */
public class CommoditySpecSerachParam implements Serializable{

    private Integer type;

    private String categoryId;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }



    @Override
    public String toString() {
        return "CommoditySpecSerachParam{" +
                "type=" + type +
                ", categoryId=" + categoryId +
                '}';
    }
}
