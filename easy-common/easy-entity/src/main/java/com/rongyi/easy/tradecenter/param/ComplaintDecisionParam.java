package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;

/**
 * 平台申诉操作参数
 *
 * @author wangjh7
 * @date 2017-04-10
 **/
public class ComplaintDecisionParam implements Serializable {
    //申诉单号
    private String complaintNo;
    // 同意/拒绝原因
    private String remark;
    // 申诉操作（1：同意 2：拒绝）
    private int type;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
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
        return "ComplaintDecisionParam{" +
                "complaintNo='" + complaintNo + '\'' +
                ", remark='" + remark + '\'' +
                ", type=" + type +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
