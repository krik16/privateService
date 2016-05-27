package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/5/27 17:32
 * Package:com.rongyi.code.entity.vo
 * Project:easy-market
 */
public class StatisticsValidCountVO implements Serializable {
    private Integer total;
    private Integer today;
    private Integer gifts;
    private Integer parkings;
    private Integer coupons;
    private Integer activities;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getToday() {
        return today;
    }

    public void setToday(Integer today) {
        this.today = today;
    }

    public Integer getGifts() {
        return gifts;
    }

    public void setGifts(Integer gifts) {
        this.gifts = gifts;
    }

    public Integer getParkings() {
        return parkings;
    }

    public void setParkings(Integer parkings) {
        this.parkings = parkings;
    }

    public Integer getCoupons() {
        return coupons;
    }

    public void setCoupons(Integer coupons) {
        this.coupons = coupons;
    }

    public Integer getActivities() {
        return activities;
    }

    public void setActivities(Integer activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StatisticsValidCountVO{");
        sb.append("total=").append(total);
        sb.append(", today=").append(today);
        sb.append(", gifts=").append(gifts);
        sb.append(", parkings=").append(parkings);
        sb.append(", coupons=").append(coupons);
        sb.append(", activities=").append(activities);
        sb.append('}');
        return sb.toString();
    }
}
