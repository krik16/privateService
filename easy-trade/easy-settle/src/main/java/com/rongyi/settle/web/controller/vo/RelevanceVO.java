package com.rongyi.settle.web.controller.vo;

import java.io.Serializable;

/**
 * 临时VO
 * Created by he on 2015/10/15.
 */
public class RelevanceVO implements Serializable{

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
