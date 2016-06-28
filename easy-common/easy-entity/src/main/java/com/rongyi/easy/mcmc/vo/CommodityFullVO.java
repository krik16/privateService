package com.rongyi.easy.mcmc.vo;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

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
    private String brandName;
    private String brandId;
    private String brandMid;
    private String shopName;
    private String postage;//商品邮费
    private boolean supportCourierDeliver = true;//支持快递发货字段  true 是    false否
    private int type; // 渠道  0商家，1买手

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

    /**
     * 判断是否包邮
     * @return
     */
    public Boolean isShipping() {
        if (supportCourierDeliver) {
            if (StringUtils.isBlank(postage) || Double.valueOf(0).equals(Double.valueOf(postage))) {
                return true;
            }
        }
        return false;
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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandMid() {
        return brandMid;
    }

    public void setBrandMid(String brandMid) {
        this.brandMid = brandMid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("code", code)
                .append("originalPrice", originalPrice)
                .append("currentPrice", currentPrice)
                .append("stock", stock)
                .append("picList", picList)
                .append("categorySimpleVOs", categorySimpleVOs)
                .append("specSimpleVOs", specSimpleVOs)
                .append("status", status)
                .append("registerAt", registerAt)
                .append("soldOutAt", soldOutAt)
                .append("brandName", brandName)
                .append("brandId", brandId)
                .append("brandMid", brandMid)
                .append("shopName", shopName)
                .append("postage", postage)
                .append("supportCourierDeliver", supportCourierDeliver)
                .append("type",type)
                .toString();
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public String getPostage() {
        return postage;
    }

    public void setPostage(String postage) {
        this.postage = postage;
    }

    public boolean isSupportCourierDeliver() {
        return supportCourierDeliver;
    }

    public void setSupportCourierDeliver(boolean supportCourierDeliver) {
        this.supportCourierDeliver = supportCourierDeliver;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
