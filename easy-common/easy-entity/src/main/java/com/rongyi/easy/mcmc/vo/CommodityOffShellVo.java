package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2016/11/23.
 */
public class CommodityOffShellVo implements Serializable{

    private Integer totalSuccessCount;

    private Integer totalFailCount;

    private List<CommodityOffShellResult> commodityOffShellResultList;

    public Integer getTotalSuccessCount() {
        return totalSuccessCount;
    }

    public void setTotalSuccessCount(Integer totalSuccessCount) {
        this.totalSuccessCount = totalSuccessCount;
    }

    public Integer getTotalFailCount() {
        return totalFailCount;
    }

    public void setTotalFailCount(Integer totalFailCount) {
        this.totalFailCount = totalFailCount;
    }

    public List<CommodityOffShellResult> getCommodityOffShellResultList() {
        return commodityOffShellResultList;
    }

    public void setCommodityOffShellResultList(List<CommodityOffShellResult> commodityOffShellResultList) {
        this.commodityOffShellResultList = commodityOffShellResultList;
    }
}
