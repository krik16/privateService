package com.rongyi.easy.content_v2.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是内容管理中的内容实体
 *
 * @author lijing
 * @time 2015-08-28
 */
public class ForumContent implements Serializable {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 位置id
     */
    private Integer positionId;
    /**
     * 省份的id
     */
    private String provId;
    /**
     * 身份的名字
     */
    private String provName;
    /**
     * 城市的id
     */
    private String cityId;
    /**
     * 城市的名字
     */
    private String cityName;
    /**
     * 存放图片的全路径
     */
    private String picUrls;
    /**
     * 内容管理的详情的标题
     */
    private String title;
    /**
     * 活动的子标题
     */
    private String subtitle;
    /**
     * 类型，	1.代表商场,2.店铺、3.品牌、4.商品、5.代金券、6.内链活动、7.文章、8.优惠、9.外链活动、10.抵扣卷 ,  11.商品推荐 （临时的）
     */
    private Integer type;
    /**
     * id值 对应的是上面类型所对应的id      如类型为商场 则id是商场的id
     */
    private String typeVal;

    /**
     * 店铺ids
     */
    private String shopIds;
    /**
     * 发布开始时间
     */
    private Date publishBeginAt;
    /**
     * 发布结束时间
     */
    private Date publishEndAt;
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
    /**
     * 记录状态 0待发布、1已发布、2已关闭
     */
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
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

    public String getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
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

    public String getShopIds() {
        return shopIds;
    }

    public void setShopIds(String shopIds) {
        this.shopIds = shopIds;
    }

    public Date getPublishBeginAt() {
        return publishBeginAt;
    }

    public void setPublishBeginAt(Date publishBeginAt) {
        this.publishBeginAt = publishBeginAt;
    }

    public Date getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(Date publishEndAt) {
        this.publishEndAt = publishEndAt;
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

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("positionId", positionId)
                .append("provId", provId)
                .append("provName", provName)
                .append("cityId", cityId)
                .append("cityName", cityName)
                .append("picUrls", picUrls)
                .append("title", title)
                .append("subtitle", subtitle)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("shopIds", shopIds)
                .append("publishBeginAt", publishBeginAt)
                .append("publishEndAt", publishEndAt)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("isDeleted", isDeleted)
                .append("status", status)
                .toString();
    }
}