package com.rongyi.easy.activitymanage.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.activitymanage.param ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/2/19
 * TIME : 17:02
 * ideaworkspace.
 */
public class SearchSecKillParam extends PagingParam{
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .toString();
    }
}
