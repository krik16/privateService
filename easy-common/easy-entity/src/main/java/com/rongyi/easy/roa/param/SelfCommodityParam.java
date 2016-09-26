package com.rongyi.easy.roa.param;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

import java.io.Serializable;

/**
 * Created by yaoyiwei on 2016/9/21.
 */
public class SelfCommodityParam  extends MalllifeBaseParam implements Serializable {

    private String commodityCode;
    private String commodityName;
    private String categoryId;
    private Integer minStock;
    private Integer maxStock;
    private String shopId;


    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }

    public Integer getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "SelfCommodityParam{" +
                "commodityCode='" + commodityCode + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", minStock=" + minStock +
                ", maxStock=" + maxStock +
                '}';
    }
}
