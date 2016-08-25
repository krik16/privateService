package com.rongyi.easy.bsoms.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 任务报名用户详情信息
 * Created by sj on 2016/8/5.
 */
public class TaskUserVo implements Serializable{
    private static final long serialVersionUID = 3283627083282915219L;

    private Integer id ;

    private String userPhone ; //联系方式

    private Integer userType ;  //1店长/导购 2买手

    private Integer status ;  //领取状态

    private Date receiveAt ; //领取时间

    private String mallMid;  //商场mongoID

    private String shopMid; //店铺mongoId

    private String mallName ; //商场名称

    private String shopName; //店铺名称

    private String areaStr ; // 省市区信息

    private String address ; //店铺详细地址

    private String referralName; //推荐人姓名

    private String referralPhone; //推荐人联系电话

    @Override
    public String toString() {
        return "TaskUserVo{" +
                "id=" + id +
                ", userPhone='" + userPhone + '\'' +
                ", userType=" + userType +
                ", status=" + status +
                ", receiveAt=" + receiveAt +
                ", mallMid='" + mallMid + '\'' +
                ", shopMid='" + shopMid + '\'' +
                ", mallName='" + mallName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", areaStr='" + areaStr + '\'' +
                ", address='" + address + '\'' +
                ", referralName='" + referralName + '\'' +
                ", referralPhone='" + referralPhone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getReceiveAt() {
        return receiveAt;
    }

    public void setReceiveAt(Date receiveAt) {
        this.receiveAt = receiveAt;
    }

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAreaStr() {
        return areaStr;
    }

    public void setAreaStr(String areaStr) {
        this.areaStr = areaStr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReferralName() {
        return referralName;
    }

    public void setReferralName(String referralName) {
        this.referralName = referralName;
    }

    public String getReferralPhone() {
        return referralPhone;
    }

    public void setReferralPhone(String referralPhone) {
        this.referralPhone = referralPhone;
    }
}


