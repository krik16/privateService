package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;

/**
 * Created by xgq on 2015/7/17.
 */
public class CustomerOrderCommodityVO implements Serializable {
    /**
     * 主键id
     */
    private String id;

    /**
     * 商品名
     */
    private String name;

    /**
     * 商品图片
     */
    private String image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
