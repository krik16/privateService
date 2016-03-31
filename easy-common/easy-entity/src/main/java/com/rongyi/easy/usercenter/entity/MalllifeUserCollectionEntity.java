package com.rongyi.easy.usercenter.entity;

import java.io.Serializable;
import java.util.Date;

public class MalllifeUserCollectionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /** 自增主键 */
    private Integer id;

    /** 主键，可重复 */
    private String userId;

    /** 商品编号id */
    private String collectionId;

    /** 是否禁用0收藏 1取消收藏 */
    private Integer isDisable;

    /** 收藏类型  0商场 ， 1店铺，2品牌，3商品 */
    private Integer collectionType;

    /** 收藏时间 */
    private Date createAt;

    /** 更新时间 */
    private Date updateAt;

    /**
     * 自增主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自增主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 主键，可重复
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 主键，可重复
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 商品编号id
     * @return collectionId
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * 商品编号id
     * @param collectionId
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * 是否禁用0收藏 1取消收藏
     * @return isDisable
     */
    public Integer getIsDisable() {
        return isDisable;
    }

    /**
     * 是否禁用0收藏 1取消收藏
     * @param isDisable
     */
    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    /**
     * 收藏类型  0商场 ， 1店铺，2品牌，3商品
     * @return collectionType
     */
    public Integer getCollectionType() {
        return collectionType;
    }

    /**
     * 收藏类型  0商场 ， 1店铺，2品牌，3商品
     * @param collectionType
     */
    public void setCollectionType(Integer collectionType) {
        this.collectionType = collectionType;
    }

    /**
     * 收藏时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 收藏时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 更新时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 更新时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}