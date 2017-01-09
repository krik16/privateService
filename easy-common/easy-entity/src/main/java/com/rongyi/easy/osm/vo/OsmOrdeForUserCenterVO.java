package com.rongyi.easy.osm.vo;

import com.rongyi.easy.osm.entity.OsmOrderForUserCenterEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 订单列表（适用电子会员）
 *
 * @author wangjh7
 * @date 2016-11-25
 */
public class OsmOrdeForUserCenterVO implements Serializable {

    // 订单列表
    private List<OsmOrderForUserCenterEntity> osmOrderList;
    // 总数
    private int totalCount;
    // 页码
    private int pageIndex;
    // 页数
    private int pageSize;
    // 商品数
    private int commodityCount;
    // 优惠券数
    private int couponCount;
    // 停车券数
    private int parkingCount;
    // 待付款数
    private int unPaidCount = 0;
    // 待发货数
    private int toShippedCount = 0;
    // 已发货数
    private int shippedCount = 0;
    // 已完成
    private int confirmReceiptCount = 0;
    // 已完成
    private int closedCount = 0;
    // 未使用
    private int unUsedCount = 0;
    // 订单数
    private int orderCount = 0;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
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

    public List<OsmOrderForUserCenterEntity> getOsmOrderList() {
        return osmOrderList;
    }

    public void setOsmOrderList(List<OsmOrderForUserCenterEntity> osmOrderList) {
        this.osmOrderList = osmOrderList;
    }

    public int getClosedCount() {
        return closedCount;
    }

    public void setClosedCount(int closedCount) {
        this.closedCount = closedCount;
    }

    public int getCommodityCount() {
        return commodityCount;
    }

    public void setCommodityCount(int commodityCount) {
        this.commodityCount = commodityCount;
    }

    public int getConfirmReceiptCount() {
        return confirmReceiptCount;
    }

    public void setConfirmReceiptCount(int confirmReceiptCount) {
        this.confirmReceiptCount = confirmReceiptCount;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    public int getParkingCount() {
        return parkingCount;
    }

    public void setParkingCount(int parkingCount) {
        this.parkingCount = parkingCount;
    }

    public int getShippedCount() {
        return shippedCount;
    }

    public void setShippedCount(int shippedCount) {
        this.shippedCount = shippedCount;
    }

    public int getToShippedCount() {
        return toShippedCount;
    }

    public void setToShippedCount(int toShippedCount) {
        this.toShippedCount = toShippedCount;
    }

    public int getUnPaidCount() {
        return unPaidCount;
    }

    public void setUnPaidCount(int unPaidCount) {
        this.unPaidCount = unPaidCount;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public int getUnUsedCount() {
        return unUsedCount;
    }

    public void setUnUsedCount(int unUsedCount) {
        this.unUsedCount = unUsedCount;
    }

    @Override
    public String toString() {
        return "OsmOrdeForUserCenterVO{" +
                "closedCount=" + closedCount +
                ", osmOrderList=" + osmOrderList +
                ", totalCount=" + totalCount +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", commodityCount=" + commodityCount +
                ", couponCount=" + couponCount +
                ", parkingCount=" + parkingCount +
                ", unPaidCount=" + unPaidCount +
                ", toShippedCount=" + toShippedCount +
                ", shippedCount=" + shippedCount +
                ", confirmReceiptCount=" + confirmReceiptCount +
                ", unUsedCount=" + unUsedCount +
                ", orderCount=" + orderCount +
                '}';
    }
}
