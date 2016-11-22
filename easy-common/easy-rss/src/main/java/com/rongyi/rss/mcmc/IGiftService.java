package com.rongyi.rss.mcmc;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.param.SearchGiftParam;
import com.rongyi.easy.mcmc.vo.CommodityStatusCountVO;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.mcmc.vo.GiftDetailVO;
import com.rongyi.easy.mcmc.vo.GiftVO;

import java.util.List;

/**
 * 礼品Service
 *
 * @author yaoyiwei
 * @date 2016-11-20
 * @version 1.0
 *
 */
public interface IGiftService {

    /**
     * Get gift list.
     *
     * @param param
     * @return payment list
     */
    List<GiftVO> getGiftList(final SearchGiftParam param);

    /**
     * Get gift numbers of all status.
     *
     * @param param
     * @return CommodityStatusCountVO list
     */
    List<CommodityStatusCountVO> getGiftNumsOfAllStatus(final SearchGiftParam param);

    /**
     * Get gift numbers by status.
     *
     * @param param
     * @return CommodityStatusCountVO list
     */
    CommodityStatusCountVO countGiftByStatus(final SearchGiftParam param);

    /**
     * Get gift detail by id.
     *
     * @param id gift id
     * @return GiftDetailVO object
     */
    GiftDetailVO getGiftDetail(final String id);

    /**
     * Create a gift.
     *
     * @param gift
     *
     * @return ResponseResult
     */
    ResponseVO createGift(CommodityVO gift);

    /**
     * Edit a gift.
     *
     * @param gift
     *
     * @return edit message string
     */
    String editGift(CommodityVO gift);
}
