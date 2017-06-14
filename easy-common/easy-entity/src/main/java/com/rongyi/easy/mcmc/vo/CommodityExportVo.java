package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by xuying on 2016/6/22.
 */
public class CommodityExportVo implements Serializable, Cloneable {

    private String  id ;//系统编号
    private String  code ;//商品条码
    private String commodityModelNo; // 商品款号
    private String  name;//商品名称
    private String  brandName;//品牌
    private String  categoryName;//商品所属的品类列表
    private String  mallName;//商场名称
    private String  shopName;//店铺名称
    private Integer source;// 渠道  0商家，1买手
    private Integer  status;//商品状态
    private Date createAt ;//创建时间
    private Date registerAt; // 上架时间

    private List<CommoditySpecVO> specList;
    private CommoditySpecVO currentSpec;

    private String description;//商品描述

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

    public String getCommodityModelNo() {
        return commodityModelNo;
    }

    public void setCommodityModelNo(String commodityModelNo) {
        this.commodityModelNo = commodityModelNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public Date getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(Date registerAt) {
        this.registerAt = registerAt;
    }

    public List<CommoditySpecVO> getSpecList() {
        return specList;
    }

    public void setSpecList(List<CommoditySpecVO> specList) {
        this.specList = specList;
    }

    public CommoditySpecVO getCurrentSpec() {
        return currentSpec;
    }

    public void setCurrentSpec(CommoditySpecVO currentSpec) {
        this.currentSpec = currentSpec;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CommodityExportVo{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", commodityModelNo='" + commodityModelNo + '\'' +
                ", name='" + name + '\'' +
                ", brandName='" + brandName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", mallName='" + mallName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", source=" + source +
                ", status=" + status +
                ", createAt=" + createAt +
                ", registerAt=" + registerAt +
                ", specList=" + specList +
                ", currentSpec=" + currentSpec +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public CommodityExportVo clone() throws CloneNotSupportedException {
        CommodityExportVo vo = new CommodityExportVo();
        vo.setId(id);
        vo.setCode(code);
        vo.setCommodityModelNo(commodityModelNo);
        vo.setName(name);
        vo.setCategoryName(categoryName);
        vo.setBrandName(brandName);
        vo.setMallName(mallName);
        vo.setShopName(shopName);
        vo.setDescription(description);
        vo.setStatus(status);
        vo.setCreateAt(createAt);
        vo.setRegisterAt(registerAt);
        vo.setSource(source);

        return vo;
    }
}
