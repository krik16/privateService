package com.rongyi.easy.mcmc.vo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by xuying on 2016/6/22.
 */
public class OperateCommodityVo implements Serializable {


    private String  id ;//系统编号
    private String  name;//商品名称
    private String  picList;//商品图片
    private String  categoryIds;//商品所属的品类列表
    private String  mallName;//商场名称
    private String  shopName;//店铺名称
    private Integer source;// 渠道  0商家，1买手
    private Integer  status;//商品状态
    private Date createAt ;//创建时间
    private String reason;
    private String buyerAccount;
    private Date soldOutAt;//下架时间
    private Integer type;//渠道  0商家，1买手
    private String originalPrice;//商品原价
    private String currentPrice;//商品现价
    private String description;//商品描述
    private Integer stock;//商品库存

    private List<CommoditySpecVO> specList;
    private CommoditySpecVO currentSpec;

    public CommoditySpecVO getCurrentSpec() {
        return currentSpec;
    }

    public void setCurrentSpec(CommoditySpecVO currentSpec) {
        this.currentSpec = currentSpec;
    }

    public List<CommoditySpecVO> getSpecList() {
        return specList;
    }

    public void setSpecList(List<CommoditySpecVO> specList) {
        this.specList = specList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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

    public String getPicList() {
        return picList;
    }

    public void setPicList(String picList) {
        this.picList = picList;
    }

    public String getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public Date getSoldOutAt() {
        return soldOutAt;
    }

    public void setSoldOutAt(Date soldOutAt) {
        this.soldOutAt = soldOutAt;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
