package com.rongyi.easy.shop.vo;

import java.io.Serializable;

/**
 * Created by xuying on 2016/3/18.
 */
public class ShopVoForWechat1 implements Serializable{
    private String id;
    private String name;

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
}
