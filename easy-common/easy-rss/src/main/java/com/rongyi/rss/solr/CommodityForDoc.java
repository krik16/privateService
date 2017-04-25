package com.rongyi.rss.solr;

import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.solr.McmcCommodityDocument;

import java.util.List;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian       2017/4/19    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public interface CommodityForDoc {


    /**
     * Commodity To Document
     * @param commodity
     * @return
     */
   public McmcCommodityDocument commodityToDocument(Commodity commodity)throws Exception;

    /**
     * 转换成 doc
     * @param commodityList
     * @return
     * @throws Exception
     */
   public List<McmcCommodityDocument> getMcmcDocListByQueryCommodityList(List<Commodity> commodityList) throws Exception;
}
