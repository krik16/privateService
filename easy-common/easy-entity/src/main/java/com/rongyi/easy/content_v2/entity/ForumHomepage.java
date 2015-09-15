package com.rongyi.easy.content_v2.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 这是内容管理的主页
 * @author lijing
 * @time 2015 08 31
 */
public class ForumHomepage implements Serializable {
    /**主键id*/
	private Integer id;
	/**模版类型的id  是ForumModel的id*/
    private Integer modelId;
    /**内容标题*/
    private String title;
    /**状态 0代表启用，1代表关闭*/
    private Integer status;
    /**顺序（位置） 从1开始*/
    private Integer sortIdx;
    /** 创建人*/
    private String createUser;
    /** 创建时间*/
    private Date createAt;
    /**修改人*/
    private String updateUser;
    /**修改时间*/
    private Date updateAt;
    /**子模版个数*/
    private Integer positionCount;
    
    /**是否已经删除  true表示删除 flase 表示没有删除*/
    private boolean isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortIdx() {
        return sortIdx;
    }

    public void setSortIdx(Integer sortIdx) {
        this.sortIdx = sortIdx;
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

    public Integer getPositionCount() {
        return positionCount;
    }

    public void setPositionCount(Integer positionCount) {
        this.positionCount = positionCount;
    }

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
    
}