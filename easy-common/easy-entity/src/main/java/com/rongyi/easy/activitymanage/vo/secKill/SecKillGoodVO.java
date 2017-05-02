package com.rongyi.easy.activitymanage.vo.secKill;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;
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
    private Date activitySessionStartAt;//场次开始时间
    private Date activitySessionEndAt;//场次结束时间

    private List<SecKillGoodSpecVO> specs;//商品规格列表

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

    public Date getActivitySessionStartAt() {
        return activitySessionStartAt;
    }

    public void setActivitySessionStartAt(Date activitySessionStartAt) {
        this.activitySessionStartAt = activitySessionStartAt;
    }

    public Date getActivitySessionEndAt() {
        return activitySessionEndAt;
    }

    public void setActivitySessionEndAt(Date activitySessionEndAt) {
        this.activitySessionEndAt = activitySessionEndAt;
    }

    public List<SecKillGoodSpecVO> getSpecs() {
        return specs;
    }

    public void setSpecs(List<SecKillGoodSpecVO> specs) {
        this.specs = specs;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
