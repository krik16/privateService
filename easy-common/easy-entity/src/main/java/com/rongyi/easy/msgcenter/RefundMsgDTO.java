package com.rongyi.easy.msgcenter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Description:退款/维权 消息入参
 * Author: yb
 * DATE: 2017/4/7 10:37
 * Package:com.rongyi.easy.msgcenter
 * Project:easy-market
 */
public class RefundMsgDTO implements Serializable{
    private static final long serialVersionUID = 7308357463333043737L;
    /**
     * 1.买家发起退款申请
     * 2.退款申请未处理即将到期提醒
     * 3.买家确认寄出退回商品
     * 4.卖家未及时处理“待卖家收货”的退货单
     * 5.买家发起申诉
     * 6.买家在微信端点击【提醒收货】按钮
     */
    private Integer type;

    /**
     * 推送对象的id 列表
     */
    private List<Integer> pushTargets;

    /**
     * 买家手机号
     */
    private String phone;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 退款单号
     */
    private String refundNo;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 退款金额
     */
    private Double refundAmount;

    /**
     * 快递公司
     */
    private String expressCompany;

    /**
     * 快递单号
     */
    private String expressNo;

    /**
     * 到期时间
     */
    private Date expireTime;

    /**
     * 申诉单号
     */
    private String appealNo;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Integer> getPushTargets() {
        return pushTargets;
    }

    public void setPushTargets(List<Integer> pushTargets) {
        this.pushTargets = pushTargets;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getAppealNo() {
        return appealNo;
    }

    public void setAppealNo(String appealNo) {
        this.appealNo = appealNo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RefundMsgDTO{");
        sb.append("type=").append(type);
        sb.append(", pushTargets=").append(pushTargets);
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", orderNo='").append(orderNo).append('\'');
        sb.append(", refundNo='").append(refundNo).append('\'');
        sb.append(", applyTime=").append(applyTime);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", expressCompany='").append(expressCompany).append('\'');
        sb.append(", expressNo='").append(expressNo).append('\'');
        sb.append(", expireTime=").append(expireTime);
        sb.append(", appealNo='").append(appealNo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
