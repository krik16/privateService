package com.rongyi.easy.tradecenter.vo;

import com.rongyi.easy.tradecenter.TraderOrderForUserCenterEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 订单列表（适用电子会员）
 *
 * @author wangjh7
 * @date 2016-11-16
 */
public class TraderOrderResultForUserCenterVO implements Serializable {

    // 订单列表
    private List<TraderOrderForUserCenterEntity> tradeOrderList;
    // 总数
    private int totalCount;
    // 页码
    private int pageIndex ;
    // 页数
    private int pageSize;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<TraderOrderForUserCenterEntity> getTradeOrderList() {
        return tradeOrderList;
    }

    public void setTradeOrderList(List<TraderOrderForUserCenterEntity> tradeOrderList) {
        this.tradeOrderList = tradeOrderList;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "TraderOrderResultForUserCenterVO{" +
                "pageIndex=" + pageIndex +
                ", tradeOrderList=" + tradeOrderList +
                ", totalCount=" + totalCount +
                ", pageSize=" + pageSize +
                '}';
    }
}
