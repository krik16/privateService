package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.ryoms.entity.WechatInfoVo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yaoyiwei on 2017/3/10.
 */
public class HaiXinCommodityVO implements Serializable {
    private String id;
    private String img;
    private String name;
    private String commodityCode;  //商品条码
    private String barCode;        //商品编码
    private List<String> categoryNames;
    private String sku;
    private String originalPrice;
    private String currentPrice;
    private Integer stock;
    private Integer sold;
    private String orgName;
    private Date updateAt;
    private Integer status;
    private Boolean isEditable;

    public Boolean getEditable() {
        return isEditable;
    }

    public void setEditable(Boolean editable) {
        isEditable = editable;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public List<String> getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(List<String> categoryNames) {
        this.categoryNames = categoryNames;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "HaiXinCommodityVO{" +
                "id='" + id + '\'' +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", commodityCode='" + commodityCode + '\'' +
                ", barCode='" + barCode + '\'' +
                ", categoryNames=" + categoryNames +
                ", sku='" + sku + '\'' +
                ", originalPrice='" + originalPrice + '\'' +
                ", currentPrice='" + currentPrice + '\'' +
                ", stock=" + stock +
                ", sold=" + sold +
                ", orgName='" + orgName + '\'' +
                ", updateAt=" + updateAt +
                '}';
    }
}
