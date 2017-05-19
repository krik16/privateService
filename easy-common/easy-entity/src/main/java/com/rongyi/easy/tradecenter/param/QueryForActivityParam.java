package com.rongyi.easy.tradecenter.param;

import com.rongyi.easy.tradecenter.BaseQueryParam;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动请求参数-查询
 *
 * @author wangjh7
 * @date 2017-05-02
 **/
public class QueryForActivityParam extends BaseQueryParam implements Serializable {

    // 活动ID
    private Integer activityId;
    // 活动类型，参考（普通0、闪购1、特卖2、秒杀3、拼团4、超级团教育版5、断码好货6）
    private Integer activityType;
    // 开始时间（日期）
    private Date startDate;
    // 结束时间（日期）
    private Date endDate;
    // 买家手机号码
    private String buyerPhone;
    // 商品名称
    private String commodityName;
    // 订单号
    private String orderNo;
    // 订单状态
    private Integer orderStatus;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "QueryForActivityParam{" +
                "activityId=" + activityId +
                ", activityType=" + activityType +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                "} " + super.toString();
    }
}
