package com.rongyi.rss.solr;

import com.rongyi.easy.mcmc.CommodityQueryParam;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian       2017/4/19    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public interface IncrementIndex {


    /**
     * 更新当天修改过的商品，删除已删除状态商品Index
     */
    public  void incrementCommodityIndex(CommodityQueryParam commodityQueryParam);



}
