package com.rongyi.rss.mcmc.new1.builder;

import com.rongyi.easy.mcmc.vo.commodity.new1.FullCommodityVO;
import com.rongyi.rss.mcmc.new1.ICommodityBuilder;

/**
 * Created by yaoyiwei on 2017/4/11.
 */
public class CommodityDirector {

    public FullCommodityVO build(ICommodityBuilder builder) {
        builder.buildSpec();
        builder.buildCommodity();
        builder.buildTotalCommodity();

        return builder.buildFullCommodity();
    }
}
