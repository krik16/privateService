package com.rongyi.easy.mcmc.vo.commodity.new1;

import com.rongyi.easy.mcmc.vo.CommoditySpecVO;
import com.rongyi.easy.mcmc.vo.CommodityVO;

import java.util.List;

/**
 * Created by yaoyiwei on 2017/4/11.
 */
public class FullCommodityVO {

    private List<CommoditySpecVO> specVOs;
    private CommodityVO commodityVO;
    private TotalCommodityVO totalCommodityVO;

    public CommodityVO getCommodityVO() {
        return commodityVO;
    }

    public void setCommodityVO(CommodityVO commodityVO) {
        this.commodityVO = commodityVO;
    }

    public List<CommoditySpecVO> getSpecVOs() {
        return specVOs;
    }

    public void setSpecVOs(List<CommoditySpecVO> specVOs) {
        this.specVOs = specVOs;
    }

    public TotalCommodityVO getTotalCommodityVO() {
        return totalCommodityVO;
    }

    public void setTotalCommodityVO(TotalCommodityVO totalCommodityVO) {
        this.totalCommodityVO = totalCommodityVO;
    }
}
