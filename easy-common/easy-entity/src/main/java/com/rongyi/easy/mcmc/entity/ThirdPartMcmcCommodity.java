package com.rongyi.easy.mcmc.entity;

import java.io.Serializable;

/**
 * Created by xuying on 2016/6/6.
 */
public class ThirdPartMcmcCommodity implements Serializable{
    private Integer id;//主键
    private String poiId = "";//自动生成的POIID
    private String brandChsName = "";//品牌的中文名称
    private String brandEngName = "";//品牌的英文名称
    private String title = "";//商品名称
    private String artNo = "";//商品款号
    private String orgPrice = "";//原价
    private String salePrice = "";//现价
    private String size = "";//尺寸
    private String color = "";//颜色
    private String image = "";//图片
    private String info = "";//商品参数

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        return "ThirdPartMcmcCommodity [poiId=" + poiId +",id=" +id  + ", brandChsName=" + brandChsName + ", brandEngName=" + brandEngName
                + ", title=" + title + ", artNo=" + artNo + ", orgPrice=" + orgPrice + ", salePrice=" + salePrice
                + ", size=" + size + ", color=" + color + ", image=" + image + ", info=" + info + "]";
    }
}
