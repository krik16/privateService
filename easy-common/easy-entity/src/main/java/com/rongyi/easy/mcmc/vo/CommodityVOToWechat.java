package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.ryoms.entity.WechatInfoVo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by xuying on 2016/3/17.
 */
public class CommodityVOToWechat implements Serializable{

    private String id;
    private String img;
    private String name;
    private String currentPrice;
    private String registerAt;
    private String shopName;
    private Integer terminalType;
    private String mallMid;//商场mongoId
    private String commodityModelNo;//商品款号
    private List<String> onServiceIds;
    private List<String> offServiceIds;
    private List<WechatInfoVo> wechatInfoVos;
    private List<String> categoryNames;

    public List<String> getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(List<String> categoryNames) {
        this.categoryNames = categoryNames;
    }

    public List<String> getOnServiceIds() {
        return onServiceIds;
    }

    public void setOnServiceIds(List<String> onServiceIds) {
        this.onServiceIds = onServiceIds;
    }

    public List<String> getOffServiceIds() {
        return offServiceIds;
    }

    public void setOffServiceIds(List<String> offServiceIds) {
        this.offServiceIds = offServiceIds;
    }

    public List<WechatInfoVo> getWechatInfoVos() {
        return wechatInfoVos;
    }

    public void setWechatInfoVos(List<WechatInfoVo> wechatInfoVos) {
        this.wechatInfoVos = wechatInfoVos;
    }

    public String getCommodityModelNo() {
        return commodityModelNo;
    }

    public void setCommodityModelNo(String commodityModelNo) {
        this.commodityModelNo = commodityModelNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(String registerAt) {
        this.registerAt = registerAt;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

	public String getMallMid() {
		return mallMid;
	}

	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}
}
