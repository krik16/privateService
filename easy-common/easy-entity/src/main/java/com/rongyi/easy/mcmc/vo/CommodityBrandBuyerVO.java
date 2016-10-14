package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * Created by xgq on 2015/10/30.
 */
public class CommodityBrandBuyerVO implements Serializable {
    private String id;
    private String name;
    private String icon;
    private int totalSales;
    private String slug;

    public String getLogo() {
        return "http://rongyi.b0.upaiyun.com/system/brand/icon/" + id + "/" + icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "CommodityBrandBuyerVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", totalSales=" + totalSales +
                '}';
    }
}
