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
     * 单商品补贴方式 金额元[0] 百分比[1]
     */
    private Integer subsidyType;

    /**
     * subsidy_type = 0单商品补贴金额（分），subsidy_type=1时单品补贴百分比的数字，例如单品补贴10%，存入10
     */
    private Integer subsidyPrice;

    /**
     * 商品审核状态：待审核[0] 未通过[1] 已通过[2]
     */
    private Integer status;

    /**
     * 创建人（报名商家）
     */
    private String createUser;

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

    public void setSubsidyType(Integer subsidyType) {
        this.subsidyType = subsidyType;
    }

    public Integer getSubsidyType() {
        return subsidyType;
    }

    public void setSubsidyPrice(Integer subsidyPrice) {
        this.subsidyPrice = subsidyPrice;
    }

    public Integer getSubsidyPrice() {
        return subsidyPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("goodsId", goodsId)
                .append("goodsName", goodsName)
                .append("picUrl", picUrl)
                .append("type", type)
                .append("subsidyType", subsidyType)
                .append("subsidyPrice", subsidyPrice)
                .append("status", status)
                .append("createUser", createUser)
                .append("categoryStr", categoryStr)
                .append("activityGoodsSpecVOs", activityGoodsSpecVOs)
                .toString();
    }
}
