package com.rongyi.easy.roa.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class MallGroupVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;//集团ID
    private String name;//集团名称
    private Integer status;
    private List<String> mallIds;

    public List<String> getMallIds() {
        return mallIds;
    }

    public void setMallIds(List<String> mallIds) {
        this.mallIds = mallIds;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("status", status).append("mallIds", mallIds).toString();
    }
}
