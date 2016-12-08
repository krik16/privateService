package com.rongyi.easy.osm.vo;

import com.rongyi.easy.osm.entity.OsmOrderForUserCenterEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 订单统计（商城维度）
 *
 * @author wangjh7
 * @date 2016-12-08
 */
public class OsmOrderCountForUserCenterVO implements Serializable {
    // 已购买数
   private int boughtCount;
    // 待收货数
    private int shippedCount;
    // 已收货数
    private int confirmReceiptCount;
    // 取消数
    private int canceledCount;

    public int getBoughtCount() {
        return boughtCount;
    }

    public void setBoughtCount(int boughtCount) {
        this.boughtCount = boughtCount;
    }

    public int getCanceledCount() {
        return canceledCount;
    }

    public void setCanceledCount(int canceledCount) {
        this.canceledCount = canceledCount;
    }

    public int getConfirmReceiptCount() {
        return confirmReceiptCount;
    }

    public void setConfirmReceiptCount(int confirmReceiptCount) {
        this.confirmReceiptCount = confirmReceiptCount;
    }

    public int getShippedCount() {
        return shippedCount;
    }

    public void setShippedCount(int shippedCount) {
        this.shippedCount = shippedCount;
    }

    @Override
    public String toString() {
        return "OsmOrderCountForUserCenterVO{" +
                "boughtCount=" + boughtCount +
                ", shippedCount=" + shippedCount +
                ", confirmReceiptCount=" + confirmReceiptCount +
                ", canceledCount=" + canceledCount +
                '}';
    }
}
