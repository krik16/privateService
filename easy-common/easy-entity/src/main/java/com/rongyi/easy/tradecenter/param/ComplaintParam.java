package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;

/**
 * 申诉参数
 *
 * @author wangjh7
 * @date 2017-04-10
 **/
public class ComplaintParam implements Serializable {
    // 退款单号
    private String refundNo;
    // 申诉原因
    private String remark;
    // 申诉凭证（多个用逗号分隔）
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    @Override
    public String toString() {
        return "ComplaintParam{" +
                "imageUrl='" + imageUrl + '\'' +
                ", refundNo='" + refundNo + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
