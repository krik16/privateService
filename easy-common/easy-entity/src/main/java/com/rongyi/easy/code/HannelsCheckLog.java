package com.rongyi.easy.code;

import java.util.Date;

public class HannelsCheckLog {
    private Integer id;

    private Byte type;//type 1 表示审核不通过 2作废不通过

    private String reason;

    private Date createAt;

    private String createBy;

    private Integer hannelsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Integer getHannelsId() {
        return hannelsId;
    }

    public void setHannelsId(Integer hannelsId) {
        this.hannelsId = hannelsId;
    }
}