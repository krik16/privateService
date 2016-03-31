package com.rongyi.easy.mallshop.customer;

import com.rongyi.easy.malllife.common.util.DateUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by xgq on 2015/7/17.
 */
public class CustomerOrderVO implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 大订单号
     */
    private String orderNo;

    /**
     * 总价（总价=子订单实价总和 + 邮费 - 折扣
     */
    private BigDecimal totalAmount;

    /**
     * 订单创建时间
     */
    private Date createAt;

    /**
     * 订单完成时间
     */
    private Date finishAt;

    /**
     * 微店id
     */
    private String weidianId;

    private List<CustomerOrderCommodityVO> orderDetailVOList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCreateAt() {
        return DateUtil.dateToString(this.createAt);
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getWeidianId() {
        return weidianId;
    }

    public void setWeidianId(String weidianId) {
        this.weidianId = weidianId;
    }

    public List<CustomerOrderCommodityVO> getOrderDetailVOList() {
        return orderDetailVOList;
    }

    public void setOrderDetailVOList(List<CustomerOrderCommodityVO> orderDetailVOList) {
        this.orderDetailVOList = orderDetailVOList;
    }

    public String getFinishAt() {
        return DateUtil.dateToString(this.finishAt);
    }

    public void setFinishAt(Date finishAt) {
        this.finishAt = finishAt;
    }
}
