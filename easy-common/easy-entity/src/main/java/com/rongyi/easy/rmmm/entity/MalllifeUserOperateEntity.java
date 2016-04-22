package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class MalllifeUserOperateEntity implements Serializable{
    /** id主键不可用，205,215数据库没设置自增，虽然线上数据库、200数据库是自增的*/
    private Integer id;

    /** 用户ID */
    private String userId;

    /** 类型 1 红包 2代金券 3抵扣券 */
    private Integer type;

    /** 创建时间 */
    private Date createAt;

    /** 更新时间 */
    private Date updateAt;

    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 类型 1 红包 2代金券 3抵扣券
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型 1 红包 2代金券 3抵扣券
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
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
}