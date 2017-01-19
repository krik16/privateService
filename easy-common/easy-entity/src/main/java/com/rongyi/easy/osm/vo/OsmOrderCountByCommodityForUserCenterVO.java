package com.rongyi.easy.osm.vo;

import java.io.Serializable;

/**
 * 订单统计（商品维度）
 *
 * @author wangjh7
 * @date 2016-12-08
 */
public class OsmOrderCountByCommodityForUserCenterVO implements Serializable {
    // 总数
    private int totalCount;
    // 销售数
    private int soldCount;
    // 已使用数
    private int usedCount;
    // 未使用数
    private int unUsedCount;

    public int getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(int soldCount) {
        this.soldCount = soldCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getUnUsedCount() {
        return unUsedCount;
    }

    public void setUnUsedCount(int unUsedCount) {
        this.unUsedCount = unUsedCount;
    }

    public int getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(int usedCount) {
        this.usedCount = usedCount;
    }

    @Override
    public String toString() {
        return "OsmOrderCountByCommodityForUserCenterVO{" +
                "soldCount=" + soldCount +
                ", totalCount=" + totalCount +
                ", usedCount=" + usedCount +
                ", unUsedCount=" + unUsedCount +
                '}';
    }
}
