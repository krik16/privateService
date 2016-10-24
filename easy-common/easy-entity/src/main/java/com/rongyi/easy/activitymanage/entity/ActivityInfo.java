package com.rongyi.easy.activitymanage.entity;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 活动基础信息
 */
public class ActivityInfo implements Serializable {

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
     * 活动类型 0.商品类活动，1卡券类活动，2.抽奖类活动 3.卡券及商品类活动，4.签到送积分，5，特卖
     */
    private Integer type;

    /**
     * 发布终端:[1,1,1,1]表示容易逛、终端屏、微信、微商端全部选中[1,0,0,0]表示第一个选中
     */
    private String synTarget;

    /**
     * 活动状态：待审核[0] 未通过[1] 已通过[2] 已下线[3]
     */
    private Integer status;

    /**
     * 发布渠道: 大运营[0] 商家[1]
     */
    private Integer publishChannel;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 修改时间
     */
    private Date updateAt;

    /**
     * 是否删除  否[0] 是[1]
     */
    private Boolean isDeleted;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 卡券及商品类的活动规则
     */
    private ActivityGoodsRule activityGoodsRule;

    /**
     * 活动报名开始时间
     */
    private Date enrollStartAt;
    /**
     * 活动报名结束时间
     */
    private Date enrollEndAt;
    /**
     * 活动创建人id
     */
    private String createBy;
    /**
     * 活动关联id
     */
    private String relevanceId;
    /**
     * 活动关联类型
     * 0:表示大运营 1:商场的活动  2:表示店铺 3表示集团 4:表示品牌
     */
    private Integer relevanceType;
    /**
     * 0:取消撤销状态  1:表示申请撤销中状态
     */
    private Integer applyStatus;

    /**
     * '1,1' 第一个1互动屏翻牌购类模版，第二个1微信卡卷类模版
     *  2的话代表转盘抽奖
     */
    private String source;

    /**
     * 卡券活动规则
     */
    private ActivityCouponRule activityCouponRule;

    private List<ActivityEnroll> activityEnrollList;

    private String description;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(Integer publishChannel) {
        this.publishChannel = publishChannel;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ActivityGoodsRule getActivityGoodsRule() {
        return activityGoodsRule;
    }

    public void setActivityGoodsRule(ActivityGoodsRule activityGoodsRule) {
        this.activityGoodsRule = activityGoodsRule;
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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getRelevanceId() {
        return relevanceId;
    }

    public void setRelevanceId(String relevanceId) {
        this.relevanceId = relevanceId;
    }

    public Integer getRelevanceType() {
        return relevanceType;
    }

    public void setRelevanceType(Integer relevanceType) {
        this.relevanceType = relevanceType;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public ActivityCouponRule getActivityCouponRule() {
        return activityCouponRule;
    }

    public void setActivityCouponRule(ActivityCouponRule activityCouponRule) {
        this.activityCouponRule = activityCouponRule;
    }

    public List<ActivityEnroll> getActivityEnrollList() {
        return activityEnrollList;
    }

    public void setActivityEnrollList(List<ActivityEnroll> activityEnrollList) {
        this.activityEnrollList = activityEnrollList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("type", type)
                .append("synTarget", synTarget)
                .append("status", status)
                .append("publishChannel", publishChannel)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("isDeleted", isDeleted)
                .append("version", version)
                .append("activityGoodsRule", activityGoodsRule)
                .append("enrollStartAt", enrollStartAt)
                .append("enrollEndAt", enrollEndAt)
                .append("createBy", createBy)
                .append("relevanceId", relevanceId)
                .append("relevanceType", relevanceType)
                .append("applyStatus", applyStatus)
                .append("activityCouponRule", activityCouponRule)
                .append("activityEnrollList", activityEnrollList)
                .append("source",source)
                .toString();
    }
}
