package com.rongyi.rss.mcmc;

import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.CommodityQueryParam;
import com.rongyi.easy.solr.McmcCommodityDocument;

import java.util.List;

/*
 * Description:  商品查询接口
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian       2017/4/19    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public interface ICommodityQueryService {


    /**
     * 根据条件返回删除信息
     * @param commodityQueryParam
     * @return
     */
    public List<Commodity> selectCommodityByQueryParam(CommodityQueryParam commodityQueryParam);

    /**
     * 查询商品数量
     * @param commodityQueryParam
     * @return
     */
    public Long commodityCount(CommodityQueryParam commodityQueryParam);


    /**
     * 根据查询条件查询 commodity信息转成 doc
     * @param commodityQueryParam
     * @return
     * @throws Exception
     */
   // public List<McmcCommodityDocument> getMcmcDocListByQueryParam(CommodityQueryParam commodityQueryParam) throws Exception;


}
