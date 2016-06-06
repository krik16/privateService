package com.rongyi.easy.rmmm.param.user;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2016/3/1
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/3/1              1.0            创建文件
 *
 */

import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;

public class UserAuditParam extends BaseParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  telPhone; //联系方式

    private String  userName; //名称

    private String  userDec; //简介

    private String  provinceId; //省

    private String  cityId; //市

    private String  areaId; //区

    private String shopId;//商铺Id

    private String mallId;//商场Id

    private String brandId;//品牌Id

    private String  faceImg;//（身份证正面照）

    private String   backImg;//（身份证背面照）

    private String workImg;//（工作照）

    private String otherImg;//（其它）

    public String getFaceImg() {
        return faceImg;
    }

    public void setFaceImg(String faceImg) {
        this.faceImg = faceImg;
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg;
    }

    public String getWorkImg() {
        return workImg;
    }

    public void setWorkImg(String workImg) {
        this.workImg = workImg;
    }

    public String getOtherImg() {
        return otherImg;
    }

    public void setOtherImg(String otherImg) {
        this.otherImg = otherImg;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDec() {
        return userDec;
    }

    public void setUserDec(String userDec) {
        this.userDec = userDec;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }
}
