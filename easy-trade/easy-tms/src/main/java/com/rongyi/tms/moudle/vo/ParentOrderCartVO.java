package com.rongyi.tms.moudle.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Ventures on 2015/12/29.
 * 母订单VO
 */
public class ParentOrderCartVO implements Serializable{

    private Integer id;
    private String orderNo;
    private String buyerAccount;//买家账号
    private BigDecimal realAmount;//订单金额
    private BigDecimal payAmount;//支付金额
    private Byte status;//状态 1未支付 2已支付 3超时关闭 4买家关闭 5失效
    private Integer orderSource;//订单来源： 0为容易逛，1为微网站，2为终端机，3其他
    private byte payChannel;//1支付宝网页  3支付宝app  5微信
    private Date createAt;
    private Date payAt;
    private String buyerName;
    private String buyerPhone;

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

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public byte getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(byte payChannel) {
        this.payChannel = payChannel;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getPayAt() {
        return payAt;
    }

    public void setPayAt(Date payAt) {
        this.payAt = payAt;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }
}
