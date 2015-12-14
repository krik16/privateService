package com.rongyi.settle.web.controller.vo;

import java.io.Serializable;

/**
 * Created by hebo on 2015/12/4.
 * 账户VO
 */
public class UserInfoVo implements Serializable{

    private Integer id;
    private String userAccount;
    private String guideType;//账号类型

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getGuideType() {
        return guideType;
    }

    public void setGuideType(String guideType) {
        this.guideType = guideType;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
