package com.rongyi.easy.activitymanage.vo;

import com.google.inject.internal.Lists;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/9/21.
 */
public class RefSecSkillGoods implements Serializable {

    private Integer id;
    private Integer activityId;//活动id
    private String goodsId;//商品id
    private String shopId;//店铺id
    private String goodsCode;//商品编码
    private String goodsName;//商品名称
    private String shopName;//店铺名称
    private String userId;//用户id
    private List<GoodsSku> goodsSkus = Lists.newArrayList();


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("goodsCode", goodsCode)
                .append("goodsName", goodsName)
                .append("shopName", shopName)
                .append("goodsSkus", goodsSkus)
                .append("goodsId", goodsId)
                .append("shopId", shopId)
                .append("userId", userId)
                .toString();
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public List<GoodsSku> getGoodsSkus() {
        return goodsSkus;
    }

    public void setGoodsSkus(List<GoodsSku> goodsSkus) {
        this.goodsSkus = goodsSkus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
