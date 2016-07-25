package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * 渠道列表数据查询参数
 * Created by shaozhou on 2016/7/1.
 */
public class ChannelSearchParam implements Serializable {
    private String channelCode;
    private String channelName;
    private int currentPage;
    private int pageSize;
    private int startIndex = 0;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
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

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    @Override
    public String toString() {
        return "ChannelSearchParam{" +
                "channelCode='" + channelCode + '\'' +
                ", channelName='" + channelName + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", startIndex=" + startIndex +
                '}';
    }
}
