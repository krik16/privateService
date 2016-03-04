package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.activitymanage.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/2/17
 * TIME : 18:49
 * ideaworkspace.
 */
public class SpecVO implements Serializable {
    private String specId;

    private String specName;

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("specId", specId)
                .append("specName", specName)
                .toString();
    }
}
