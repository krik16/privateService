package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2017/1/19.
 */
public class WechatCommodityPageVo implements Serializable{

    private List<WechatCommodityVo> wechatCommodityVoList;

    private Long totalCount;

    private List<CommodityVO> commodityVOList;

    public List<WechatCommodityVo> getWechatCommodityVoList() {
        return wechatCommodityVoList;
    }

    public void setWechatCommodityVoList(List<WechatCommodityVo> wechatCommodityVoList) {
        this.wechatCommodityVoList = wechatCommodityVoList;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public List<CommodityVO> getCommodityVOList() {
        return commodityVOList;
    }

    public void setCommodityVOList(List<CommodityVO> commodityVOList) {
        this.commodityVOList = commodityVOList;
    }
}
