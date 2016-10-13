package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommodityCategorySimpleVO;

/**
 * Created by yangyang on 2016/10/10.
 */
public class ResGoods implements Serializable {

    private String goodsId;
    private String shopName;
    private String goodsName;
    private String categoryStr;
    private String currrentPrice;
    private String activityPrice;
    private int joinCount;
    private int allocationCount;
    
    private List<RoundGood> roundGood;
    
   	public List<RoundGood> getRoundGood() {
   		return roundGood;
   	}

   	public void setRoundGood(List<RoundGood> roundGood) {
   		this.roundGood = roundGood;
   	}

	/**
     * 分类
     * */
    private List<CommodityCategorySimpleVO> categorySimpleVOs;
    
    
    

    public List<CommodityCategorySimpleVO> getCategorySimpleVOs() {
		return categorySimpleVOs;
	}

	public void setCategorySimpleVOs(List<CommodityCategorySimpleVO> categorySimpleVOs) {
		this.categorySimpleVOs = categorySimpleVOs;
	}

	public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCategoryStr() {
        return categoryStr;
    }

    public void setCategoryStr(String categoryStr) {
        this.categoryStr = categoryStr;
    }

    public String getCurrrentPrice() {
        return currrentPrice;
    }

    public void setCurrrentPrice(String currrentPrice) {
        this.currrentPrice = currrentPrice;
    }

    public String getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(String activityPrice) {
        this.activityPrice = activityPrice;
    }

    public int getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(int joinCount) {
        this.joinCount = joinCount;
    }

    public int getAllocationCount() {
        return allocationCount;
    }

    public void setAllocationCount(int allocationCount) {
        this.allocationCount = allocationCount;
    }
}
