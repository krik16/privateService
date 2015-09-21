package com.rongyi.easy.coupon.entity.mysql;

import java.io.Serializable;
import java.util.Date;

/**
 * �û��ֿ�ȯ
 */
public class UserRedenvelope implements Serializable {
    private Integer id;

    /**
     * ������id
     */
    private String userId;

    /**
     * ����������
     */
    private String userName;

    /**
     * ���id
     */
    private Integer couponId;

    /**
     * ���ȯ��
     */
    private String couponCode;

    /**
     * �ֿۼ۸�
     */
    private Double amount;

    /**
     * δʹ��[0], ��ʹ��[1]
     */
    private Integer status;

    /**
     * �û������˺�
     */
    private String userAccount;

    /**
     * �û���ȡ���ʱ��
     */
    private Date receiveAt;

    /**
     * ʹ�ú��ʱ��
     */
    private Date useAt;

    /**
     * ��ȡ����:���׹�[0] ������[1] ΢��[2]
     */
    private Integer channel;

    /**
     * ʹ�ú��������Ʒʱ����Ʒ������
     */
    private String orderNo;

    /**
     * ����ʱ��
     */
    private Date validAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Date getReceiveAt() {
        return receiveAt;
    }

    public void setReceiveAt(Date receiveAt) {
        this.receiveAt = receiveAt;
    }

    public Date getUseAt() {
        return useAt;
    }

    public void setUseAt(Date useAt) {
        this.useAt = useAt;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getValidAt() {
        return validAt;
    }

    public void setValidAt(Date validAt) {
        this.validAt = validAt;
    }
}