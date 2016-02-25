package com.rongyi.rss.mcmc;

import com.rongyi.easy.solr.param.CommoditySearchParam;

public interface KeywordsPreProcessService {

    public CommoditySearchParam process(CommoditySearchParam commoditySearchParam);

}
