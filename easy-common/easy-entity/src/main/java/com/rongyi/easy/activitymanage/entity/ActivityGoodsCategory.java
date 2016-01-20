package com.rongyi.easy.activitymanage.entity;

public class ActivityGoodsCategory {
    private Integer id;

    private Integer activityGoodsId;

    private String categoryId;

    private Integer level;

    private Byte type;

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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }
}