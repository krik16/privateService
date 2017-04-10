package com.rongyi.easy.osm.vo;

import java.io.Serializable;

/**
 * 申诉列表
 *
 * @author wangjh7
 * @date 2017-04-10
 **/
public class ComplaintFormVO implements Serializable {
    // 买家名称
    private String buyerName;
    // 买家手机号码
    private String buyerPhone;
    // 商品id
    private String commodityId;
    // 商品名称
    private String commodityName;
    // 申诉单号
    private String complaintNo;
    // 订单号
    private String orderNo;
    // 退款单号
    private String refundNo;
    // 退款金额（单位：元）
    private String refundAmount;
    private String remark;
    // 卖家店铺名称
    private String shopName;
    // 申诉时间
    private String createDate;
    // 处理人
    private String resultBy;
    // 处理结果，原因
    private String resultRemark;
    // 卖家处理状态：2：申诉成功、3：申诉失败
    private int resultStatus;
    // 买家申诉状态：1：申诉中、2：申诉成功、3：申诉失败、4：申诉关闭
    private int status;
}
