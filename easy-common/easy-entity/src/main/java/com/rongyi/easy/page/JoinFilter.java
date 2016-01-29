package com.rongyi.easy.page;

import java.io.Serializable;
import java.util.List;

/**
 * Description:外连接
 * Author: 袁波
 * DATE: 2016/1/18 17:11
 * Package:com.rongyi.easy.page
 * Project:easy-common
 */
public class JoinFilter implements Serializable{
    /**
     * type 外连接类型 0：左连接 ；1：右连接
     */
    private int type;
    /**
     * 连接的表
     */
    private String form;

    /**
     * 连接条件
     */
    private List<QueryFilter> filters;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public List<QueryFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<QueryFilter> filters) {
        this.filters = filters;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    public JoinFilter() {
    }
    public JoinFilter(int type,String form, List<QueryFilter> filters) {
        this.type=type;
        this.form = form;
        this.filters = filters;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("JoinFilter{");
        sb.append("form='").append(form).append('\'');
        sb.append(", filters=").append(filters);
        sb.append('}');
        return sb.toString();
    }
}
