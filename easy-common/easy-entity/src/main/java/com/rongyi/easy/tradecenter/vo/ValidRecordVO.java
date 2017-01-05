package com.rongyi.easy.tradecenter.vo;

import java.io.Serializable;
import java.math.BigDecimal;
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
    private String source;//订单来源 0为容易逛，1为微网站，2为终端机，3其他,4微信
    private String userPhone;//买家手机号
    private String userName;//买家手姓名
    private String checkerName;//验证人名字
    private Integer checkerUserId;//验证人id
    private String checkerAddress;//验证人（所属店铺商场）
    private BigDecimal price;
    private String mallMid;
    private String shopMid;
    private Integer point ;
    private Integer unitPrice;
    private String shopName;
    private String mallName;
    private Integer couponType;

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ValidRecordVO{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", couponCode='").append(couponCode).append('\'');
        sb.append(", useTime=").append(useTime);
        sb.append(", source='").append(source).append('\'');
        sb.append(", userPhone='").append(userPhone).append('\'');
        sb.append(", checkerName='").append(checkerName).append('\'');
        sb.append(", checkerUserId=").append(checkerUserId);
        sb.append(", checkerAddress='").append(checkerAddress).append('\'');
        sb.append(", price=").append(price);
        sb.append(", mallMid='").append(mallMid).append('\'');
        sb.append(", shopMid='").append(shopMid).append('\'');
        sb.append(", point=").append(point);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append('}');
        return sb.toString();
    }
}
