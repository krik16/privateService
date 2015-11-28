package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.CommoditySpecWebVO;

import java.io.Serializable;
import java.util.List;

/**
 * Description: 前台页面展示VO
 * Author: 袁波
 * DATE: 2015/11/27 19:45
 * Package:com.rongyi.easy.coupon.vo
 * Project:easy-market
 */
public class CommodityWebVO implements Serializable{
    private String id;
    private String name;
    private String categories;
    private String brandName;
    private int count;
    private Double price;
    List<CommoditySpecWebVO> specList;
    private String shopMid;

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
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

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<CommoditySpecWebVO> getSpecList() {
        return specList;
    }

    public void setSpecList(List<CommoditySpecWebVO> specList) {
        this.specList = specList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CommodityWebVO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", categories='").append(categories).append('\'');
        sb.append(", brandName='").append(brandName).append('\'');
        sb.append(", count=").append(count);
        sb.append(", price=").append(price);
        sb.append(", specList=").append(specList);
        sb.append(", shopMid='").append(shopMid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
