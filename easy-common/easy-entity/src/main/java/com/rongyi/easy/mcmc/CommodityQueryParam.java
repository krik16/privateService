package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.Date;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian       2017/4/19    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class CommodityQueryParam implements Serializable{

    static final long serialVersionUID = 1L;

    private Integer currentPage; //当前页数
    private Integer pageSize = 20;//每页显示数
    private String  updateDateStart; //更新时间(开始）
    private String  updateDateEnd;//更新时间(结束）
    /**
     * 状态 -11查询全部  -22 不等删除状态
     * -1：非现货初始化(直播使用）
     * 0下架
     * 1上架 (当前时间在上架时间和下架时间之间)
     * 2 删除
     * 3待上架
     * 4待处理
     * 5待审核
     * 6审核失败
     *
     */
    private Integer commodityStatus;

    private int skip=0;

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

    public String getUpdateDateEnd() {
        return updateDateEnd;
    }

    public void setUpdateDateEnd(String updateDateEnd) {
        this.updateDateEnd = updateDateEnd;
    }

    public String getUpdateDateStart() {
        return updateDateStart;
    }

    public void setUpdateDateStart(String updateDateStart) {
        this.updateDateStart = updateDateStart;
    }

    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }
}
