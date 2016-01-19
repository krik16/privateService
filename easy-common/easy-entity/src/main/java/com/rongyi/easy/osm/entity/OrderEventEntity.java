package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderEventEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7775303153194903662L;

	/** 主键id */
    private Integer id;

    /** 大订单号 */
    private String orderNo;

    /** 订单原状态 */
    private String origStatus;

    /** 订单发生时间 */
    private Date createAt;

    /** 订单事件详情 */
    private String detail;

    /** 订单事件后状态 */
    private String status;

    /** 订单事件类型 */
    private String type;

    /**
     * 主键id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 大订单号
     * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 大订单号
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 订单原状态
     * @return origStatus
     */
    public String getOrigStatus() {
        return origStatus;
    }

    /**
     * 订单原状态
     * @param origStatus
     */
    public void setOrigStatus(String origStatus) {
        this.origStatus = origStatus;
    }

    /**
     * 订单发生时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 订单发生时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 订单事件详情
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 订单事件详情
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 订单事件后状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 订单事件后状态
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 订单事件类型
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 订单事件类型
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}