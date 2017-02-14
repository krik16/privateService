package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GoodsDetailSync implements Serializable {
    private Integer id;

    private Integer activityTemplateId;

    private String goodsId;

    private String name;

    private String pic;

    private String code;

    private String shopMid;

    private String shopName;

    private String mallName;

    private String mallMid;

    private String brandMid;

    private String brandName;

    private Integer minPrice;

    private Integer maxPrice;

    private BigDecimal discount;

    private Integer stock;

    private Integer sold;

    private String categoryId2;

    private String categoryId3;

    private String categoryId4;

    private String categoryName2;

    private String categoryName3;

    private String categoryName4;

    private Integer status;

    private String description;

    private Date createAt;

    private Date updateAt;

    private Integer isDeleted;



    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityTemplateId", activityTemplateId)
                .append("goodsId", goodsId)
                .append("name", name)
                .append("pic", pic)
                .append("code", code)
                .append("shopMid", shopMid)
                .append("shopName", shopName)
                .append("mallName", mallName)
                .append("mallMid", mallMid)
                .append("brandMid", brandMid)
                .append("brandName", brandName)
                .append("status", status)
                .append("minPrice", minPrice)
                .append("createAt", createAt)
                .append("maxPrice", maxPrice)
                .append("updateAt", updateAt)
                .append("discount", discount)
                .append("isDeleted", isDeleted)
                .append("stock", stock)
                .append("sold", sold)
                .append("categoryId2", categoryId2)
                .append("categoryId3", categoryId3)
                .append("categoryId4", categoryId4)
                .append("categoryName2", categoryName2)
                .append("categoryName3", categoryName3)
                .append("categoryName4", categoryName4)
                .append("status", status)
                .append("description", description)
                .append("createAt", createAt)
                .toString();
    }


    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityTemplateId() {
        return activityTemplateId;
    }

    public void setActivityTemplateId(Integer activityTemplateId) {
        this.activityTemplateId = activityTemplateId;
    }

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }

    public String getBrandMid() {
        return brandMid;
    }

    public void setBrandMid(String brandMid) {
        this.brandMid = brandMid;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
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

    public String getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(String categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public String getCategoryId3() {
        return categoryId3;
    }

    public void setCategoryId3(String categoryId3) {
        this.categoryId3 = categoryId3;
    }

    public String getCategoryId4() {
        return categoryId4;
    }

    public void setCategoryId4(String categoryId4) {
        this.categoryId4 = categoryId4;
    }

    public String getCategoryName2() {
        return categoryName2;
    }

    public void setCategoryName2(String categoryName2) {
        this.categoryName2 = categoryName2;
    }

    public String getCategoryName3() {
        return categoryName3;
    }

    public void setCategoryName3(String categoryName3) {
        this.categoryName3 = categoryName3;
    }

    public String getCategoryName4() {
        return categoryName4;
    }

    public void setCategoryName4(String categoryName4) {
        this.categoryName4 = categoryName4;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}