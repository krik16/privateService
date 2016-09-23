package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 商品分类点击记录
 */
@Entity(value = "mcmc_commodity_category_history", noClassnameStored = true)
public class CommodityCategoryHistory implements Serializable {

    private static final long serialVersionUID = -3491400779856182500L;

    // id
    @Id
    private ObjectId id;
    // 商品分类Id
    private String commodityCategoryId;
    // 点击次数
    private int hitCount;
    // 用户Id
    private String userId;
    // 结果总数
    private int totalCount;
    // 创建时间
    private Date updateAt;
    // 更新时间
    private Date createAt;
    // 分类级别（同mcmc_commodity_category.type)
    private int type;

    public String getCommodityCategoryId() {
        return commodityCategoryId;
    }

    public void setCommodityCategoryId(String commodityCategoryId) {
        this.commodityCategoryId = commodityCategoryId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CommodityCategoryHistory{" +
                "commodityCategoryId='" + commodityCategoryId + '\'' +
                ", id=" + id +
                ", hitCount=" + hitCount +
                ", userId='" + userId + '\'' +
                ", totalCount=" + totalCount +
                ", updateAt=" + updateAt +
                ", createAt=" + createAt +
                ", type=" + type +
                '}';
    }
}
