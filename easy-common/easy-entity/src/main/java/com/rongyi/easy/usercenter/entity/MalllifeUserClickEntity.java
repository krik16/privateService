package com.rongyi.easy.usercenter.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户点赞记录
 * @author user
 *
 */
public class MalllifeUserClickEntity implements Serializable {
    /** 主键 */
    private Integer id;

    /** 点赞活动id */
    private String clickId;

    /** 类型, 0: 文章/活动/同城 */
    private Integer type;

    /** 0:点赞 1:取消点赞 */
    private Integer status;
    
    /** 用户id */
    private String userId;

    /** 设备号 */
    private String devId;

    /** 创建时间 */
    private Date createAt;

    /** 修改时间 */
    private Date updateAt;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;    

	public MalllifeUserClickEntity() {
		super();
	}

	public MalllifeUserClickEntity(String clickId, Integer type, Integer status,
			String devId,String userId) {
		super();
		this.clickId = clickId;
		this.type = type;
		this.status = status;
		this.devId = devId;
		this.userId = userId;
		this.createAt = new Date();
		this.isDisabled = 0;
	}

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
    
    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * 点赞活动id
     * @return clickId
     */
    public String getClickId() {
        return clickId;
    }

    /**
     * 点赞活动id
     * @param clickId
     */
    public void setClickId(String clickId) {
        this.clickId = clickId;
    }

    /**
     * 类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 0:点赞 1:取消点赞
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0:点赞 1:取消点赞
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 设备号
     * @return devId
     */
    public String getDevId() {
        return devId;
    }

    /**
     * 设备号
     * @param devId
     */
    public void setDevId(String devId) {
        this.devId = devId;
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
     * 修改时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 修改时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 是否禁用0正常 1禁用
     * @return isDisabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * 是否禁用0正常 1禁用
     * @param isDisabled
     */
    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

	@Override
	public String toString() {
		return "MalllifeUserClickEntity [id=" + id + ", clickId=" + clickId
				+ ", type=" + type + ", status=" + status 
				+ ", userId=" + userId
				+ ", devId=" + devId
				+ ", createAt=" + createAt + ", updateAt=" + updateAt
				+ ", isDisabled=" + isDisabled 
				+ "]";
	}
}