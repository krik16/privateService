package com.rongyi.rss.activitymanage;

import com.rongyi.easy.activitymanage.vo.ActivityDailySaleSolrVO;

import java.util.List;

/**
 * create by com.rongyi.rss.activitymanage easy-api :author lijing
 * User:lijing
 * DATE : 2016/4/18
 * TIME : 10:50
 * easy-api.
 */
public interface ActivitySolrService {

    /**
     * 通过商品或卡券ids   查询秒杀的ids
     * @param goodsId    商品 或卡券ids
     * @param type  1 代表卡券  2代表商品
     * @return
     */
    public List<ActivityDailySaleSolrVO> searchDailySaleIdByGoodsId(List<String> goodsId,Integer type);
}
