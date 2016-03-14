package com.rongyi.rss.activitymanage;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.merchantactivity.param.SearchMerchActivityListParam;
import com.rongyi.easy.merchantactivity.vo.MerchantEnrollDetailVO;

import java.util.List;

/**
 * create by com.rongyi.rss.activitymanage ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/11
 * TIME : 11:16
 * ideaworkspace.
 */
public interface ShopCartMerchantActivityService {
    /**
     * 活动报名意愿
     *
     * @param activityId
     *            活动Id
     * @param shopId
     *            店铺Id
     * @param userId
     *            当前用户Id
     *
     * @return 1：成功；0：失败
     */
    public Boolean enrollWill(int activityId, String shopId, String userId,String userName);

/*    *//**
     * 活动报名
     *
     * @param activityId
     *            活动Id
     * @param goodsId
     *            商品/卡劵Id
     * @param userId
     *            当前用户Id
     *
     * @return true：成功；false：失败
     *//*
    public boolean register(int activityId, String goodsId, String shopId, int userId);

    *//**
     * 活动报名列表（卡劵列表）
     *
     * @param activityId
     *            活动Id
     * @param shopId
     *            店铺Id
     * @param currentPage
     *            当前页，从1开始
     * @param pageSize
     *            每页数
     * @return
     *//*
    public List<RegisterGoodsVO> registerList(int activityId, String shopId, int currentPage, int pageSize);

    *//**
     * 活动报名商品（优惠劵）状态
     *//*
    public RegisterGoodsVO getRegisterStatus(int activityGoodsId);

    *//**
     * 取消报名（撤销报名）
     *
     * @param activityId
     *            活动Id
     * @param goodsId
     *            商品/卡劵Id
     * @param shopId
     *            店铺Id
     * @param userId
     *            当前用户Id
     *
     * @return 1：成功；0：失败
     *//*
    public int revokeRegister(int activityId, String goodsId, String shopId, int userId);*/

    /**
     * 活动邀请列表）
     *@author lijing
     * @param searchMerchActivityListParam 1
     */
    public ResponseVO searchMerchantActivityList(SearchMerchActivityListParam searchMerchActivityListParam);

    /**
     * 活动详情
     */
    public MerchantEnrollDetailVO searchMerchantActivityDetail(int activityId,String shopId);

    /**
     * 活动邀请删除
     *
     * @param activityIds
     *            活动Ids
     * @param userId
     *            当前用户Id
     *
     * @return 1：成功；0：失败
     */
    public Boolean delete(List<Integer> activityIds,String shopId, String userId,String userName);

   /* *//**
     * 商品（优惠劵）追加库存
     *
     * @param activityId
     *            活动Id
     * @param goodsId
     *            商品/卡劵Id
     * @param shopId
     *            店铺Id
     * @param number
     *            追加库存数
     * @param userId
     *            当前用户Id
     *
     * @return 1：成功；0：失败
     *//*
    public int appendStock(int activityId, String goodsId, String shopId, int number, int userId);*/
}
