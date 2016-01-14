package com.rongyi.easy.content_v2.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 内容模版 （爆抢福利）
 * lijing
 * 2015 12 21
 */
public class ForumTemplate implements Serializable {
   /**id*/
    private Integer id;
    /**首页id*/
    private Integer homepageId;
    /**图片*/
    private String pic;
    /**主标题*/
    private String title;
    /**模版标题*/
    private String name;
    /**宽度*/
    private Integer templateWidth;
    /**行数*/
    private Integer templateCol;
    /**副标题*/
    private String subtitle;
    /**类型*/
    private Integer type;
    /**值*/
    private String typeVal;
    /**状态  0 正常*/
    private Boolean status;
    /**创件人*/
    private String createUser;
    /***/
    private Date createAt;
    /***/
    private String updateUser;
    /***/
    private Date updateAt;
    /***/
    private Integer version;
    /**.false表示没有删除*/
    private Boolean isDeleted;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTemplateWidth() {
        return templateWidth;
    }

    public void setTemplateWidth(Integer templateWidth) {
        this.templateWidth = templateWidth;
    }

    public Integer getTemplateCol() {
        return templateCol;
    }

    public void setTemplateCol(Integer templateCol) {
        this.templateCol = templateCol;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("homepageId", homepageId)
                .append("pic", pic)
                .append("title", title)
                .append("name", name)
                .append("templateWidth", templateWidth)
                .append("templateCol", templateCol)
                .append("subtitle", subtitle)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("status", status)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("version", version)
                .append("isDeleted", isDeleted)
                .toString();
    }
}