package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;
import java.util.List;

/**
 * 买家申诉参数
 *
 * @author wangjh7
 * @date 2017-04-10
 **/
public class ComplaintParam implements Serializable {

    // 用户id
    private String memberId;
    // 退款单号
    private String refundNo;
    //申诉单号
    private String complaintNo;
    // 申诉原因
    private String remark;
    // 申诉凭证（多个用逗号分隔）
    private List<String> pics;

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getComplaintNo() {
        return complaintNo;
    }

    public void setComplaintNo(String complaintNo) {
        this.complaintNo = complaintNo;
    }

    @Override
    public String toString() {
        return "ComplaintParam{" +
                "complaintNo='" + complaintNo + '\'' +
                ", memberId='" + memberId + '\'' +
                ", refundNo='" + refundNo + '\'' +
                ", remark='" + remark + '\'' +
                ", pics=" + pics +
                '}';
    }
}
