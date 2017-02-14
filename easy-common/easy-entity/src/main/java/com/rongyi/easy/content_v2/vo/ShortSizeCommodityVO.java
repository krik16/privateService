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
public class ShortSizeCommodityVO implements Serializable, Comparator<ShortSizeCommodityVO> {
    private String id; //商品id
    private List<String> picUrls; //商品图片
    private String name; //商品名称
    private String originalPrice; //商品原价
    private String currentPrice; // 商品现价
    private Integer stock;//商品库存
    private Date updateAt;//数据更新日期
    public Date getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
    public int compare(ShortSizeCommodityVO commodityVO1, ShortSizeCommodityVO commodityVO2){
        if(commodityVO1 == null || commodityVO1.getUpdateAt() == null){
            return -1;
        }else if(commodityVO2 == null || commodityVO2.getUpdateAt() ==  null){
            return 1;
        }else if(commodityVO1.getUpdateAt().after(commodityVO2.getUpdateAt())){
            return 1;
        }else {
            return -1;
        }
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
                ", originalPrice='" + originalPrice + '\'' +
                ", currentPrice='" + currentPrice + '\'' +
                ", stock=" + stock +
                ", updateAt=" + updateAt +
                '}';
    }
}
