package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;

/**
 * 申诉操作结果参数
 *
 * @author wangjh7
 * @date 2017-04-10
 **/
public class ComplaintResultParam implements Serializable {
    private String complaintNo;
    private String remark;
    // 申诉操作（1：同意 2：拒绝）
    private Integer type;
    private String userId;
    private String userName;

    public String getComplaintNo() {
        return complaintNo;
    }

    public void setComplaintNo(String complaintNo) {
        this.complaintNo = complaintNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ComplaintResultParam{" +
                "complaintNo='" + complaintNo + '\'' +
                ", remark='" + remark + '\'' +
                ", type=" + type +
                '}';
    }
}
