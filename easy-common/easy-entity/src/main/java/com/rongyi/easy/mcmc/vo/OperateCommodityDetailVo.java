package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.mcmc.entity.CommodityCustomCategoryEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by xuying on 2016/6/22.
 */
public class OperateCommodityDetailVo implements Serializable{
    private String id ;//系统编码
    private String code ;// 商品条码
    private String  name;// 商品名称
    private String commodityModelNo ;// 商品款号
    private String   categoryIds ;// 所属分类
    private List<CommodityCustomCategoryEntity> customCategory=new ArrayList<CommodityCustomCategoryEntity>();//自定义分类列表
    private String mallName  ;//商场
    private String shopName ;//店铺
    private boolean isSpot;//  商品属性 是否现货
    private Integer purchaseCount ;// 商品限购
    private Integer type ;//渠道 渠道  0商家，1买手
    private Integer source  ;//  商品来源0表示页面添加1表示批量导入2app创建商品
    private Integer status  ;//商品状态
    private Integer stock;//商品库存（包括卖出的商品和锁定的商品）
    private Integer remain  ;//剩余量
    private List<CommoditySpecVO1> specList;//商品规格列表
    private List<String>picList  ;// 商品图片
    private String description  ;//商品描述
    private List<String> goodsParam ;// 商品参数
    private boolean supportSelfPickup   ;//配送方式
    private Date registerAt ;// 上架时间
    private Date soldOutAt ;// 下架时间
    private Date createAt ;// 创建时间
    private String  createBy ;// 创建人
    private Date updateAt ;//最近更新时间
    private String  updateBy ;//最近更新人

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommodityModelNo() {
        return commodityModelNo;
    }

    public void setCommodityModelNo(String commodityModelNo) {
        this.commodityModelNo = commodityModelNo;
    }

    public String getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }

    public List<CommodityCustomCategoryEntity> getCustomCategory() {
        return customCategory;
    }

    public void setCustomCategory(List<CommodityCustomCategoryEntity> customCategory) {
        this.customCategory = customCategory;
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

    public boolean isSpot() {
        return isSpot;
    }

    public void setIsSpot(boolean isSpot) {
        this.isSpot = isSpot;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    public List<CommoditySpecVO1> getSpecList() {
        return specList;
    }

    public void setSpecList(List<CommoditySpecVO1> specList) {
        this.specList = specList;
    }

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getGoodsParam() {
        return goodsParam;
    }

    public void setGoodsParam(List<String> goodsParam) {
        this.goodsParam = goodsParam;
    }

    public boolean isSupportSelfPickup() {
        return supportSelfPickup;
    }

    public void setSupportSelfPickup(boolean supportSelfPickup) {
        this.supportSelfPickup = supportSelfPickup;
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
