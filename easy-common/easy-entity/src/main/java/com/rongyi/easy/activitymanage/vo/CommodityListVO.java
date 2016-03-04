package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * create by com.rongyi.easy.activitymanage.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/2/17
 * TIME : 18:46
 * ideaworkspace.
 */
public class CommodityListVO implements Serializable {
    private String goodsId;

    private String name;
    private String picUrl;
    private Integer type;
    private String brandName;
    private Date joinStartAt;
    private Date joinEndAt;
    private List<CommodityCateVO> commodityCategoryList;
    private List<SpecListVO> specificationList;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Date getJoinStartAt() {
        return joinStartAt;
    }

    public void setJoinStartAt(Date joinStartAt) {
        this.joinStartAt = joinStartAt;
    }

    public Date getJoinEndAt() {
        return joinEndAt;
    }

    public void setJoinEndAt(Date joinEndAt) {
        this.joinEndAt = joinEndAt;
    }

    public List<CommodityCateVO> getCommodityCategoryList() {
        return commodityCategoryList;
    }

    public void setCommodityCategoryList(List<CommodityCateVO> commodityCategoryList) {
        this.commodityCategoryList = commodityCategoryList;
    }

    public List<SpecListVO> getSpecificationList() {
        return specificationList;
    }

    public void setSpecificationList(List<SpecListVO> specificationList) {
        this.specificationList = specificationList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("goodsId", goodsId)
                .append("name", name)
                .append("picUrl", picUrl)
                .append("type", type)
                .append("brandName", brandName)
                .append("joinStartAt", joinStartAt)
                .append("joinEndAt", joinEndAt)
                .append("commodityCategoryList", commodityCategoryList)
                .append("specificationList", specificationList)
                .toString();
    }
}
