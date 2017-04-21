package com.rongyi.easy.mcmc.vo.commodity.new1;

import org.bson.types.ObjectId;

import java.util.List;

/**
 * Created by yaoyiwei on 2017/4/11.
 */
public class FullCommodityVO {

    private List<CommodityVO> commodityVOs;
    private TotalCommodityVO totalCommodityVO;
    private List<String> delCommodityIds;

    public List<CommodityVO> getCommodityVOs() {
        return commodityVOs;
    }

    public void setCommodityVOs(List<CommodityVO> commodityVOs) {
        this.commodityVOs = commodityVOs;
    }

    public TotalCommodityVO getTotalCommodityVO() {
        return totalCommodityVO;
    }

    public void setTotalCommodityVO(TotalCommodityVO totalCommodityVO) {
        this.totalCommodityVO = totalCommodityVO;
    }

    public List<String> getDelCommodityIds() {
        return delCommodityIds;
    }

    public void setDelCommodityIds(List<String> delCommodityIds) {
        this.delCommodityIds = delCommodityIds;
    }

    @Override
    public String toString() {
        return "FullCommodityVO{" +
                "commodityVOs=" + commodityVOs +
                ", totalCommodityVO=" + totalCommodityVO.toString() +
                ", delCommodityIds=" + delCommodityIds +
                '}';
    }
}
