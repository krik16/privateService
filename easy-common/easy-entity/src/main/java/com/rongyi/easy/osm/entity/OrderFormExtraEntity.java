package com.rongyi.easy.osm.entity;

import net.sf.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderFormExtraEntity implements Serializable {
    private Integer id;

    private String orderNo;//订单号

    private String receiverPhone;//收货人手机

    private String receiverAddress;//收货人地址

    private String receiverName;//收货人姓名

    private String receiverProvinceName;//收货省市

    private String receiverCityName;//收货城市

    private String receiverDistrictName;//收货区县

    private String provinceId;

    private String cityId;

    private String districtId;

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

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverProvinceName() {
        return receiverProvinceName;
    }

    public void setReceiverProvinceName(String receiverProvinceName) {
        this.receiverProvinceName = receiverProvinceName;
    }

    public String getReceiverCityName() {
        return receiverCityName;
    }

    public void setReceiverCityName(String receiverCityName) {
        this.receiverCityName = receiverCityName;
    }

    public String getReceiverDistrictName() {
        return receiverDistrictName;
    }

    public void setReceiverDistrictName(String receiverDistrictName) {
        this.receiverDistrictName = receiverDistrictName;
    }

    public String getProvinceId()
    {
        return provinceId;
    }

    public void setProvinceId(String provinceId)
    {
        this.provinceId = provinceId;
    }

    public String getCityId()
    {
        return cityId;
    }

    public void setCityId(String cityId)
    {
        this.cityId = cityId;
    }

    public String getDistrictId()
    {
        return districtId;
    }

    public void setDistrictId(String districtId)
    {
        this.districtId = districtId;
    }

    @Override
    public String toString() {
        return "OrderFormEntity{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", receiverPhone=" + receiverPhone +
                ", receiverAddress=" + receiverAddress +
                ", receiverName=" + receiverName +
                ", receiverProvinceName='" + receiverProvinceName + '\'' +
                ", receiverCityName='" + receiverCityName + '\'' +
                ", receiverDistrictName='" + receiverDistrictName + '\'' +
                '}';
    }
}