package com.rongyi.easy.content_v2.param;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

import java.io.Serializable;

/**
 * Created by WUH
 * on 2017/1/4.
 * 断码好货请求参数
 */
public class ShortSizeParam extends MalllifeBaseParam implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String title;
    private String picUrl;
    private Integer typeVal;
    private Integer status;
    private String publishBeginAt;
    private String  publishEndAt;
    private Integer homePageId;
    private String userName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getHomePageId() {
        return homePageId;
    }

    public void setHomePageId(Integer homePageId) {
        this.homePageId = homePageId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(Integer typeVal) {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ShortSizeParam{" +
                "id=" + id +
                ", picUrl='" + picUrl + '\'' +
                ", typeVal=" + typeVal +
                ", publishBeginAt='" + publishBeginAt + '\'' +
                ", publishEndAt='" + publishEndAt + '\'' +
                ", userName='" + userName + '\'' +
                ", status='" + status + '\'' +
                ", homePageId='" + homePageId + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
