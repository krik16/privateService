package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.mcmc.param.CommodityParam;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.mcmc.vo.commodity.new1.FullCommodityVO;
import com.rongyi.easy.mcmc.vo.commodity.new1.TotalCommodityVO;

/**
 * Created by yaoyiwei on 2017/4/11.
 */
public interface ICommodityBuilder {

    CommodityVO buildCommodity(CommodityParam commodityParam, SessionUserInfo userInfo);
    TotalCommodityVO buildTotalCommodity(CommodityParam commodityParam, SessionUserInfo userInfo);

    FullCommodityVO buildFullCommodity(CommodityParam commodityParam, SessionUserInfo userInfo);
}
