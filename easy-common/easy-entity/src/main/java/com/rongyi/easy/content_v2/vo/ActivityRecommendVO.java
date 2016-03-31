package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 容易逛首页-活动推荐
 * Created by Breggor on 2015/9/10.
 */
public class ActivityRecommendVO implements Serializable {

    private String title; //活动主题
    private String subtitle; //活动副主题
    private String activityPic;//活动图
    private String provId; //省份Id
    private String cityId; //城市Id
    private int type;  //内(外)链类型
    private String typeVal; //内外链URL
    private String publishBeginAt; //发布开始时间
    private String publishEndAt;//发布结束时间

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getActivityPic() {
        return activityPic;
    }

    public void setActivityPic(String activityPic) {
        this.activityPic = activityPic;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(String typeVal) {
        this.typeVal = typeVal;
    }

    public String getPublishBeginAt() {
        return publishBeginAt;
    }

    public void setPublishBeginAt(String publishBeginAt) {
        this.publishBeginAt = publishBeginAt;
    }

    public String getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(String publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("title", title)
                .append("subtitle", subtitle)
                .append("activityPic", activityPic)
                .append("provId", provId)
                .append("cityId", cityId)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("publishBeginAt", publishBeginAt)
                .append("publishEndAt", publishEndAt)
                .toString();
    }
}
