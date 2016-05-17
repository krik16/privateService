package com.rongyi.easy.activitymanage.entity;

import com.google.inject.internal.Lists;
import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/5/17.
 */
public class SpeSale implements Serializable {
    private Integer id;
    private String name;
    private String urlPics;

    private List<CommodityBuyerVO> commodityBuyerVOList = Lists.newArrayList();

    public List<CommodityBuyerVO> getCommodityBuyerVOList() {
        return commodityBuyerVOList;
    }

    public void setCommodityBuyerVOList(List<CommodityBuyerVO> commodityBuyerVOList) {
        this.commodityBuyerVOList = commodityBuyerVOList;
    }

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

    public String getUrlPics() {
        return urlPics;
    }

    public void setUrlPics(String urlPics) {
        this.urlPics = urlPics;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("urlPics", urlPics)
                .append("commodityBuyerVOList", commodityBuyerVOList)
                .toString();
    }
}
