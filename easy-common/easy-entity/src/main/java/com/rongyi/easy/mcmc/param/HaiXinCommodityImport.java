package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * Created by yaoyiwei on 2017/3/16.
 */
public class HaiXinCommodityImport implements Serializable {

    private String url;
    private String code;
    private String startDate;
    private String endDate;
    private boolean updateAll;
    private String shopMid;

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isUpdateAll() {
        return updateAll;
    }

    public void setUpdateAll(boolean updateAll) {
        this.updateAll = updateAll;
    }

    @Override
    public String toString() {
        return "HaiXinCommodityImport{" +
                "url='" + url + '\'' +
                ", code='" + code + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", updateAll=" + updateAll +
                ", shopMid='" + shopMid + '\'' +
                '}';
    }
}
