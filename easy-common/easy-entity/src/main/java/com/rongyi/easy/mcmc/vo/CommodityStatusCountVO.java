package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * 商品状态数量类
 *
 * @author yaoyiwei
 * @date 2016-11-16
 * @version
 *
 */
public class CommodityStatusCountVO implements Serializable {

    private Integer status;
    private String statusDesc;
    private Integer count;

    public CommodityStatusCountVO() {}

    public CommodityStatusCountVO(Integer status, String statusDesc, Integer count) {
        this.status = status;
        this.statusDesc = statusDesc;
        this.count = count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
