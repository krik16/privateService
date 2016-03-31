package com.rongyi.easy.tradecenter.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hebo on 2016/1/5.
 * 商家验码记录vo
 */
public class BizzValidHistoryVO implements Serializable{

    private Integer totalCount;//条件查询出的总验码数
    private Integer dailyCount;//条件查询出的当天验码数
    private List<ValidRecordVO> validRecords;//验码记录
    private Integer currPage;//当前页
    private Integer pageSize;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getDailyCount() {
        return dailyCount;
    }

    public void setDailyCount(Integer dailyCount) {
        this.dailyCount = dailyCount;
    }

    public List<ValidRecordVO> getValidRecords() {
        return validRecords;
    }

    public void setValidRecords(List<ValidRecordVO> validRecords) {
        this.validRecords = validRecords;
    }


}
