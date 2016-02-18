package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动商品分类
 */
public class ActivityGoodsCategory implements Serializable {
    /**
     * PK
     */
    private Integer id;

    /**
     * 活动商品关联表id
     */
    private Integer activityGoodsId;

    /**
     * 类型：商品[0] 卡券[1]
     */
    private Integer type;

    /**
     * 商品/卡券分类id
     */
    private String categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 商品/卡券分类等级
     */
    private Integer level;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 修改时间
     */
    private Date updateAt;

    public ActivityGoodsCategory(Integer type, String categoryId, String categoryName, Integer level, Date createAt) {
        this.type = type;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.level = level;
        this.createAt = createAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityGoodsId() {
        return activityGoodsId;
    }

    public void setActivityGoodsId(Integer activityGoodsId) {
        this.activityGoodsId = activityGoodsId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityGoodsId", activityGoodsId)
                .append("type", type)
                .append("categoryId", categoryId)
                .append("categoryName", categoryName)
                .append("level", level)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .toString();
    }
}