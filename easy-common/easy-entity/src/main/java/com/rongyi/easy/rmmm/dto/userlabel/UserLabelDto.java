package com.rongyi.easy.rmmm.dto.userlabel;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/10/13
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/13              1.0            创建文件
 *
 */

import java.io.Serializable;

public class UserLabelDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 用户Id */
    private Integer userId;

    /** 标签Id */
    private Integer labelId;

    /** 用户类型 1 导购，2买手 */
    private Integer userType;

    /** 标签名 */
    private String labelName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}
