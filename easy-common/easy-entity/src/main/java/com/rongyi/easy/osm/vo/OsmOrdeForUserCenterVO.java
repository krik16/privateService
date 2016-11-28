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

    @Override
    public String toString() {
        return "OsmOrdeForUserCenterVO{" +
                "osmOrderList=" + osmOrderList +
                ", totalCount=" + totalCount +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                '}';
    }
}
