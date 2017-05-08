package com.rongyi.easy.tradecenter;

import java.io.Serializable;

/**
 * 基本查询（仅含页码、页数）
 *
 * @author wangjh7
 * @date 2017-04-10
 **/
public class BaseQueryParam implements Serializable {
    //  页码
    private int pageIndex;
    // 开始
    private int start;
    // 没页数
    private int pageSize;

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

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "BaseQueryParam{" +
                "pageIndex=" + pageIndex +
                ", start=" + start +
                ", pageSize=" + pageSize +
                '}';
    }
}
