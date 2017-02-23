package com.rongyi.easy.content_v2.vo;

import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Created by WUH
 * on 2017/1/14.
 */
public class ShortSizeCommodityVO implements Serializable {
    private String id; //商品id
    private List<String> picUrls; //商品图片
    private String name; //商品原名称
    private String title; //商品发布名称
    private String originalPrice; //商品原价
    private String currentPrice; // 商品现价
    private Integer stock;//商品库存
    private Date updateAt;//数据更新日期
    private Integer position; //排序字段
    private Integer templateRelevantGoodsCouponId;  //用作排序

    public Integer getTemplateRelevantGoodsCouponId() {
        return templateRelevantGoodsCouponId;
    }

    public void setTemplateRelevantGoodsCouponId(Integer templateRelevantGoodsCouponId) {
        this.templateRelevantGoodsCouponId = templateRelevantGoodsCouponId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public int compareTo(ShortSizeCommodityVO o){
        return -1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(List<String> picUrls) {
        this.picUrls = picUrls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "ShortSizeCommodityVO{" +
                "id='" + id + '\'' +
                ", picUrls=" + picUrls +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", originalPrice='" + originalPrice + '\'' +
                ", currentPrice='" + currentPrice + '\'' +
                ", stock=" + stock + '\'' +
                ", updateAt=" + updateAt + '\'' +
                ", position=" + position + '\'' +
                '}';
    }
}
