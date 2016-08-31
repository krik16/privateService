package com.rongyi.tms.moudle.vo;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * kejun
 * 2016/8/31 11:48
 **/
public class CouponOrderExcelSearchVO implements Serializable{

    private Date createAtBegin;

    private Date createAtEnd;

    private Integer source;

    private Integer amountType;

    private Double realAmountBegin;

    private Double realAmountEnd;

    private Integer payChannel;

    private String orderNo;

    private String userPhone;

    private Byte status;

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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getAmountType() {
        return amountType;
    }

    public void setAmountType(Integer amountType) {
        this.amountType = amountType;
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

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CouponOrderExcelSearchVO{" +
                "createAtBegin=" + createAtBegin +
                ", createAtEnd=" + createAtEnd +
                ", source=" + source +
                ", amountType=" + amountType +
                ", realAmountBegin=" + realAmountBegin +
                ", realAmountEnd=" + realAmountEnd +
                ", payChannel=" + payChannel +
                ", orderNo='" + orderNo + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", status=" + status +
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
