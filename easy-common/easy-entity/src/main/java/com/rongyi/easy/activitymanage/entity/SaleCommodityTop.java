package com.rongyi.easy.activitymanage.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

public class SaleCommodityTop implements Serializable {

    /**主键id**/
    private Integer id;
   /**活动特卖的id**/
    private Integer activityTemplateId;
   /**商品id**/
    private String commodityId;
   /**商品排序**/
    private Integer orderPosition;
    /**false 表示没有删除  true 表示删除*/
    private Boolean isDeleted;
   /**创建人**/
    private String createUser;
   /**创建时间**/
    private Date createAt;
   /**修改时间**/
    private Date updateAt;
   /**乐观锁版本**/
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityTemplateId() {
        return activityTemplateId;
    }

    public void setActivityTemplateId(Integer activityTemplateId) {
        this.activityTemplateId = activityTemplateId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getOrderPosition() {
        return orderPosition;
    }

    public void setOrderPosition(Integer orderPosition) {
        this.orderPosition = orderPosition;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("activityTemplateId", activityTemplateId)
                .append("commodityId", commodityId)
                .append("orderPosition", orderPosition)
                .append("isDeleted", isDeleted)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateAt", updateAt)
                .append("version", version)
                .toString();
    }
}