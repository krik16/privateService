package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;

/**
 * Created by WUH on 2017/1/4.
 * 断码好货详情VO
 */
public class ShortSizeVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer typeVal;
    private String title;       //标题
    private String picUrl;    //头图
    private String bannerUrl; //banner图
    private String introduction; //介绍文案
    private String publishBeginAt;
    private String publishEndAt;
    private String crateAt;
    private int status;
    private int stick;
    private String createUser;
    private String updateUser;
    private String updateAt;

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCrateAt() {
        return crateAt;
    }

    public void setCrateAt(String crateAt) {
        this.crateAt = crateAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStick() {
        return stick;
    }

    public void setStick(int stick) {
        this.stick = stick;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(Integer typeVal) {
        this.typeVal = typeVal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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
        return "ShortSizeVO{" +
                "id=" + id +
                ", typeVal=" + typeVal +
                ", title='" + title + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", bannerUrl=" + bannerUrl +
                ", introduction='" + introduction + '\'' +
                ", publishBeginAt='" + publishBeginAt + '\'' +
                ", publishEndAt='" + publishEndAt + '\'' +
                ", status=" + status +
                ", stick=" + stick +
                ", crateAt=" + crateAt +
                ", createUser=" + createUser +
                ", updateUser=" + updateUser +
                ", updateAt=" + updateAt +
                '}';
    }
}
