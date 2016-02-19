package com.rongyi.easy.activitymanage.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * create by com.rongyi.easy.activitymanage.vo ideaworkspace :author lijing
 * 限时秒杀vo
 * User:lijing
 * DATE : 2016/2/19
 * TIME : 14:07
 * ideaworkspace.
 */
public class SeckillVO implements Serializable{
    /**
     * 活动id
     */
    private Integer id;
    /**
     *活动规则id
     */
    private Integer activityRuleId;
    /**
     *活动名称
     */
    private String name;
    /**
     *banner图片
     */
    private String bannerPic;
    /**
     *用于限时活动主题
     */
    private String timedActivityTitle;
    /**
     *当前服务器时间
     */
    private Date nowTime = new Date();
    /**
     *活动规则
     */
    private String activityRule;
    /**
     *labe集合
     */
    private List<SeckillLabelVO> labels=new ArrayList<SeckillLabelVO>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityRuleId() {
        return activityRuleId;
    }

    public void setActivityRuleId(Integer activityRuleId) {
        this.activityRuleId = activityRuleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBannerPic() {
        return bannerPic;
    }

    public void setBannerPic(String bannerPic) {
        this.bannerPic = bannerPic;
    }

    public String getTimedActivityTitle() {
        return timedActivityTitle;
    }

    public void setTimedActivityTitle(String timedActivityTitle) {
        this.timedActivityTitle = timedActivityTitle;
    }

    public Date getNowTime() {
        return nowTime;
    }

    public void setNowTime(Date nowTime) {
        this.nowTime = nowTime;
    }

    public String getActivityRule() {
        return activityRule;
    }

    public void setActivityRule(String activityRule) {
        this.activityRule = activityRule;
    }

    public List<SeckillLabelVO> getLabels() {
        return labels;
    }

    public void setLabels(List<SeckillLabelVO> labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityRuleId", activityRuleId)
                .append("name", name)
                .append("bannerPic", bannerPic)
                .append("timedActivityTitle", timedActivityTitle)
                .append("nowTime", nowTime)
                .append("activityRule", activityRule)
                .append("labels", labels)
                .toString();
    }
}
