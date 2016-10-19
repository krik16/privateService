package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 拼团商品信息分页VO
 *
 * @author yaoyiwei
 * @date 2016-10-18
 * @version 1.0
 *
 */
public class CommodityPagePinTuanVO extends PageVO implements Serializable {
    private List<CommodityPinTuanVO> commodityList;

    public CommodityPagePinTuanVO(List<CommodityPinTuanVO> commodityList, Integer currentPage, Integer pageSize, Integer totalCount) {
        super(currentPage, pageSize, totalCount);
        this.commodityList = commodityList;
    }


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
