package com.rongyi.rss.mcmc.mq;

import com.rongyi.easy.mcmc.Commodity;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian       2017/4/11    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

public interface McmcSendMqService {

    /**
     * 操作商品发送MQ消息
     * @param flag 0 创建商品，1修改商品，2删除商品
     *              枚举类调用  如: CommodityConstants.CommodityIndexOp.Del_Index:
     * @param commodity
     */
    public void sendMcmcMq(int flag,Commodity commodity);

}
