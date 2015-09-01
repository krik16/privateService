package com.rongyi.easy.contentnew.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 这是内容管理中的内容实体
 * @author lijing
 * @time 2015-08-28
 */
public class ForumContent implements Serializable{
	/** 主键id*/
    private Integer id;
    /**位置id */
    private Integer positionId;
    /**省份的id*/
    private String provId;
    /**身份的名字*/
    private String provName;
    /**城市的id*/
    private String cityId;
    /**城市的名字*/
    private String cityName;
    /**存放图片的全路径*/
    private String picUrls;
    /**内容管理的详情的标题*/
    private String title;
    /**活动的子标题*/
    private String subtitle;
    /**模版id*/
    private Integer modelId;
    public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	/**模版类型的名字  V1代表banner V2代表快捷入口   V3代表热点头条   V4代表卡卷推荐 V5代表活动推荐    V6代表明星店铺 */
    private String modelName;
    /**类型，如果模版类型为V1时 1.代表商场,2.店铺、3.品牌、4.商品、5.代金券、6.活动、7.文章、8.同城、9.优惠、10.外链（使用type_url字段）如果模版类型为V3时 1.代表商场,2.店铺、3.品牌、4.商品、5.代金券、6.活动、7.文章、8.同城、9.优惠、10.外链（使用type_url字段）如果模版类型为V4时 1.代表代金券、2.抵扣券如果模版类型为V5时 1.内链活动ID、2.外链活动（使用type_url字段）*/
    private Integer type;
    /**id值 对应的是上面类型所对应的id      如类型为商场 则id是商场的id*/
    private String typeId;

    /**外链的地址*/
    private String typeUrl;
    /**店铺ids*/
    private String shopIds;
    /**发布开始时间*/
    private Date publishBeginAt;
    /**发布结束时间*/
    private Date publishEndAt;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改人*/
    private String updateUser;
    /**修改时间*/
    private Date updateAt;
    /**是否已经删除  true表示删除 flase 表示没有删除*/
    private boolean isDeleted;
    /**记录状态 0待发布、1已发布、2已关闭*/
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

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeUrl() {
        return typeUrl;
    }

    public void setTypeUrl(String typeUrl) {
        this.typeUrl = typeUrl;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    
    
}