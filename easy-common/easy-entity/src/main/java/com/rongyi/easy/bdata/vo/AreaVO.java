package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Desc: area vo
 * User: chris
 * Date: 2015/10/31 15:17
 */
public class AreaVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String type;
    private String name;
    private String parentId;
    private List<String> parentIds;
    private String hotDistrict;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<String> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
    }

    public String getHotDistrict() {
        return hotDistrict;
    }

    public void setHotDistrict(String hotDistrict) {
        this.hotDistrict = hotDistrict;
    }
}
