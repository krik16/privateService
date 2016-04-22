package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

import java.io.Serializable;

/**
 * Created by lijing on 2015/12/26 15:58
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class BenefitListVO implements Serializable {
    private Integer id;
    private Integer templateImageWidth;
    private Integer templateImageHeight;
    private String benefitPic;
    private String provId;
    private String cityId;
    private Integer type;
    private String  typeVal;
    private String publishBeginAt;
    private String publishEndAt;
    private String title;
    private String subtitle;
    private String templateImagePixel;

    private String shareTitle;//分享标题
    private String shareContent;//分享内容
    private String sharePic;//分享图片
    private String appTitle;//页面标题

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemplateImageWidth() {
        return templateImageWidth;
    }

    public void setTemplateImageWidth(Integer templateImageWidth) {
        this.templateImageWidth = templateImageWidth;
    }

    public Integer getTemplateImageHeight() {
        return templateImageHeight;
    }

    public void setTemplateImageHeight(Integer templateImageHeight) {
        this.templateImageHeight = templateImageHeight;
    }

    public String getBenefitPic() {
        return benefitPic;
    }

    public void setBenefitPic(String benefitPic) {
        this.benefitPic = benefitPic;
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

    public String getTemplateImagePixel() {
        return templateImagePixel;
    }

    public void setTemplateImagePixel(String templateImagePixel) {
        this.templateImagePixel = templateImagePixel;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareContent() {
        return shareContent;
    }

    public void setShareContent(String shareContent) {
        this.shareContent = shareContent;
    }

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    public String getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("templateImageWidth", templateImageWidth)
                .append("templateImageHeight", templateImageHeight)
                .append("benefitPic", benefitPic)
                .append("provId", provId)
                .append("cityId", cityId)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("publishBeginAt", publishBeginAt)
                .append("publishEndAt", publishEndAt)
                .append("title", title)
                .append("subtitle", subtitle)
                .append("templateImagePixel", templateImagePixel)
                .append("shareTitle", shareTitle)
                .append("shareContent", shareContent)
                .append("sharePic", sharePic)
                .append("appTitle", appTitle)
                .toString();
    }
}
