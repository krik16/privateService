package com.rongyi.easy.tradecenter.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hebo on 2016/1/5.
 *
 */
public class ValidRecordVO implements Serializable{

    private Integer id;
    private String title;//券名称
    private String couponCode;//券码
    private Date useTime;//验证时间
    private String source;//订单来源 0为容易逛，1为微网站，2为终端机，3其他
    private String userPhone;//买家手机号
    private String checkerName;//验证人名字
    private Integer checkerUserId;//验证人id
    private String checkerAddress;//验证人（所属店铺商场）
    private String mallMid;
    private String shopMid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getCheckerName() {
        return checkerName;
    }

    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName;
    }

    public Integer getCheckerUserId() {
        return checkerUserId;
    }

    public void setCheckerUserId(Integer checkerUserId) {
        this.checkerUserId = checkerUserId;
    }

    public String getCheckerAddress() {
        return checkerAddress;
    }

    public void setCheckerAddress(String checkerAddress) {
        this.checkerAddress = checkerAddress;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }
}
