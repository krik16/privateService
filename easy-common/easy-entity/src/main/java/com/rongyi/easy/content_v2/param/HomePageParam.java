package com.rongyi.easy.content_v2.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * app首页配置参数
 * Created by Breggor on 2015/9/25.
 */
public class HomePageParam implements Serializable {
    private String cityId;//当前城市Id
    private String cityName;//当前城市名
    private String userId;//登录用户Id
    private String longitude;//经度
    private String latitude;//纬度
    private String version; //首页配置版本号
    private int iosOrAndroid;//是安卓或者是ios   0安卓 1是ios

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getIosOrAndroid() {
        return iosOrAndroid;
    }

    public void setIosOrAndroid(int iosOrAndroid) {
        this.iosOrAndroid = iosOrAndroid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("cityId", cityId)
                .append("cityName", cityName)
                .append("userId", userId)
                .append("longitude", longitude)
                .append("latitude", latitude)
                .append("version", version)
                .append("iosOrAndroid", iosOrAndroid)
                .toString();
    }
}
