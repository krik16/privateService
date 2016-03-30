package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * @author Lc
 *         <p/>
 *         列表VO需要继承公共分页VO
 */
public class PageVO implements Serializable {

	/**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * 数据总页数
     */
    private int totalPage;
    /**
     * 每页长度
     */
    private int pageSize;
    /**
     * 当前返回页
     */
    private int currentPage;
    /**
     *  数据总数
     */
    private int totalCount;

    public int getTotalPage() {
        return totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setTotalPageByTotalRecord(int totalRecord) {
        this.totalPage = (int) Math.floor((totalRecord * 1.0d) / this.pageSize);
        if (totalRecord % this.pageSize != 0) {
            this.totalPage++;
        }
        if (this.totalPage == 0) {
            this.totalPage = 1;
        }
    }
}
