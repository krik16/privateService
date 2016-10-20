package com.rongyi.easy.activitymanage.param;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xuying on 2016/10/17.
 */
public class PingtuanActivityVo implements Serializable{

    private Integer activityId;

    private Integer pintuanConfigId;

    private String name;

    private Date startAt;

    private Date endAt;

    private String description;//活动说明

    private String pic;//活动图片

    private Integer activeTime;//成团有效时间，单位:小时

    private Integer cancelTime;//订单取消时间，超过多少时间订单自动取消,单位：分钟

    private Integer forceAttention;//是否需要强制关注  否[0] 是[1]

    private String shareTitle;//分享标题

    private String shareDesc; //分享描述

    private String sharePic;

    private String mallId;//商场id

    private  ActivityGoodsDetail activityGoodsDetail;

    public ActivityGoodsDetail getActivityGoodsDetail() {
        return activityGoodsDetail;
    }

    public void setActivityGoodsDetail(ActivityGoodsDetail activityGoodsDetail) {
        this.activityGoodsDetail = activityGoodsDetail;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getPintuanConfigId() {
        return pintuanConfigId;
    }

    public void setPintuanConfigId(Integer pintuanConfigId) {
        this.pintuanConfigId = pintuanConfigId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Integer activeTime) {
        this.activeTime = activeTime;
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getForceAttention() {
        return forceAttention;
    }

    public void setForceAttention(Integer forceAttention) {
        this.forceAttention = forceAttention;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }
}
