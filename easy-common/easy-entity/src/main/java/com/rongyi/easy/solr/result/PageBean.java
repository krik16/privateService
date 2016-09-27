package com.rongyi.easy.solr.result;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 分页对象
 *
 * @author yaoyiwei
 * @date 2016-05-18
 * @version 1.0
 *
 */
public class PageBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    //当前页码
    private int pageNo;

    //当前页的开始行号
    private int startIndex;

    //每页的条数
    private int pageSize = DEFAULT_PAGE_SIZE;

    //查询的总记录数
    private long totalCount;

    // 一共有多少页
    private long totalPage;

    // 上一页
    private int upPage;

    // 下一页
    private int nextPage;

    //存放查询的返回结果
    private Collection<T> resultList;

    //默认每页条数
    public static final int DEFAULT_PAGE_SIZE = 100;

    /**
     * pageNo 从1开始
     *
     * @param pageNo
     * @param pageSize
     * @param totalCount
     */
    public PageBean(int pageNo, int pageSize, long totalCount) {
        this.setPageNo(pageNo);
        this.setPageSize(pageSize);
        this.setTotalCount(totalCount);
        this.init();
    }

    private void init() {
        this.setTotalPage();
        this.setUpPage();
        this.setNextPage();
    }

    /**
     * 作为查询参数的PageBean的构造方法
     *
     * @param pageNo 当前要查询的页数（第一页编号为1）
     * @param pageSize
     */
    public PageBean(int pageNo, int pageSize) {
        if (pageNo <= 0) pageNo = 1;
        if (pageSize <= 0) pageSize = DEFAULT_PAGE_SIZE;

        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.startIndex = (pageNo - 1) * pageSize;
    }

    /**
     * 作为查询结果的PageBean的构造方法
     *
     * @param totalCount
     * @param list
     */
    public PageBean(int totalCount, List<T> list) {
        this.totalCount = totalCount;
        addAll(list);
    }

    /**
     * 作为查询参数的PageBean的构造方法
     *
     * @param pageNo 当前要查询的页数（第一页编号为1）
     * @param pageSize
     * @param totalCount
     * @param list
     */
    public PageBean(int pageNo, int pageSize, int totalCount, List<T> list) {
        if (pageNo <= 0) pageNo = 1;
        if (pageSize <= 0) pageSize = DEFAULT_PAGE_SIZE;

        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.startIndex = (pageNo - 1) * pageSize;
        this.totalCount = totalCount;
        addAll(list);
    }

    public void addAll(List<T> result) {
        resultList = new ArrayList<T>();
        resultList.addAll(result);
    }

    public int getNextPage() {
        return nextPage;
    }

    /**
     * 获取第一条记录位置
     *
     * @return
     */
    public int getFirstResult() {
        if (totalPage == 0) {
            return 0;
        }
        if (pageNo <= 0) {
            pageNo = 1;
        }
        if (pageNo > totalPage) {
            return Long.valueOf(totalCount).intValue();
        }
        return (this.pageNo - 1) * this.pageSize;
    }

    /**
     * 获取最后记录位置
     *
     * @return
     */
    public int getLastResult() {
        return this.pageNo * this.pageSize;
    }

    /**
     * <b>
     * 设置下一页
     * </b>
     *
     * @return
     */
    public void setNextPage() {
        this.nextPage = (this.pageNo == this.totalPage) ? this.pageNo : (this.pageNo + 1);
    }

    public int getUpPage() {
        return upPage;
    }

    /**
     * 设置 上一页
     */
    public void setUpPage() {
        this.upPage = (this.pageNo > 1) ? this.pageNo - 1 : this.pageNo;
    }

    public long getTotalPage() {
        if (totalPage < 1) {
            this.totalPage = (this.totalCount % this.pageSize == 0) ?
                    (this.totalCount / this.pageSize) : (this.totalCount / this.pageSize + 1);
        }
        return totalPage;
    }

    /**
     * 计算一共有多少页
     */
    public void setTotalPage() {
        int pageSizeTmp = pageSize;
        if (pageSizeTmp == 0) {
            pageSizeTmp = DEFAULT_PAGE_SIZE;
        }
        this.totalPage = (this.totalCount % pageSizeTmp == 0) ?
                (this.totalCount / pageSizeTmp) : (this.totalCount / pageSizeTmp + 1);
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public Collection<T> getResultList() {
        return resultList;
    }

    public void setResultList(Collection<T> resultList) {
        this.resultList = resultList;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

}

