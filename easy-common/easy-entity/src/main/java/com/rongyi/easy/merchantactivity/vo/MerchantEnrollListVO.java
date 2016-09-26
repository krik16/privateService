package com.rongyi.easy.merchantactivity.vo;

import com.rongyi.easy.activitymanage.entity.ActivityGoodsRule;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/10
 * TIME : 15:04
 * ideaworkspace.
 */
public class MerchantEnrollListVO implements Serializable {

    /**
     * PK
     */
    private Integer id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动开始时间
     */
    private Date startAt;

    /**
     * 活动结束时间
     */
    private Date endAt;


    /**
     * 活动状态：待审核[0] 未通过[1] 已通过[2] 已下线[3]
     */
    private Integer status;

    /**
     * 活动报名开始时间
     */
    private Date enrollStartAt;
    /**
     * 活动报名结束时间
     */
    private Date enrollEndAt;

    /**
     * 0:取消撤销状态  1:表示申请撤销中状态
     */
    private Integer applyStatus;
    /**
     * 推送创建时间
     */
    private Date enrollCreateAt;
    /**
     * 商品的统计
     */
    private int goodsCount;

    /**
     * 规则
     * @return
     */
    private String activityRule;

    private Integer isDeleted;
    
    /**
     * 活动类型 0.商品类活动，1卡券类活动，2.抽奖类活动 3.卡券及商品类活动，4.签到送积分，5，特卖7秒杀' 7'10月版本新增的秒杀'
     * @return
     */
    private Integer type;
    
    
    
    

    public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getEnrollStartAt() {
        return enrollStartAt;
    }

    public void setEnrollStartAt(Date enrollStartAt) {
        this.enrollStartAt = enrollStartAt;
    }

    public Date getEnrollEndAt() {
        return enrollEndAt;
    }

    public void setEnrollEndAt(Date enrollEndAt) {
        this.enrollEndAt = enrollEndAt;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Date getEnrollCreateAt() {
        return enrollCreateAt;
    }

    public void setEnrollCreateAt(Date enrollCreateAt) {
        this.enrollCreateAt = enrollCreateAt;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getActivityRule() {
        return activityRule;
    }

    public void setActivityRule(String activityRule) {
        this.activityRule = activityRule;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "MerchantEnrollListVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startAt=" + startAt +
                ", endAt=" + endAt +
                ", status=" + status +
                ", enrollStartAt=" + enrollStartAt +
                ", enrollEndAt=" + enrollEndAt +
                ", applyStatus=" + applyStatus +
                ", enrollCreateAt=" + enrollCreateAt +
                ", goodsCount=" + goodsCount +
                ", activityRule='" + activityRule + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
