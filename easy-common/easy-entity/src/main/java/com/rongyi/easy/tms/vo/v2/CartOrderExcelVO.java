package com.rongyi.easy.tms.vo.v2;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * kejun
 * 2016/4/28 11:49
 **/
public class CartOrderExcelVO {

    private String amountType;

    private Date createAtBegin;

    private Date createAtEnd;

    private String orderNo;

    private Integer orderSource;

    private Integer payChannel;

    private Double realAmountBegin;

    private Double realAmountEnd;

    private Integer status;

    private String userAccount;


    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public Date getCreateAtBegin() {
        return createAtBegin;
    }

    public void setCreateAtBegin(Date createAtBegin) {
        this.createAtBegin = createAtBegin;
    }

    public Date getCreateAtEnd() {
        return createAtEnd;
    }

    public void setCreateAtEnd(Date createAtEnd) {
        this.createAtEnd = createAtEnd;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Double getRealAmountBegin() {
        return realAmountBegin;
    }

    public void setRealAmountBegin(Double realAmountBegin) {
        this.realAmountBegin = realAmountBegin;
    }

    public Double getRealAmountEnd() {
        return realAmountEnd;
    }

    public void setRealAmountEnd(Double realAmountEnd) {
        this.realAmountEnd = realAmountEnd;
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

    @Override
    public String toString() {
        return "CartOrderExcelVO{" +
                "amountType=" + amountType +
                ", createAtBegin=" + createAtBegin +
                ", createAtEnd=" + createAtEnd +
                ", orderNo='" + orderNo + '\'' +
                ", orderSource=" + orderSource +
                ", payChannel=" + payChannel +
                ", realAmountBegin=" + realAmountBegin +
                ", realAmountEnd=" + realAmountEnd +
                ", status=" + status +
                ", userAccount='" + userAccount + '\'' +
                '}';
    }

    public Map<String,Object> toMap(){
        Map<String,Object> map = new HashMap<>();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            Object obj;
            try {
                obj = field.get(this);
                if(obj!=null){
                    map.put(field.getName(), obj);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}
