package com.rongyi.easy.content_v2.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * 内容管理子模块的位置信息
 *
 * @author lijing
 * @time 2015 08 31
 */
public class ForumPosition implements Serializable {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 关联的内容管理id forumHomepage的id
     */
    private Integer homepageId;
    /**
     * 位置的名字
     */
    private String name;
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
     * 0有效，1无效
     */
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHomepageId() {
        return homepageId;
    }

    public void setHomepageId(Integer homepageId) {
        this.homepageId = homepageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                .append("homepageId", homepageId)
                .append("name", name)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("status", status)
                .toString();
    }
}