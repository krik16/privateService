package com.rongyi.easy.pos.param;

import java.io.Serializable;
import java.util.Date;

/**
 * 满减活动查询条件
 *
 * @author wangjh7
 * @date 2017-02-04
 */
public class ReductionParam  implements Serializable{
    // 活动Id
    private String activityId;
    // 商城Id
    private String mallId;
    // 店铺Id
    private String shopId;
    // 用户
    private String buyerId;
    // 渠道 0：全部 6：POS
    private int platfrom;
    // 开始时间
    private Date startDate;
    // 结束时间
    private Date endDate ;
    // 当前页
    private int page;
    // 每页数
    private int pageSize;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public int getPlatfrom() {
        return platfrom;
    }

    public void setPlatfrom(int platfrom) {
        this.platfrom = platfrom;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "ReductionParam{" +
                "activityId='" + activityId + '\'' +
                ", mallId='" + mallId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", platfrom=" + platfrom +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", page=" + page +
                ", pageSize=" + pageSize +
                '}';
    }
}
