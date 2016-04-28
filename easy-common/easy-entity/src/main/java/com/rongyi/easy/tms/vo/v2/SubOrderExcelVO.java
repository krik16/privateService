package com.rongyi.easy.tms.vo.v2;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * kejun
 * 2016/4/28 11:49
 **/
public class SubOrderExcelVO {

    private String cartOrderNo;

    private String commodityNo;

    private Date createAtBegin;


    private Date createAtEnd;

    private Integer guideType;

    private String  mallId;

    private String  orderNo;

    private Integer  orderSource;

    private Double payAmountBegin;

    private Double payAmountEnd;

    private Integer payChannel;

    private Integer status;

    private Integer shopId;

    private String sellerAccount;

    private String username;

    public String getCartOrderNo() {
        return cartOrderNo;
    }

    public void setCartOrderNo(String cartOrderNo) {
        this.cartOrderNo = cartOrderNo;
    }

    public String getCommodityNo() {
        return commodityNo;
    }

    public void setCommodityNo(String commodityNo) {
        this.commodityNo = commodityNo;
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

    public Integer getGuideType() {
        return guideType;
    }

    public void setGuideType(Integer guideType) {
        this.guideType = guideType;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
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

    public Double getPayAmountBegin() {
        return payAmountBegin;
    }

    public void setPayAmountBegin(Double payAmountBegin) {
        this.payAmountBegin = payAmountBegin;
    }

    public Double getPayAmountEnd() {
        return payAmountEnd;
    }

    public void setPayAmountEnd(Double payAmountEnd) {
        this.payAmountEnd = payAmountEnd;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;

    }

    @Override
    public String toString() {
        return "SubOrderExcelVO{" +
                "cartOrderNo='" + cartOrderNo + '\'' +
                ", commodityNo='" + commodityNo + '\'' +
                ", createAtBegin=" + createAtBegin +
                ", createAtEnd=" + createAtEnd +
                ", guideType=" + guideType +
                ", mallId='" + mallId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderSource=" + orderSource +
                ", payAmountBegin=" + payAmountBegin +
                ", payAmountEnd=" + payAmountEnd +
                ", payChannel=" + payChannel +
                ", status=" + status +
                ", shopId=" + shopId +
                ", sellerAccount='" + sellerAccount + '\'' +
                ", username='" + username + '\'' +
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
