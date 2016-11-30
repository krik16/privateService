package com.rongyi.easy.osm.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单预约信息
 */
public class OrderReserveEntity implements Serializable {
    /** 主键 */
    private Integer id;

    /** 商铺订单号 */
    private String orderNo;

    /** 预约人姓名 */
    private String reserveName;

    /** 预约人手机号 */
    private String reservePhone;

    /** 预约人公司 */
    private String reserveCompany;

    /** 预约人职称 */
    private String reservePost;

    /** 创建时间 */
    private Date createAt;

    /** 修改时间 */
    private Date updateAt;

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商铺订单号
     * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 商铺订单号
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 预约人姓名
     * @return reserveName
     */
    public String getReserveName() {
        return reserveName;
    }

    /**
     * 预约人姓名
     * @param reserveName
     */
    public void setReserveName(String reserveName) {
        this.reserveName = reserveName;
    }

    /**
     * 预约人手机号
     * @return reservePhone
     */
    public String getReservePhone() {
        return reservePhone;
    }

    /**
     * 预约人手机号
     * @param reservePhone
     */
    public void setReservePhone(String reservePhone) {
        this.reservePhone = reservePhone;
    }

    /**
     * 预约人公司
     * @return reserveCompany
     */
    public String getReserveCompany() {
        return reserveCompany;
    }

    /**
     * 预约人公司
     * @param reserveCompany
     */
    public void setReserveCompany(String reserveCompany) {
        this.reserveCompany = reserveCompany;
    }

    /**
     * 预约人职称
     * @return reservePost
     */
    public String getReservePost() {
        return reservePost;
    }

    /**
     * 预约人职称
     * @param reservePost
     */
    public void setReservePost(String reservePost) {
        this.reservePost = reservePost;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 修改时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 修改时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}