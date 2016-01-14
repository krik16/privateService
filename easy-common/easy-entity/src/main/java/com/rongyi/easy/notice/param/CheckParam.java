package com.rongyi.easy.notice.param;


import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/9/16 18:19.
 */
public class CheckParam implements Serializable {
    private Integer noticeId;


    private String jsession;
    private Integer status;//1 :通过  ；2：未通过    ； 3：下线
    private String reason;

    public CheckParam(String jsession, Integer status, String reason) {
        this.jsession = jsession;
        this.status = status;
        this.reason = reason;
    }

    public CheckParam() {

    }

    public CheckParam(Integer noticeId, String jsession, Integer status, String reason) {
        this.noticeId = noticeId;
        this.jsession = jsession;
        this.status = status;
        this.reason = reason;
    }

    public String getJsession() {
        return jsession;
    }

    public void setJsession(String jsession) {
        this.jsession = jsession;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("noticeId", noticeId).append("jsession", jsession).append("status", status).append("reason", reason).toString();
    }
}
