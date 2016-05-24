package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/5/23 19:58
 * Package:com.rongyi.easy.code
 * Project:easy-market
 */
public class VerifyCodeParam implements Serializable {
    private final static Long serialVersionUID=1L;

    /**
     * 码
     */
    private String code;
    /**
     * 活动id
     */
    private String activityId;
    /**
     * 0:卡券；1：邀请码；2：礼品码
     */
    private Integer type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VerifyCodeParam{");
        sb.append("code='").append(code).append('\'');
        sb.append(", activityId='").append(activityId).append('\'');
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
