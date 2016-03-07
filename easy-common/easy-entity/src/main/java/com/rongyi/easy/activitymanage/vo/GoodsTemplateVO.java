package com.rongyi.easy.activitymanage.vo;

import com.rongyi.easy.activitymanage.entity.ActivityTemplate;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 卡券极商品类模版vo
 * create by com.rongyi.easy.activitymanage.vo easy-api :author lijing
 * User:lijing
 * DATE : 2016/1/28
 * TIME : 14:06
 * easy-api.
 */
public class GoodsTemplateVO implements Serializable{
    /**
     * 活动的模版id
     */
    private Integer id;
    /**
     *活动的名称
     */
    private String name;
    /**
     * 活动规则id
     */
    private Integer activityRuleId;
    /**
     *活动的开始时间
     */
    private Date startAt;
    /**
     *活动的结束时间
     */
    private Date endAt;
    /**
     * 自定义区域
     */
    private String customLocale;
    /**
     * 限时活动标题
     */
    private String timedActivityTitle;

    /**
     * 规则
     */
    private String activityRule;
    /**
     *活动地址
     */
    private String activityUrl;
    /**
     *活动类型
     */
    private Integer activityType;
    /**
     *模版类型  如果要看类型值 请查看ActivityTemplate类
     */
    private Integer moduleType;
    /**
     *发布渠道
     */
    private Integer publishTerminal;
    /**
     *创建人
     */
    private String createUser;
    /**
     *修改人
     */
    private String updateUser;
    /**
     *创建时间
     */
    private Date createAt;
    /**
     *修改时间
     */
    private Date updateAt;
    /**
     *图片
     */
    private String bannerPic;
    /**
     *labels
     */
    private List<TemplateLabelVO> labels = new ArrayList<TemplateLabelVO>();

    public GoodsTemplateVO(){

    }
    public GoodsTemplateVO(ActivityTemplate activityTemplate){
        if(activityTemplate != null){
            this.id = activityTemplate.getId();
            this.name = activityTemplate.getName();
            this.activityRuleId = activityTemplate.getActivityRuleId();
            this.startAt = activityTemplate.getStartAt();
            this.endAt = activityTemplate.getEndAt();
            this.activityType = activityTemplate.getActivityType();
            this.moduleType = activityTemplate.getModuleType();
            this.publishTerminal = (int)activityTemplate.getPublishTerminal();
            this.createAt = activityTemplate.getCreateAt();
            this.updateAt = activityTemplate.getUpdateAt();
            this.createUser = activityTemplate.getCreateUser();
            this.updateUser = activityTemplate.getUpdateUser();
            this.activityUrl = activityTemplate.getActivityUrl();

            if(activityTemplate.getTemplateCouponGood() != null){
                this.customLocale = activityTemplate.getTemplateCouponGood().getCustomLocale();
                this.timedActivityTitle = activityTemplate.getTemplateCouponGood().getTimedActivityTitle();
                this.bannerPic = activityTemplate.getTemplateCouponGood().getBannerPic();
                this.activityRule = activityTemplate.getTemplateCouponGood().getActivityRule();
            }
        }
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

    public Integer getActivityRuleId() {
        return activityRuleId;
    }

    public void setActivityRuleId(Integer activityRuleId) {
        this.activityRuleId = activityRuleId;
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

    public String getCustomLocale() {
        return customLocale;
    }

    public void setCustomLocale(String customLocale) {
        this.customLocale = customLocale;
    }

    public String getTimedActivityTitle() {
        return timedActivityTitle;
    }

    public void setTimedActivityTitle(String timedActivityTitle) {
        this.timedActivityTitle = timedActivityTitle;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public Integer getPublishTerminal() {
        return publishTerminal;
    }

    public void setPublishTerminal(Integer publishTerminal) {
        this.publishTerminal = publishTerminal;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getBannerPic() {
        return bannerPic;
    }

    public void setBannerPic(String bannerPic) {
        this.bannerPic = bannerPic;
    }

    public List<TemplateLabelVO> getLabels() {
        return labels;
    }

    public void setLabels(List<TemplateLabelVO> labels) {
        this.labels = labels;
    }

    public String getActivityRule() {
        return activityRule;
    }

    public void setActivityRule(String activityRule) {
        this.activityRule = activityRule;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("activityRuleId", activityRuleId)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("customLocale", customLocale)
                .append("timedActivityTitle", timedActivityTitle)
                .append("activityRule", activityRule)
                .append("activityUrl", activityUrl)
                .append("activityType", activityType)
                .append("moduleType", moduleType)
                .append("publishTerminal", publishTerminal)
                .append("createUser", createUser)
                .append("updateUser", updateUser)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("bannerPic", bannerPic)
                .append("labels", labels)
                .toString();
    }
}
