package com.rongyi.rss.activitymanage;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.activitymanage.param.SearchSecKillParam;
import com.rongyi.easy.rmmm.param.FlashSaleParam;

import java.io.Serializable;

/**
 * 这是活动特卖闪购的详情接口
 * Created by lijing on 2015/11/24 13:35
 * .com.rongyi.rss.activitymanage
 * easy-api
 */
public interface RoaActivityDetailService  {

    /**
     * 查询特卖的详情
     * @param flashSaleParam
     * @return
     */
    public ResponseVO searchSaleDetailByParam(FlashSaleParam flashSaleParam);

    /**
     * 查询闪购的详情
     * @param flashSaleParam
     * @return
     */
   public ResponseVO searchIfashBuyDetailByParam(FlashSaleParam flashSaleParam);

    /**
     * 查询秒杀活动详情
     * @param searchSecKillParam
     * @return
     */
    public ResponseVO searchSeckillDetailByParam(SearchSecKillParam searchSecKillParam);
}
