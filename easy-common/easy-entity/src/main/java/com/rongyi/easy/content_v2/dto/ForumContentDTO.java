package com.rongyi.easy.content_v2.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 内容管理中的内容信息的新增修改操作对象
 * @author lqy
 * @time 2015-09-16
 */
public class ForumContentDTO implements Serializable {
    /**
     * 内容Id
     */
    private Integer id;

    /**
     * 城市Id
     */
    private String cityId;

    /**
     * 城市的名字
     */
    private String cityName;

    /**
     * 省份的Id
     */
    private String provId;

    /**
     * 省份的名字
     */
    private String provName;

    /**
     * banner 背景图片
     */
    private String bannerBackgroundPic;

    /**
     * 上传的图片名字
     */
    private String picName;

    /**
     * 标题
     */
    private String title;

    /**
     * 模版Id
     */
    private Integer modelId;

    /**
     * 类型1.代表商场,2.店铺、3.品牌、4.商品、5.代金券、6.活动、7.文章、8.同城、9.优惠、10.外链
     */
    private Integer type;

    /**
     * 类型值
     */
    private String typeVal;

    /**
     * 发布开始时间
     */
    private String publishBeginAt;

    /**
     * 发布结束时间
     */
    private String publishEndAt;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 记录状态 0待发布、1已发布、2已关闭
     */
    private Integer status;

    /**
     * 位置Id
     */
    private Integer positionId;

    /**
     * app 标题
     */
    private String appTitle;
    /**
     * 分享标题
     */
    private String shareContent;
    /**
     * 分享内容
     */
    private String shareTitle;
    /**
     * 分享图片
     */
    private String sharePic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getBannerBackgroundPic() {
        return bannerBackgroundPic;
    }

    public void setBannerBackgroundPic(String bannerBackgroundPic) {
        this.bannerBackgroundPic = bannerBackgroundPic;
    }

    public String getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public String getShareContent() {
        return shareContent;
    }

    public void setShareContent(String shareContent) {
        this.shareContent = shareContent;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("cityId", cityId)
                .append("cityName", cityName)
                .append("provId", provId)
                .append("provName", provName)
                .append("bannerBackgroundPic", bannerBackgroundPic)
                .append("picName", picName)
                .append("title", title)
                .append("modelId", modelId)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("publishBeginAt", publishBeginAt)
                .append("publishEndAt", publishEndAt)
                .append("createUser", createUser)
                .append("updateUser", updateUser)
                .append("status", status)
                .append("positionId", positionId)
                .append("appTitle", appTitle)
                .append("shareContent", shareContent)
                .append("shareTitle", shareTitle)
                .append("sharePic", sharePic)
                .toString();
    }
}