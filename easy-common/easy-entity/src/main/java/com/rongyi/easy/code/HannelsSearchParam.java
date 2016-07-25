package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/6/29.
 * 促销推广码查询参数实体
 */
public class HannelsSearchParam implements Serializable {
    private String name;//促销码名称
    private String type;//推广码类型(全部为空字符串，0:渠道邀请码；1:渠道推广码)
    private String channelId;//渠道id（全部为空字符串）
    private String status;//推广码状态（全部为空字符串、待审核0、未开始1、进行中2、已结束3、未通过4、已作废5）
    private String validStartAt;//有效期开始时间
    private String validEndAt;//有效期结束时间
    private int currentPage;//当前页
    private int pageSize;//总页数
    private int startIndex = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValidStartAt() {
        return validStartAt;
    }

    public void setValidStartAt(String validStartAt) {
        this.validStartAt = validStartAt;
    }

    public String getValidEndAt() {
        return validEndAt;
    }

    public void setValidEndAt(String validEndAt) {
        this.validEndAt = validEndAt;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    @Override
    public String toString() {
        return "HannelsSearchParam{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", channelId='" + channelId + '\'' +
                ", status='" + status + '\'' +
                ", validStartAt='" + validStartAt + '\'' +
                ", validEndAt='" + validEndAt + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", startIndex=" + startIndex +
                '}';
    }
}
