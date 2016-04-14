package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create by com.rongyi.easy.content_v2.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/4/8
 * TIME : 18:14
 * ideaworkspace.
 */
public class ActivityContentListVO implements Serializable{
    private Integer id;
    private String title;
    private String bannerPic;
    private Integer type;
    private String typeVal;
    /**活动url*/
    private String activityUrl;
    private String shareTitle;
    private String shareDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBannerPic() {
        return bannerPic;
    }

    public void setBannerPic(String bannerPic) {
        this.bannerPic = bannerPic;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(String typeVal) {
        this.typeVal = typeVal;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("bannerPic", bannerPic)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("activityUrl", activityUrl)
                .append("shareTitle", shareTitle)
                .append("shareDesc", shareDesc)
                .toString();
    }
}
