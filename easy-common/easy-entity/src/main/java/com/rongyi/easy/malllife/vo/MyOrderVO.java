package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @edit Lc
 */
public class MyOrderVO implements Serializable {
    private String orderId;
    private String orderTime;
    private String payTime;
    List<MyOrderDetailVO> detailList;
    private Integer displayStauts; //显示全部的订单信息的status
    //0:待付款 , 2:已取消, 3:已删除, 4退款中, 5未消费, 6已退款, 7已过期, 8已使用
    private String displayNum; // 已退款张数
    private boolean notOutCodeFlag = true; // 外部导入券标志 true 不是外部导入券,false 是外部导入券

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<MyOrderDetailVO> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<MyOrderDetailVO> detailList) {
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

}
