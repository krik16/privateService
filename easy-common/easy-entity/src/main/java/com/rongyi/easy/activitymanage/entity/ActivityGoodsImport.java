package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动导入商品错误记录
 */
public class ActivityGoodsImport implements Serializable {

    private Integer id;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 商品和卡券id
     */
    private String goodsId;

    /**
     * 商品类型
     */
    private String type;

    /**
     * 失败原因
     */
    private String failureCause;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 版本号
     */
    private String version;

    public ActivityGoodsImport(Integer activityId, String goodsId, String type, String failureCause, String createUser, Date createAt, String version) {
        this.activityId = activityId;
        this.goodsId = goodsId;
        this.type = type;
        this.failureCause = failureCause;
        this.createUser = createUser;
        this.createAt = createAt;
        this.version = version;
    }

    public ActivityGoodsImport() {

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFailureCause() {
        return failureCause;
    }

    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityId", activityId)
                .append("goodsId", goodsId)
                .append("type", type)
                .append("failureCause", failureCause)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("version", version)
                .toString();
    }
}