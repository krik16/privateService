package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 特卖模版列表
 * @author lijing 2015-11-17 16:20
 */
public class TemplateSale implements Serializable{
    /**id*/
    private Integer id;
    /**活动模版id*/
    private Integer activityTemplateId;
    /**banner 图片*/
    private String bannerPic;

    /**0关联商场 1关联店铺*/
    private Byte isMallShop;
    /**true 删除 false不删除*/
    private Boolean isDeleted;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改时间*/
    private Date updateAt;
    /**版本*/
    private Integer version;
    /**
     * 副标题
     */
    private String subTitle;

    /**
     * 分享的标题
     */
    private String shareTitle;
    /**
     * 分享的描述
     */
    private String shareDesc;
    /**
     * 创建人id
     */
    private Integer createBy;

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

    public Byte getIsMallShop() {
        return isMallShop;
    }

    public void setIsMallShop(Byte isMallShop) {
        this.isMallShop = isMallShop;
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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
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

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityTemplateId", activityTemplateId)
                .append("bannerPic", bannerPic)
                .append("isMallShop", isMallShop)
                .append("isDeleted", isDeleted)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("version", version)
                .append("subTitle", subTitle)
                .append("shareTitle", shareTitle)
                .append("shareDesc", shareDesc)
                .append("createBy", createBy)
                .toString();
    }
}