package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2016/6/22.
 */
public class OperateCommodityVos implements Serializable{

    private List<OperateCommodityVo> commodityList;


    private Long commodityCount;//商品总数

    private Long  commodityOSCount;//上架商品数量

    private Long commodityWSCount;//待上架商品数量

    private Long commdoityFSCount;//已下架商品数量

    public List<OperateCommodityVo> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<OperateCommodityVo> commodityList) {
        this.commodityList = commodityList;
    }

    public Long getCommodityCount() {
        return commodityCount;
    }

    public void setCommodityCount(Long commodityCount) {
        this.commodityCount = commodityCount;
    }

    public Long getCommodityOSCount() {
        return commodityOSCount;
    }

    public void setCommodityOSCount(Long commodityOSCount) {
        this.commodityOSCount = commodityOSCount;
    }

    public Long getCommodityWSCount() {
        return commodityWSCount;
    }

    public void setCommodityWSCount(Long commodityWSCount) {
        this.commodityWSCount = commodityWSCount;
    }

    public Long getCommdoityFSCount() {
        return commdoityFSCount;
    }

    public void setCommdoityFSCount(Long commdoityFSCount) {
        this.commdoityFSCount = commdoityFSCount;
    }
}
