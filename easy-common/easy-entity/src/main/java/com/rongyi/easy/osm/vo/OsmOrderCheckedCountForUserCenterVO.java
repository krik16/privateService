package com.rongyi.easy.osm.vo;

import java.io.Serializable;

/**
 * 券码核销统计
 *
 * @author wangjh7
 * @date 2016-12-21
 */
public class OsmOrderCheckedCountForUserCenterVO implements Serializable {
    // 总数
    private int totalCountForAll;
    // 已核销数
    private int checkedCountForAll;
    // 总数（当天）
    private int totalCountForDay;
    // 已核销数（当天）
    private int checkedCountForDay;

    public int getCheckedCountForAll() {
        return checkedCountForAll;
    }

    public void setCheckedCountForAll(int checkedCountForAll) {
        this.checkedCountForAll = checkedCountForAll;
    }

    public int getCheckedCountForDay() {
        return checkedCountForDay;
    }

    public void setCheckedCountForDay(int checkedCountForDay) {
        this.checkedCountForDay = checkedCountForDay;
    }

    public int getTotalCountForAll() {
        return totalCountForAll;
    }

    public void setTotalCountForAll(int totalCountForAll) {
        this.totalCountForAll = totalCountForAll;
    }

    public int getTotalCountForDay() {
        return totalCountForDay;
    }

    public void setTotalCountForDay(int totalCountForDay) {
        this.totalCountForDay = totalCountForDay;
    }

    @Override
    public String toString() {
        return "OsmOrderCheckedCountForUserCenterVO{" +
                "checkedCountForAll=" + checkedCountForAll +
                ", totalCountForAll=" + totalCountForAll +
                ", totalCountForDay=" + totalCountForDay +
                ", checkedCountForDay=" + checkedCountForDay +
                '}';
    }
}
