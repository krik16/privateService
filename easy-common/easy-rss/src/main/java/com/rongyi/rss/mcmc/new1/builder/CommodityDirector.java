package com.rongyi.rss.mcmc.new1.builder;

import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.mcmc.param.CommodityParam;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.mcmc.vo.commodity.new1.FullCommodityVO;
import com.rongyi.easy.mcmc.vo.commodity.new1.TotalCommodityVO;
import com.rongyi.rss.mcmc.new1.ICommodityBuilder;

/**
 * Created by yaoyiwei on 2017/4/11.
 */
public class CommodityDirector {
    private CommodityParam commodityParam;
    private SessionUserInfo userInfo;

    public CommodityDirector(CommodityParam commodityParam, com.rongyi.easy.bsoms.entity.SessionUserInfo userInfo) {
        this.commodityParam = commodityParam;
        this.userInfo = userInfo;
    }

    public FullCommodityVO build(ICommodityBuilder builder) throws Exception {
        return builder.buildFullCommodity(commodityParam, userInfo);
    }
}
