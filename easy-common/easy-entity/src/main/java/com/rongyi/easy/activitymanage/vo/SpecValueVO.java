package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.activitymanage.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/2/17
 * TIME : 18:48
 * ideaworkspace.
 */
public class SpecValueVO implements Serializable {
    private String specValueId;
    private String specValueName;


    public String getSpecValueId() {
        return specValueId;
    }

    public void setSpecValueId(String specValueId) {
        this.specValueId = specValueId;
    }

    public String getSpecValueName() {
        return specValueName;
    }

    public void setSpecValueName(String specValueName) {
        this.specValueName = specValueName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("specValueId", specValueId)
                .append("specValueName", specValueName)
                .toString();
    }
}
