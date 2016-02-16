package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * Created by xgq on 2016/2/1.
 */
public class CommodityCategorySimpleVO implements Serializable {
    private String id;
    private String name;
    private int type;

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
