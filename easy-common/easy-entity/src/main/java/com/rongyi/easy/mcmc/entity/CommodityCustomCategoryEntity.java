package com.rongyi.easy.mcmc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品自定义分类
 */
public class CommodityCustomCategoryEntity implements Serializable{

    public static final Long serialVersionUID=1L;

    private Integer id;

    private String name;//自定义类目名

    private Integer type;//分类级别 当前只有一级 0

    private Integer onwnerId;//自定义类目隶属者（店铺 分公司）mysql id

    private String onwerMid;//自定义类目隶属者（店铺 分公司） mongoid

    private Integer ownerType;//身份类型:0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购、6买手 目前只有分公司和店长

    private Date createAt;//创建时间

    private Integer createBy;//创建者

    private Date updateAt;//修改时间

    private Integer updateBy;//修改者

    private Integer status;//0表示正常1表示删除

    private Integer parentId;//父类id

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