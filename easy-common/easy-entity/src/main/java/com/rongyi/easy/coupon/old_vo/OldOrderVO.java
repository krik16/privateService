package com.rongyi.easy.coupon.old_vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

/**
 * @author lqy
 * @ClassName: CouponOrderVO
 * @Description: TODO(我的优惠券订单vo)
 * @date 2015年6月9日 下午6:00:19
 */
public class OldOrderVO {
    private String orderId; //订单号
    private String orderTime;//下单时间
    private String payTime;//支付时间
    private Integer displayStauts; // 订单 status 0:待付款 , 2:已取消, 3:已删除, 4退款中, 5未消费, 6已退款, 7已过期, 8已使用
    private String displayNum; // 已退款张数
    private boolean notOutCodeFlag = true; // 外部导入券标志 true 不是外部导入券,false 是外部导入券

    List<OldItemVO> detailList;//订单项列表

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<OldItemVO> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<OldItemVO> detailList) {
        this.detailList = detailList;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public Integer getDisplayStauts() {
        return displayStauts;
    }

    public void setDisplayStauts(Integer displayStauts) {
        this.displayStauts = displayStauts;
    }

    public String getDisplayNum() {
        return displayNum;
    }

    public void setDisplayNum(String displayNum) {
        this.displayNum = displayNum;
    }

    public boolean isNotOutCodeFlag() {
        return notOutCodeFlag;
    }

    public void setNotOutCodeFlag(boolean notOutCodeFlag) {
        this.notOutCodeFlag = notOutCodeFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("orderId", orderId)
                .append("orderTime", orderTime)
                .append("payTime", payTime)
                .append("displayStauts", displayStauts)
                .append("displayNum", displayNum)
                .append("notOutCodeFlag", notOutCodeFlag)
                .append("detailList", detailList)
                .toString();
    }
}
