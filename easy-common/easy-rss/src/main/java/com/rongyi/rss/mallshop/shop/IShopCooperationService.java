package com.rongyi.rss.mallshop.shop;

import com.rongyi.easy.rmmm.entity.ShopCooperationRelationship;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/5/12
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/12              1.0            创建文件
 *
 */
public interface IShopCooperationService {


    /**
     *
     * @param shopId
     * @return
     */
    public ShopCooperationRelationship getStatusByShopId(String shopId);

    /**
     * 更新店铺Id
     * @param shopId
     * @param shopMid
     * @param status
     * @return
     */
    public boolean updateShopStatus(String shopId,String shopMid,int status);

}
