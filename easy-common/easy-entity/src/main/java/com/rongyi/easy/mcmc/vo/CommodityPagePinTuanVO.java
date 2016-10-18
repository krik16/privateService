package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yaoyiwei on 2016/10/18.
 */
public class CommodityPagePinTuanVO extends PageVO implements Serializable {
    private List<CommodityPinTuanVO> commodityList;

    public List<CommodityPinTuanVO> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<CommodityPinTuanVO> commodityList) {
        this.commodityList = commodityList;
    }

    @Override
    public String toString() {
        return "CommodityPagePinTuanVO{" +
                "commodityList=" + commodityList +
                '}';
    }
}
