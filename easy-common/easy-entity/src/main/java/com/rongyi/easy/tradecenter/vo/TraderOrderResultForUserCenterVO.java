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

    @Override
    public String toString() {
        return "TraderOrderResultForUserCenterVO{" +
                "totalCount=" + totalCount +
                ", tradeOrderList=" + tradeOrderList +
                '}';
    }
}
