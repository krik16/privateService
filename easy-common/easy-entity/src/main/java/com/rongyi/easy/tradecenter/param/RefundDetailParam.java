package com.rongyi.easy.tradecenter.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 退款详情请求参数
 *
 * @author wangjh7
 * @date 2017-04-17
 */
public class RefundDetailParam implements Serializable {

    private String refundNo;//退款单号

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
