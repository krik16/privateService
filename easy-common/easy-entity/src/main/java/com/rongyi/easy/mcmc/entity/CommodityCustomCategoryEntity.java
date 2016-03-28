package com.rongyi.easy.mcmc.entity;

import java.io.Serializable;
import java.util.Date;

public class CommodityCustomCategoryEntity implements Serializable{

    public static final Long serialVersionUID=1L;

    private Integer id;

    private String name;

    private Integer type;

    private Integer onwnerId;

    private String onwerMid;

    private Integer ownerType;

    private Date createAt;

    private Integer createBy;

    private Date updateAt;

    private Integer updateBy;

    private Integer status;

    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOnwnerId() {
        return onwnerId;
    }

    public void setOnwnerId(Integer onwnerId) {
        this.onwnerId = onwnerId;
    }

    public String getOnwerMid() {
        return onwerMid;
    }

    public void setOnwerMid(String onwerMid) {
        this.onwerMid = onwerMid;
    }

    public Integer getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}