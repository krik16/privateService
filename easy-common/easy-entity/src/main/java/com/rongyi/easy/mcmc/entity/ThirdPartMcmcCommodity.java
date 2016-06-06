package com.rongyi.easy.mcmc.entity;

import java.io.Serializable;

/**
 * Created by xuying on 2016/6/6.
 */
public class ThirdPartMcmcCommodity implements Serializable{

    private String poiId = "";//自动生成的POIID
    private String brandChsName = "";//品牌的中文名称
    private String brandEngName = "";//品牌的英文名称
    private String title = "";//标题
    private String artNo = "";//
    private String orgPrice = "";
    private String salePrice = "";
    private String size = "";
    private String color = "";
    private String image = "";
    private String info = "";

    public String getPoiId() {
        return poiId;
    }

    public void setPoiId(String poiId) {
        this.poiId = poiId;
    }

    public String getBrandChsName() {
        return brandChsName;
    }

    public void setBrandChsName(String brandChsName) {
        this.brandChsName = brandChsName;
    }

    public String getBrandEngName() {
        return brandEngName;
    }

    public void setBrandEngName(String brandEngName) {
        this.brandEngName = brandEngName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtNo() {
        return artNo;
    }

    public void setArtNo(String artNo) {
        this.artNo = artNo;
    }

    public String getOrgPrice() {
        return orgPrice;
    }

    public void setOrgPrice(String orgPrice) {
        this.orgPrice = orgPrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ThirdPartMcmcCommodity [poiId=" + poiId + ", brandChsName=" + brandChsName + ", brandEngName=" + brandEngName
                + ", title=" + title + ", artNo=" + artNo + ", orgPrice=" + orgPrice + ", salePrice=" + salePrice
                + ", size=" + size + ", color=" + color + ", image=" + image + ", info=" + info + "]";
    }
}
