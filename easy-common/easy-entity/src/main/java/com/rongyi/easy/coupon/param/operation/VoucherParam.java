package com.rongyi.easy.coupon.param.operation;

import java.io.Serializable;

/**
 * 代金券对外接口参数实体
 * Created by Leon on 2015/9/25.
 */
public class VoucherParam implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 代金券名称
     */
    private String name;

    private Integer currentPage;

    private Integer pageSize;

    private Integer offset;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getOffset() {
        if(currentPage == null || currentPage < 1 || pageSize == null || pageSize < 1){
            return null;
        }else{
            offset = (this.currentPage -1) * this.pageSize;
        }
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
