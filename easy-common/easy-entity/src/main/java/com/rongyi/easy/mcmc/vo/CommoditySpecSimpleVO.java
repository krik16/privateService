package com.rongyi.easy.mcmc.vo;

import org.apache.commons.collections.CollectionUtils;

import java.io.Serializable;
import java.util.List;

public class CommoditySpecSimpleVO implements Serializable {
    private String id;
    private String stock;//库存
    private String originalPrice;
    private String currentPrice;
    private List<CommoditySpecColumnVO> specColumns;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
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

    public List<CommoditySpecColumnVO> getSpecColumns() {
        return specColumns;
    }

    public void setSpecColumns(List<CommoditySpecColumnVO> specColumns) {
        this.specColumns = specColumns;
    }

    public String getSpecDetailString() {
        if (CollectionUtils.isNotEmpty(this.getSpecColumns())) {
            StringBuffer specDetail = new StringBuffer("");
            for (CommoditySpecColumnVO commoditySpecColumnVO : this.getSpecColumns()) {
                specDetail.append(commoditySpecColumnVO.getColumnName());
                specDetail.append(":");
                specDetail.append(commoditySpecColumnVO.getColumnValue());
                specDetail.append("|");
            }
            if (specDetail.toString().endsWith("|")) {
                return specDetail.toString().substring(0, specDetail.toString().length() - 1);
            } else return "";
        } else return "";
    }
}
