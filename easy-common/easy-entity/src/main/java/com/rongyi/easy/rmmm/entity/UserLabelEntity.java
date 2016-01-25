package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class UserLabelEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 用户Id */
    private Integer userId;

    /** 标签Id */
    private Integer labelId;

    /** 用户类型 1 导购，2买手 */
    private Integer userType;

    /**
     * 用户Id
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户Id
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 标签Id
     * @return labelId
     */
    public Integer getLabelId() {
        return labelId;
    }

    /**
     * 标签Id
     * @param labelId
     */
    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    /**
     * 用户类型 1 导购，2买手
     * @return userType
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 用户类型 1 导购，2买手
     * @param userType
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}