package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 活动商品
 */
public class ActivityGoods implements Serializable {
    /**
     * PK
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 类型 0代表红包，1代表代金券，2代表抵扣券 3代表商品
     */
    private Integer type;

    /**
     * 商品/卡券名称
     */
    private String name;

    /**
     * 商品/卡券图片url
     */
    private String picUrl;

    /**
     * 单商品补贴方式 金额元[0] 百分比[1]
     */
    private Integer subsidyType;

    /**
     * subsidy_type = 0单商品补贴金额（分），subsidy_type=1时单品补贴百分比的数字，例如单品补贴10%，存入10
     */
    private Integer subsidyPrice;

    /**
     * 参与开始时间
     */
    private Date joinStartAt;

    /**
     * 参与结束时间
     */
    private Date joinEndAt;

    /**
     * 商品审核状态：待审核[0] 未通过[1] 已通过[2]
     */
    private Integer status;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 修改时间
     */
    private Date updateAt;

    /**
     * 是否删除: 默认否[0], 是[1]
     */
    private Boolean isDeleted;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 商品规格
     */
    private List<ActivityGoodsSpec>  activityGoodsSpecs;

    /**
     * 商品分类
     */
    private List<ActivityGoodsCategory> activityGoodsCategories;

    /**
     * 获取商品分类的层级信息
     * @return 餐饮 > 西餐 > 牛排
     */
    public String getCategoryString() {
        String categoryStr = "";
        if (CollectionUtils.isNotEmpty(activityGoodsCategories)) {
            List<String> categoryList = new ArrayList<>();
            for (ActivityGoodsCategory goodsCategory : activityGoodsCategories) {
                categoryList.add(goodsCategory.getCategoryName());
            }
            categoryStr = StringUtils.join(categoryList, " > ");
        }
        return categoryStr;
    }

    public ActivityGoods(int type){
		this.type=type;
	}

    public ActivityGoods() {
    }

    public ActivityGoods(String goodsId){
		this.goodsId=goodsId;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getSubsidyType() {
        return subsidyType;
    }

    public void setSubsidyType(Integer subsidyType) {
        this.subsidyType = subsidyType;
    }

    public Integer getSubsidyPrice() {
        return subsidyPrice;
    }

    public void setSubsidyPrice(Integer subsidyPrice) {
        this.subsidyPrice = subsidyPrice;
    }

    public Date getJoinStartAt() {
        return joinStartAt;
    }

    public void setJoinStartAt(Date joinStartAt) {
        this.joinStartAt = joinStartAt;
    }

    public Date getJoinEndAt() {
        return joinEndAt;
    }

    public void setJoinEndAt(Date joinEndAt) {
        this.joinEndAt = joinEndAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<ActivityGoodsSpec> getActivityGoodsSpecs() {
        return activityGoodsSpecs;
    }

    public void setActivityGoodsSpecs(List<ActivityGoodsSpec> activityGoodsSpecs) {
        this.activityGoodsSpecs = activityGoodsSpecs;
    }

    public List<ActivityGoodsCategory> getActivityGoodsCategories() {
        return activityGoodsCategories;
    }

    public void setActivityGoodsCategories(List<ActivityGoodsCategory> activityGoodsCategories) {
        this.activityGoodsCategories = activityGoodsCategories;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("goodsId", goodsId)
                .append("type", type)
                .append("name", name)
                .append("picUrl", picUrl)
                .append("subsidyType", subsidyType)
                .append("subsidyPrice", subsidyPrice)
                .append("joinStartAt", joinStartAt)
                .append("joinEndAt", joinEndAt)
                .append("status", status)
                .append("createUser", createUser)
                .append("updateUser", updateUser)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("isDeleted", isDeleted)
                .append("version", version)
                .append("activityGoodsSpecs", activityGoodsSpecs)
                .append("activityGoodsCategories", activityGoodsCategories)
                .toString();
    }
}