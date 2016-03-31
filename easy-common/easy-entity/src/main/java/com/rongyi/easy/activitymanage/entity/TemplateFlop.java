package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 翻牌购的（抽奖累） 活动模版
 * @author lijing 2015-11-17 15:45
 */
public class TemplateFlop implements Serializable{
    /**id*/
    private Integer id;
    /**活动模版id*/
    private Integer activityTemplateId;
    /**翻牌张数  4张  6张   9张*/
    private Byte flopCount;
    /**banner图片*/
    private String bannerPic;
    /**false没有奖品  true 有奖品*/
    private Boolean isPrizes;
    /**中奖图片*/
    private String winPics;
    /**没有中奖图片*/
    private String losePics;
    /**背景图片*/
    private String backgroundPic;
    /**未开启奖品图片*/
    private String backprizePic;
    /**活动规则文案*/
    private String ruleDesc;
    /**false没有删除   true 是删除*/
    private Boolean isDeleted;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改时间*/
    private Date updateAt;
    /**版本*/
    private Integer version;

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

    public Byte getFlopCount() {
        return flopCount;
    }

    public void setFlopCount(Byte flopCount) {
        this.flopCount = flopCount;
    }

    public String getBannerPic() {
        return bannerPic;
    }

    public void setBannerPic(String bannerPic) {
        this.bannerPic = bannerPic;
    }

    public Boolean getIsPrizes() {
        return isPrizes;
    }

    public void setIsPrizes(Boolean isPrizes) {
        this.isPrizes = isPrizes;
    }

    public String getWinPics() {
        return winPics;
    }

    public void setWinPics(String winPics) {
        this.winPics = winPics;
    }

    public String getLosePics() {
        return losePics;
    }

    public void setLosePics(String losePics) {
        this.losePics = losePics;
    }

    public String getBackgroundPic() {
        return backgroundPic;
    }

    public void setBackgroundPic(String backgroundPic) {
        this.backgroundPic = backgroundPic;
    }

    public String getBackprizePic() {
        return backprizePic;
    }

    public void setBackprizePic(String backprizePic) {
        this.backprizePic = backprizePic;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityTemplateId", activityTemplateId)
                .append("flopCount", flopCount)
                .append("bannerPic", bannerPic)
                .append("isPrizes", isPrizes)
                .append("winPics", winPics)
                .append("losePics", losePics)
                .append("backgroundPic", backgroundPic)
                .append("backprizePic", backprizePic)
                .append("ruleDesc", ruleDesc)
                .append("isDeleted", isDeleted)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("version", version)
                .toString();
    }
}