package com.rongyi.easy.malllife.pojo;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  邀请人用户信息
 * time:  2016/3/4
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/3/4              1.0            创建文件
 *
 */

import java.io.Serializable;

public class InvitationUserInfoPojo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId; //买手ID

    //商家类型：0商场、1品牌、2买手
    private Integer userType;//卖家类型

    private String  userPhone;//手机号

    private String  shareCode; //邀请码


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getShareCode() {
        return shareCode;
    }

    public void setShareCode(String shareCode) {
        this.shareCode = shareCode;
    }
}
