package com.rongyi.easy.mallshop.customer;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xgq on 2015/7/16.
 */
public class CustomerGroup implements Serializable {
    /**
     * 表ID
     */
    private Integer id;

    /**
     * 导购id
     */
    private Integer guideId;

    /**
     * 名称
     */
    private String name;

    /**
     * 组类型  1为默认组  2为用户自定义组
     */
    private Integer groupType;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date modifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGuideId() {
        return guideId;
    }

    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
