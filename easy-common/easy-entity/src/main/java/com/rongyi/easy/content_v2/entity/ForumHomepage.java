package com.rongyi.easy.content_v2.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是内容管理的主页
 *
 * @author lijing
 * @time 2015 08 31
 */
public class ForumHomepage implements Serializable {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 内容标题
     */
    private String title;

    /**
     * 首页板块码（必须唯一）
     */
    private String forumCode;

    /**
     * 状态 0代表启用，1代表关闭
     */
    private Integer status;
    /**
     * 顺序（位置） 从1开始
     */
    private Integer sortIdx;
    /**
     * 图片的格式 如png jpg 如果有多个 用;隔开
     */
    private String imageFormat;
    /**
     * 图片像素大小的限制 如 500*500
     */
    private String imagePixel;
    /**
     * 图片大小的显示 如 30   以K为单位
     */
    private Integer imageSize;
    /**
     * 子模版个数
     */
    private Integer positionCount;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 创建时间
     */
    private Date createAt;
    /**
     * 修改人
     */
    private String updateUser;
    /**
     * 修改时间
     */
    private Date updateAt;


    /**
     * 是否已经删除  true表示删除 flase 表示没有删除
     */
    private boolean isDeleted;

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

    public String getForumCode() {
        return forumCode;
    }

    public void setForumCode(String forumCode) {
        this.forumCode = forumCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortIdx() {
        return sortIdx;
    }

    public void setSortIdx(Integer sortIdx) {
        this.sortIdx = sortIdx;
    }

    public String getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    public String getImagePixel() {
        return imagePixel;
    }

    public void setImagePixel(String imagePixel) {
        this.imagePixel = imagePixel;
    }

    public Integer getImageSize() {
        return imageSize;
    }

    public void setImageSize(Integer imageSize) {
        this.imageSize = imageSize;
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

    public Integer getPositionCount() {
        return positionCount;
    }

    public void setPositionCount(Integer positionCount) {
        this.positionCount = positionCount;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("forumCode", forumCode)
                .append("status", status)
                .append("sortIdx", sortIdx)
                .append("imageFormat", imageFormat)
                .append("imagePixel", imagePixel)
                .append("imageSize", imageSize)
                .append("positionCount", positionCount)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("isDeleted", isDeleted)
                .toString();
    }
}