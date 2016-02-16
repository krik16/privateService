package com.rongyi.easy.mcmc.vo;

import org.apache.commons.collections.CollectionUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by xgq on 2016/2/1.
 */
public class CommodityFullVO implements Serializable {
    private String id;
    private String name;
    private String code;
    private String originalPrice;//商品原价
    private String currentPrice;//商品现价
    private Integer stock;//商品库存
    private List<String> picList;//商品图片列表
    private List<CommodityCategorySimpleVO> categorySimpleVOs;
    private List<CommoditySpecSimpleVO> specSimpleVOs;

    private int status;
    private Date registerAt;//上架时间
    private Date soldOutAt;//下架时间

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public Double getOriginalPriceDouble() {
        return Double.valueOf(originalPrice);
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public Double getCurrentPriceDouble() {
        return Double.valueOf(currentPrice);
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

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public List<CommodityCategorySimpleVO> getCategorySimpleVOs() {
        return categorySimpleVOs;
    }

    public void setCategorySimpleVOs(List<CommodityCategorySimpleVO> categorySimpleVOs) {
        this.categorySimpleVOs = categorySimpleVOs;
    }

    public List<CommoditySpecSimpleVO> getSpecSimpleVOs() {
        return specSimpleVOs;
    }

    public void setSpecSimpleVOs(List<CommoditySpecSimpleVO> specSimpleVOs) {
        this.specSimpleVOs = specSimpleVOs;
    }

    public String getFirstPic() {
        if (CollectionUtils.isNotEmpty(this.getPicList())) {
            return this.getPicList().get(0);
        } else return "";
    }

    /**
     * 获取商品分类的层级信息
     *
     * @return 餐饮 > 西餐 > 牛排
     */
    public String getCategoryTierString() {
        if (CollectionUtils.isNotEmpty(this.getCategorySimpleVOs())) {
            StringBuffer categoryTier = new StringBuffer("");
            for (CommodityCategorySimpleVO categorySimpleVO : this.getCategorySimpleVOs()) {
                categoryTier.append(categorySimpleVO.getName());
                categoryTier.append(" > ");
            }
            if (categoryTier.toString().endsWith(" > ")) {
                return categoryTier.toString().substring(0, categoryTier.toString().length() - 3);
            } else return "";
        } else return "";
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(Date registerAt) {
        this.registerAt = registerAt;
    }

    public Date getSoldOutAt() {
        return soldOutAt;
    }

    public void setSoldOutAt(Date soldOutAt) {
        this.soldOutAt = soldOutAt;
    }
}
