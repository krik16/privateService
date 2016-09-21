package com.rongyi.easy.roa.param;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yaoyiwei on 2016/9/21.
 */
public class SelfCommodityParam  extends MalllifeBaseParam implements Serializable {

    private String commodityCode;
    private String commodityName;
    private String categoryId;
    List<Integer> stockRange;

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

    public List<Integer> getStockRange() {
        return stockRange;
    }

    public void setStockRange(List<Integer> stockRange) {
        this.stockRange = stockRange;
    }
}
