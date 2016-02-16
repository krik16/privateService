package com.rongyi.easy.mcmc.vo;

import org.apache.commons.collections.CollectionUtils;

import java.io.Serializable;
import java.util.List;

public class CommoditySpecSimpleVO implements Serializable {
    private String id;
    private Integer stock;//库存
    private Double originalPrice;
    private Double currentPrice;
    private List<CommoditySpecColumnVO> specColumns;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
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
