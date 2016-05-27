package com.rongyi.rss.roa.sharered;

/*
 * Description:  交易分享红包
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian      2016/5/6    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public interface DealShareRedService {


    /**
     * 根据订单号获取 分享红包ID
     * @param orderNum
     * @return
     */

    public String getShareRedId(String orderNum);

}
