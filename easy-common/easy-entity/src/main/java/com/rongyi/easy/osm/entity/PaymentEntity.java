package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PaymentEntity implements Serializable{
    /** 主键id */
    private Integer id;

    /** 大订单号 */
    private Integer orderNum;

    /** 子订单号（如果是大订单则不填） */
    private Integer orderDetailNum;

    /** 金额 */
    private BigDecimal amountMoney;

    /** 状态（款已打/款已到） */
    private Integer status;

    /** 交易类型（购买/退款） */
    private Integer tradeType;

    /** 创建时间 */
    private Date createTime;

    /** 完成时间 */
    private Date finishTime;

    /** 支付工具（银行/支付宝等） */
    private Integer payChannel;

    /** 转出账号 */
    private String outAccount;

    /** 转入账号 */
    private String inAccount;

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
     * @return orderNum
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 大订单号
     * @param orderNum
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 子订单号（如果是大订单则不填）
     * @return orderDetailNum
     */
    public Integer getOrderDetailNum() {
        return orderDetailNum;
    }

    /**
     * 子订单号（如果是大订单则不填）
     * @param orderDetailNum
     */
    public void setOrderDetailNum(Integer orderDetailNum) {
        this.orderDetailNum = orderDetailNum;
    }

    /**
     * 金额
     * @return amountMoney
     */
    public BigDecimal getAmountMoney() {
        return amountMoney;
    }

    /**
     * 金额
     * @param amountMoney
     */
    public void setAmountMoney(BigDecimal amountMoney) {
        this.amountMoney = amountMoney;
    }

    /**
     * 状态（款已打/款已到）
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（款已打/款已到）
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 交易类型（购买/退款）
     * @return tradeType
     */
    public Integer getTradeType() {
        return tradeType;
    }

    /**
     * 交易类型（购买/退款）
     * @param tradeType
     */
    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 完成时间
     * @return finishTime
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 完成时间
     * @param finishTime
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 支付工具（银行/支付宝等）
     * @return payChannel
     */
    public Integer getPayChannel() {
        return payChannel;
    }

    /**
     * 支付工具（银行/支付宝等）
     * @param payChannel
     */
    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    /**
     * 转出账号
     * @return outAccount
     */
    public String getOutAccount() {
        return outAccount;
    }

    /**
     * 转出账号
     * @param outAccount
     */
    public void setOutAccount(String outAccount) {
        this.outAccount = outAccount;
    }

    /**
     * 转入账号
     * @return inAccount
     */
    public String getInAccount() {
        return inAccount;
    }

    /**
     * 转入账号
     * @param inAccount
     */
    public void setInAccount(String inAccount) {
        this.inAccount = inAccount;
    }
}