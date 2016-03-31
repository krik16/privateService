package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 容易逛首页-卡券推荐
 * Created by Breggor on 2015/9/10.
 */
public class CouponRecommendVO implements Serializable {

    private String title;//标题
    private String couponPic;//卡券图
    private String provId;//省份Id
    private String cityId;//城市Id
    private int type;//卡券类型
    private String typeVal;//卡券Id
    private Double origPrice;//原价
    private Double currPrice;//现价
    private String publishBeginAt;//发布开始时间
    private String publishEndAt;//发布结束时间

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCouponPic() {
        return couponPic;
    }

    public void setCouponPic(String couponPic) {
        this.couponPic = couponPic;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(String typeVal) {
        this.typeVal = typeVal;
    }

    public Double getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Double origPrice) {
        this.origPrice = origPrice;
    }

    public Double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(Double currPrice) {
        this.currPrice = currPrice;
    }

    public String getPublishBeginAt() {
        return publishBeginAt;
    }

    public void setPublishBeginAt(String publishBeginAt) {
        this.publishBeginAt = publishBeginAt;
    }

    public String getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(String publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("title", title)
                .append("couponPic", couponPic)
                .append("provId", provId)
                .append("cityId", cityId)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("origPrice", origPrice)
                .append("currPrice", currPrice)
                .append("publishBeginAt", publishBeginAt)
                .append("publishEndAt", publishEndAt)
                .toString();
    }
}
