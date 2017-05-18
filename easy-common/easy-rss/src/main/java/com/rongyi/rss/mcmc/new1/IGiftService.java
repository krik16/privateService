package com.rongyi.rss.mcmc.new1;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.vo.commodity.new1.CommodityVO;

import java.util.List;

/**
 * 礼品Service
 *
 * Created by zhoukunkun on 2017/4/11.
 *
 */
public interface IGiftService {


    /**
     * Create a gift.
     *
     * @param gift
     *
     * @return ResponseVO
     */
    ResponseVO createGift(CommodityVO gift);

    /**
     * Edit a gift.
     *
     * @param gift
     *
     * @return ResponseResult
     */
    ResponseVO editGift(CommodityVO gift);

    List<String> createPayments(CommodityVO commodityVo);

    void updatePayments(List<String> paymentIds, String commodityId);
}
