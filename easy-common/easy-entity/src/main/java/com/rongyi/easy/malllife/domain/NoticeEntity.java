package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.util.Date;

public class NoticeEntity implements Serializable{
    /**  */
    private Integer id;

    /** 关联店铺id */
    private Integer shopId;

    /** 创建时间 */
    private Date createAt;

    /** 更新时间 */
    private Date updateAt;

    /** 状态：0删除，1正常 */
    private Integer status;

    /** 更新操作者id */
    private Integer updateBy;

    /** 公告内容 */
    private String content;

    /**
     * 
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 关联店铺id
     * @return shopId
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 关联店铺id
     * @param shopId
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
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

    /**
     * 状态：0删除，1正常
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态：0删除，1正常
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 更新操作者id
     * @return updateBy
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新操作者id
     * @param updateBy
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 公告内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 公告内容
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}