package com.rongyi.easy.activitymanage.vo.secKill;

import com.rongyi.easy.activitymanage.vo.groupBuy.GoodSpecInfo;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * @author chenjun
 * @date 2017/5/2 11:26
 */
public class SecKillGoodVO implements Serializable{

    private static final long serialVersionUID = 193121478095342066L;

    private Integer activityId;//活动id
    private Integer activityCommodityId;//活动商品关联表id
    private String goodId;//商品id
    private String goodName;//商品/卡券名称
    private String goodDesc;//商品描述
    private int limitNum;//限购数量 0表示不限购
    private Integer activityCommodityStatus;//商品审核状态：待审核[0] 未通过[1] 已通过[2] 6下线 7活动结束
    private long activitySessionStartAt;//场次开始时间
    private long activitySessionEndAt;//场次结束时间
    private double goodPrice;//价格:元
    private int activityCommodityStock;//活动商品库存
    private int activityCommodityTotalStock;//活动商品总库存

    private List<GoodSpecInfo> specs;//商品规格列表

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodDesc() {
        return goodDesc;
    }

    public void setGoodDesc(String goodDesc) {
        this.goodDesc = goodDesc;
    }

    public int getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(int limitNum) {
        this.limitNum = limitNum;
    }

    public Integer getActivityCommodityStatus() {
        return activityCommodityStatus;
    }

    public void setActivityCommodityStatus(Integer activityCommodityStatus) {
        this.activityCommodityStatus = activityCommodityStatus;
    }

    public Integer getActivityCommodityId() {
        return activityCommodityId;
    }

    public void setActivityCommodityId(Integer activityCommodityId) {
        this.activityCommodityId = activityCommodityId;
    }

    public long getActivitySessionStartAt() {
        return activitySessionStartAt;
    }

    public void setActivitySessionStartAt(long activitySessionStartAt) {
        this.activitySessionStartAt = activitySessionStartAt;
    }

    public long getActivitySessionEndAt() {
        return activitySessionEndAt;
    }

    public void setActivitySessionEndAt(long activitySessionEndAt) {
        this.activitySessionEndAt = activitySessionEndAt;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getActivityCommodityStock() {
        return activityCommodityStock;
    }

    public void setActivityCommodityStock(int activityCommodityStock) {
        this.activityCommodityStock = activityCommodityStock;
    }

    public int getActivityCommodityTotalStock() {
        return activityCommodityTotalStock;
    }

    public void setActivityCommodityTotalStock(int activityCommodityTotalStock) {
        this.activityCommodityTotalStock = activityCommodityTotalStock;
    }

    public List<GoodSpecInfo> getSpecs() {
        return specs;
    }

    public void setSpecs(List<GoodSpecInfo> specs) {
        this.specs = specs;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
