package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

import java.io.Serializable;
import java.util.Date;

/**
 * 卡券商品模版信息表
 * @author  lijing 2015-11-17 15:33
 */
public class TemplateCouponGood implements Serializable {
    /**id*/
    private Integer id;
   /**活动模版id*/
    private Integer activityTemplateId;
   /**banner图片*/
    private String bannerPic;
   /**用于限时活动的主题*/
    private String timedActivityTitle;
   /**用于闪购的副标题*/
    private String subtitle;
   /**false表示没有删除   true表示删除了*/
    private Boolean isDeleted;
    /**
     * 活动规则
     */
    private String activityRule;
   /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
   /**修改时间*/
    private Date updateAt;
   /**版本*/
    private Integer version;
   /**自定义*/
    private String customLocale;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityTemplateId() {
        return activityTemplateId;
    }

    public void setActivityTemplateId(Integer activityTemplateId) {
        this.activityTemplateId = activityTemplateId;
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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCustomLocale() {
        return customLocale;
    }

    public void setCustomLocale(String customLocale) {
        this.customLocale = customLocale;
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
                .append("activityTemplateId", activityTemplateId)
                .append("bannerPic", bannerPic)
                .append("timedActivityTitle", timedActivityTitle)
                .append("subtitle", subtitle)
                .append("isDeleted", isDeleted)
                .append("activityRule", activityRule)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("version", version)
                .append("customLocale", customLocale)
                .toString();
    }
}