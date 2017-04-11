package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.mcmc.vo.commodity.new1.FullCommodityVO;

/**
 * Created by yaoyiwei on 2017/4/11.
 */
public interface ICommodityBuilder {

    void buildSpec();
    void buildCommodity();
    void buildTotalCommodity();

    FullCommodityVO buildFullCommodity();
}
