package com.rongyi.easy.mcmc.vo;

import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2017/1/19.
 */
public class WechatCommodityVo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String commodityId;

    private String commodityName;

    private String cuerrentPrice;

    private String picUrl;

    private List<String> specList;//商品规格列表

    private String originalPrice;

    private String brandName;

    private String code;

    private String description;


    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCuerrentPrice() {
        return cuerrentPrice;
    }

    public void setCuerrentPrice(String cuerrentPrice) {
        this.cuerrentPrice = cuerrentPrice;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public List<String> getSpecList() {
        return specList;
    }

    public void setSpecList(List<String> specList) {
        this.specList = specList;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "WechatCommodityVo{" +
                "commodityId=" + commodityId +
                ", commodityName=" + commodityName +
                ", cuerrentPrice=" + cuerrentPrice +
                ", picUrl=" + picUrl +
                ", specList=" + specList +
                ", originalPrice=" + originalPrice +
                '}';
    }
}
