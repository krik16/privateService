package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.CommoditySpecWebVO;
import org.apache.commons.lang.builder.ToStringBuilder;

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

    private String shopName;
    private String detailPic;
    private String discount;

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

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

    public String getDetailPic() {
        return detailPic;
    }

    public void setDetailPic(String detailPic) {
        this.detailPic = detailPic;
    }

    public void setSpecList(List<CommoditySpecWebVO> specList) {
        this.specList = specList;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("categories", categories)
                .append("brandName", brandName)
                .append("count", count)
                .append("price", price)
                .append("specList", specList)
                .append("shopMid", shopMid)
                .append("shopName", shopName)
                .append("detailPic", detailPic)
                .append("discount", discount)
                .toString();
    }
}
