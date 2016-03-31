package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lijing on 2015/11/26 21:37
 * .com.rongyi.activity.sale.web.vo
 * easy-api
 */
public class CommodityCategoryVO implements Serializable {
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("id", id)
                .toString();
    }
}
