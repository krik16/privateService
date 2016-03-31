package com.rongyi.rss.activitymanage;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.activitymanage.param.SearchSecKillParam;
import com.rongyi.easy.rmmm.param.FlashSaleParam;

/**
 * Created by lijing on 2015/11/25 10:30
 * .com.rongyi.rss.activitymanage
 * easy-api
 */
public interface MlActivityDetailService  {
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
     * 查询秒杀的接口
     * @param searchSecKillParam
     * @return
     */
    public ResponseVO searchSeckillDetailByParam(SearchSecKillParam searchSecKillParam);
}
