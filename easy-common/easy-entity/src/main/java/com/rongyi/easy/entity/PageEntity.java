package com.rongyi.easy.entity;

import java.io.Serializable;

/**
 * 分页实体
 *
 * @author wangjh7
 * @date 2017-02-04
 */
public class PageEntity implements Serializable {
    //  当前页
    private int currentPage = 0;
    // 每页数
    private int pageSize = 0;
    // 总数
    private int totalCount = 0;
    // 总页数
    private int totalPage = 0;

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

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "PageEntity{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                '}';
    }

    public PageEntity(int currentPage, int pageSize, int totalCount) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        if (0 < pageSize && 0 < totalCount) {
            if (0 == totalCount % pageSize) {
                this.totalPage = totalCount / pageSize;
            } else {
                this.totalPage = (totalCount / pageSize) + 1;
            }
        }
    }

    public PageEntity() {
    }

    public static void main(String[] args) {
        PageEntity page = new PageEntity(1, 10, 101);
        System.out.println(page);
    }
}
