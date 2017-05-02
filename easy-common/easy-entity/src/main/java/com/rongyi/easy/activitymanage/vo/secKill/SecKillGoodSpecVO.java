package com.rongyi.easy.activitymanage.vo.secKill;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author chenjun
 * @date 2017/5/2 11:26
 */
public class SecKillGoodSpecVO implements Serializable{

    private static final long serialVersionUID = 6136565841261086534L;

    private String activityGoodsId;//活动商品关联表id
    private String goodId;//商品id
    private String goodSpecId;//商品规格id
    private double goodPrice;//价格:元
    private int joinCount;//拼团参与库存
    private int remainCount;//剩余库存

    public String getActivityGoodsId() {
        return activityGoodsId;
    }

    public void setActivityGoodsId(String activityGoodsId) {
        this.activityGoodsId = activityGoodsId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodSpecId() {
        return goodSpecId;
    }

    public void setGoodSpecId(String goodSpecId) {
        this.goodSpecId = goodSpecId;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(int joinCount) {
        this.joinCount = joinCount;
    }

    public int getRemainCount() {
        return remainCount;
    }

    public void setRemainCount(int remainCount) {
        this.remainCount = remainCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
