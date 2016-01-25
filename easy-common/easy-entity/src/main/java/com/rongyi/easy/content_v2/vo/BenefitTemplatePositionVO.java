package com.rongyi.easy.content_v2.vo;

import com.rongyi.easy.malllife.common.util.DateTool;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lijing on 2015/12/24 1:12
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class BenefitTemplatePositionVO implements Serializable{
    private Integer id;

    private Integer homepageId;

    private String name;

    private Integer templateId;

    private String templateImageFormat;

    private String templateImagePixel;

    private Integer templateImageSize;

    private String updateUser;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHomepageId() {
        return homepageId;
    }

    public void setHomepageId(Integer homepageId) {
        this.homepageId = homepageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getTemplateImageFormat() {
        return templateImageFormat;
    }

    public void setTemplateImageFormat(String templateImageFormat) {
        this.templateImageFormat = templateImageFormat;
    }

    public String getTemplateImagePixel() {
        return templateImagePixel;
    }

    public void setTemplateImagePixel(String templateImagePixel) {
        this.templateImagePixel = templateImagePixel;
    }

    public Integer getTemplateImageSize() {
        return templateImageSize;
    }

    public void setTemplateImageSize(Integer templateImageSize) {
        this.templateImageSize = templateImageSize;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateAt() {
        return DateTool.date2String(this.updateAt,DateTool.FORMAT_DATETIME);
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("homepageId", homepageId)
                .append("name", name)
                .append("templateId", templateId)
                .append("templateImageFormat", templateImageFormat)
                .append("templateImagePixel", templateImagePixel)
                .append("templateImageSize", templateImageSize)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .toString();
    }
}
