package com.rongyi.easy.mcmc.entity;

import java.io.Serializable;
import java.util.Date;

public class CommodityStockEntity implements  Serializable {
	
	private static final long serialVersionUID = -3491400779856182500L;
	
    private Integer id;

    private Integer stock;

    private Integer remain;

    private String shopMid;

    private String filialeMid;

    private String commodityMid;

    private String commoditySpecMid;

    private Integer isDisabled;

    private Integer createBy;

    private Date createAt;

    private Integer updateBy;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getFilialeMid() {
        return filialeMid;
    }

    public void setFilialeMid(String filialeMid) {
        this.filialeMid = filialeMid;
    }

    public String getCommodityMid() {
        return commodityMid;
    }

    public void setCommodityMid(String commodityMid) {
        this.commodityMid = commodityMid;
    }

    public String getCommoditySpecMid() {
        return commoditySpecMid;
    }

    public void setCommoditySpecMid(String commoditySpecMid) {
        this.commoditySpecMid = commoditySpecMid;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}