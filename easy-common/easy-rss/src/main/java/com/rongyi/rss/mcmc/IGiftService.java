package com.rongyi.rss.mcmc;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.param.SearchGiftParam;
import com.rongyi.easy.mcmc.vo.CommodityVO;


/**
 * 礼品Service
 *
 * @author yaoyiwei
 * @date 2016-11-24
 * @version 1.0
 *
 */
public interface IGiftService {

    /**
     * Get gift list.
     *
     * @param param
     * @return ResponseVO
     */
    ResponseVO getGiftList(final SearchGiftParam param);

    /**
     * Get gift numbers of all status.
     *
     * @param param
     * @return ResponseVO
     */
    ResponseVO getGiftNumsOfAllStatus(final SearchGiftParam param);

    /**
     * Get gift numbers by status.
     *
     * @param param
     * @return CommodityStatusCountVO list
     */
    ResponseVO countGiftByStatus(final SearchGiftParam param);

    /**
     * Get gift detail by id.
     *
     * @param id gift id
     * @return ResponseVO
     */
    ResponseVO getGiftDetail(final String id);

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

    /**
     * Do off shelves a gift.
     *
     * @param id gift id
     * @param reason
     *
     * @return ResponseResult
     */
    ResponseResult offShelves(final String id, final String reason);

    /**
     * Add stock to gift.
     *
     * @param id gift id
     * @param stock
     *
     * @return ResponseVO
     */
    ResponseVO addStock(final String id, final Integer stock);

    /**
     * Audit a gift.
     *
     * @param id gift id
     * @param pass
     *
     * @return ResponseVO
     */
    ResponseVO auditGift(final String id, final Boolean pass);

    ResponseVO updateStatus(final String id, final Integer status, final String reason, String updateBy);
}
