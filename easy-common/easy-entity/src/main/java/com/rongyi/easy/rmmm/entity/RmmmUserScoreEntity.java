package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class RmmmUserScoreEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 表主键 */
    private Integer id;

    /** 创建人 */
    private Integer createBy;

    /** 创建时间 */
    private Date createAt;

    /** 修改人 */
    private Integer updateBy;

    /** 修改时间 */
    private Date updateAt;

    /** 版本 */
    private Integer version;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 导购ID */
    private Integer userId;

    /** 导购获取的分数 */
    private Integer userScore;

    /** 摩生活用户Id */
    private String mallLifeId;

    /**
     * 表主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 表主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 创建人
     * @return createBy
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
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
     * 修改人
     * @return updateBy
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 修改人
     * @param updateBy
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
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
     * 版本
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
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

    /**
     * 导购ID
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 导购ID
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 导购获取的分数
     * @return userScore
     */
    public Integer getUserScore() {
        return userScore;
    }

    /**
     * 导购获取的分数
     * @param userScore
     */
    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    /**
     * 摩生活用户Id
     * @return mallLifeId
     */
    public String getMallLifeId() {
        return mallLifeId;
    }

    /**
     * 摩生活用户Id
     * @param mallLifeId
     */
    public void setMallLifeId(String mallLifeId) {
        this.mallLifeId = mallLifeId;
    }
}