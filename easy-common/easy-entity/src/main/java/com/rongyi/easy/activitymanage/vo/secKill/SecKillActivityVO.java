package com.rongyi.easy.activitymanage.vo.secKill;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * 秒杀活动列表
 * @author chenjun
 * @date 2017/5/2 10:41
 */
public class SecKillActivityVO implements Serializable{

    private static final long serialVersionUID = -5409159193112132863L;

    private Integer activityId;//活动id
    private String activityName;//活动名称
    private Integer activityStatus;//1:未开始，2：进行中，3：活动已结束
    private String relevanceId;//活动属于什么类型人创建的关联id 如商场id，店铺id，品牌
    private Integer relevanceType;//0:表示大运营 1:商场的活动 2:表示店铺 3表示集团 4:表示品牌
    private String activityTitle;//活动标题
    private String activitySubTitle;//活动副标题
    private Integer activitySubType;//秒杀类型：1单场次，2多场次
    private Integer cancelTime;//订单取消时间，超过多少时间订单自动取消,单位：分钟
    private long startAt;//活动开始时间
    private long endAt;//活动结束时间
    private String shareTitle;//分享标题
    private String sharePic;//分享图片
    private String shareDesc;//分享描述
    private List<SecKillPic> pics;//秒杀轮播图
    private Integer type;//活动类型 7秒杀 8普通拼团,9电商版拼团，10教育版拼团 11 微信秒杀
    private List<SecKillActivitySessionVO> activitySessions;//秒杀活动场次

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
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

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivitySubTitle() {
        return activitySubTitle;
    }

    public void setActivitySubTitle(String activitySubTitle) {
        this.activitySubTitle = activitySubTitle;
    }

    public Integer getActivitySubType() {
        return activitySubType;
    }

    public void setActivitySubType(Integer activitySubType) {
        this.activitySubType = activitySubType;
    }

    public long getStartAt() {
        return startAt;
    }

    public void setStartAt(long startAt) {
        this.startAt = startAt;
    }

    public long getEndAt() {
        return endAt;
    }

    public void setEndAt(long endAt) {
        this.endAt = endAt;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    public List<SecKillPic> getPics() {
        return pics;
    }

    public void setPics(List<SecKillPic> pics) {
        this.pics = pics;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<SecKillActivitySessionVO> getActivitySessions() {
        return activitySessions;
    }

    public void setActivitySessions(List<SecKillActivitySessionVO> activitySessions) {
        this.activitySessions = activitySessions;
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
