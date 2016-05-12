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

    private String amountType;

    private Double realAmountBegin;

    private Double realAmountEnd;

    private Integer payChannel;

    private Integer status;

    private Integer shopId;

    private String sellerAccount;

    private String username;

    private String userPhone;

    private String commodityId;

    private Date createAt;

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

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
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

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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
                ", amountType='" + amountType + '\'' +
                ", realAmountBegin=" + realAmountBegin +
                ", realAmountEnd=" + realAmountEnd +
                ", payChannel=" + payChannel +
                ", status=" + status +
                ", shopId=" + shopId +
                ", sellerAccount='" + sellerAccount + '\'' +
                ", username='" + username + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", commodityId='" + commodityId + '\'' +
                ", createAt=" + createAt +
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
