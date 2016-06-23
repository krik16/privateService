package com.rongyi.easy.rmmm.param.user;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;

/**
 * Created by hebo on 2015/12/28.
 * 订单收货地址VO
 */
public class OrderAddressParam extends BaseParam implements Serializable{

    private String OrderNo;//订单号
    private String province;//省
    private String city;//城市
    private String district;//区县
    private String address;//集体地址
    private String name;//收货人名
    private String phone;//收货人手机号
    private String provinceId;//省Id
    private String cityId;//城市Id
    private String districtId;//区县
    private Integer userId;//操作人id
    private Integer source = 1;//操作平台 1摩店 2商家后台

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Integer getSource()
    {
        return source;
    }

    public void setSource(Integer source)
    {
        this.source = source;
    }

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OrderAddressParam{" +
                "OrderNo='" + OrderNo + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", userId='" + userId + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
