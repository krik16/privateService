package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 每日秒杀VO
 * Created by lijing on 2015/12/26 15:44
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class DailySaleVO implements Serializable {
    private Long nowDate = new Date().getTime(); //当前时间
    private Integer currentPosition = 1;//当前位置 从1开始
    private List<DailySaleListVO> dailySaleList;

    public Long getNowDate() {
        return this.nowDate == null ? new Date().getTime() : this.getNowDate() ;
    }

    public void setNowDate(Long nowDate) {
        this.nowDate = nowDate;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public List<DailySaleListVO> getDailySaleList() {
        return dailySaleList;
    }

    public void setDailySaleList(List<DailySaleListVO> dailySaleList) {
        this.dailySaleList = dailySaleList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("nowDate", nowDate)
                .append("currentPosition", currentPosition)
                .append("dailySaleList", dailySaleList)
                .toString();
    }
}
