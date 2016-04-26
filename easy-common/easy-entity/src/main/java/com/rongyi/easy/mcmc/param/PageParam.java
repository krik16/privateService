package com.rongyi.easy.mcmc.param;

/**
 * 分页查询
 * Created by wangzehui on 2016/3/24.
 */
public class PageParam {

    private int currapge=-1;
    private int pageSize=-1;

    public int getCurrapge() {
        return currapge;
    }

    public void setCurrapge(int currapge) {
        this.currapge = currapge;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PageParam{" +
                "currapge=" + currapge +
                ", pageSize=" + pageSize +
                '}';
    }
}
