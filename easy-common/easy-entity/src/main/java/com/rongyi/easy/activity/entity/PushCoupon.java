package com.rongyi.easy.activity.entity;

/**
 * 推送coupon关联类
 *
 * @author yuanbo
 */
import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

public class PushCoupon implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String couponType;
	private String status;
	private String quantity;   
	private String price;
	private String publishBeginDate;
	private String publishEndDate;
	private String validateBeginDate;
	private String validateEndDate;
    public String getValidateBeginDate() {
        return validateBeginDate;
    }
    public void setValidateBeginDate(String validateBeginDate) {
        this.validateBeginDate = validateBeginDate;
    }
    public String getValidateEndDate() {
        return validateEndDate;
    }
    public void setValidateEndDate(String validateEndDate) {
        this.validateEndDate = validateEndDate;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCouponType() {
        return couponType;
    }
    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getPublishBeginDate() {
        return publishBeginDate;
    }
    public void setPublishBeginDate(String publishBeginDate) {
        this.publishBeginDate = publishBeginDate;
    }
    public String getPublishEndDate() {
        return publishEndDate;
    }
    public void setPublishEndDate(String publishEndDate) {
        this.publishEndDate = publishEndDate;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
	
}
