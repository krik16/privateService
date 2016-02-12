package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Leon on 2016/2/11.
 */
public class ActivityGoodsVO implements Serializable {

    /**
     * PK
     */
    private Integer id;

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 图片URL
     */
    private String picUrl;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 分类信息
     * 餐饮 > 西餐 > 牛排
     */
    private String categoryStr;

    /**
     * 商品规格列表
     */
    private List<ActivityGoodsSpecVO> activityGoodsSpecVOs;

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCategoryStr() {
        return categoryStr;
    }

    public void setCategoryStr(String categoryStr) {
        this.categoryStr = categoryStr;
    }

    public List<ActivityGoodsSpecVO> getActivityGoodsSpecVOs() {
        return activityGoodsSpecVOs;
    }

    public void setActivityGoodsSpecVOs(List<ActivityGoodsSpecVO> activityGoodsSpecVOs) {
        this.activityGoodsSpecVOs = activityGoodsSpecVOs;
    }

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
                .append("goodsId", goodsId)
                .append("goodsName", goodsName)
                .append("picUrl", picUrl)
                .append("type", type)
                .append("categoryStr", categoryStr)
                .append("activityGoodsSpecVOs", activityGoodsSpecVOs)
                .toString();
    }
}
