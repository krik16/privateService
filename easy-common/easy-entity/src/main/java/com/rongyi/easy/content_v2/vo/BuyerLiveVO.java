package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lijing on 2015/10/26.
 */
public class BuyerLiveVO implements Serializable {

    /**
     * 位置id
     */
    private Integer positionId;
    /**
     * 省份的id
     */
    private String provId;
    /**
     * 身份的名字
     */
    private String provName;
    /**
     * 城市的id
     */
    private String cityId;
    /**
     * 城市的名字
     */
    private String cityName;
    /**
     * 内容管理的详情的标题
     */
    private String title;
    /**
     * 买手直播
     */
    private String buyerLive;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBuyerLive() {
        return buyerLive;
    }

    public void setBuyerLive(String buyerLive) {
        this.buyerLive = buyerLive;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("positionId", positionId)
                .append("provId", provId)
                .append("provName", provName)
                .append("cityId", cityId)
                .append("cityName", cityName)
                .append("title", title)
                .append("buyerLive", buyerLive)
                .toString();
    }
}
