package com.rongyi.easy.code;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/5/16 16:09
 * Package:com.rongyi.easy.code
 * Project:easy-market
 */
public class InviteCodeVO implements Serializable{
    private final static Long serialVersionUID=1L;
    private Long id;
    private String code;
    private Integer status;
    private Date createAt;
    private String activityId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InviteCodeVO{");
        sb.append("id=").append(id);
        sb.append(", code='").append(code).append('\'');
        sb.append(", status=").append(status);
        sb.append(", createAt=").append(createAt);
        sb.append(", activityId='").append(activityId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
