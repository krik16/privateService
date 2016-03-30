package com.rongyi.rss.activitymanage;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.merchantactivity.param.SearchMerchActivityListParam;
import com.rongyi.easy.merchantactivity.vo.MerchantEnrollDetailVO;
import com.rongyi.easy.merchantactivity.vo.MerchantEnrollGoodsVO;

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

    /**
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
     */
    public boolean enroll(int activityId, String goodsId, String shopId, String userId,String userName);

    /**
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
     */
    public ResponseVO enrollList(int activityId, String shopId, int currentPage, int pageSize);

	/**
	 * 活动报名商品（优惠劵）状态
	 */
	public MerchantEnrollGoodsVO enrollInfo(int activityGoodsId);

	/**
	 * 取消报名（撤销报名）
	 *
	 * @param activityGoodsId
	 *            活动商品Id
	 * @param userId
	 *            当前用户Id
	 * @param userName
	 *            当前用户名称
	 *
	 * @return 1：成功；0：失败
	 */
	public int enrollRevoke(int activityGoodsId, String userId, String userName);
	
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
    public Boolean merchantActivitDelete(List<Integer> activityIds, String shopId,String userId,String userName);

	/**
	 * 商品（优惠劵）追加库存
	 *
	 * @param activityGoodsId
	 *            活动商品Id
	 * 
	 * @return 1：成功；0：失败
	 */
	public int appendStock(int activityGoodsId, int number);
	
	/**
	 * 修改商品（卡劵）详情信息
	 * 
	 * @author wangjianhua
	 * @param activityGoodsId
	 *            活动商品Id
	 * @param title
	 *            标题
	 * @param stockCount
	 *            库存数
	 * @param activityPrice
	 *            活动价（单位：元）
	 * @param userName
	 *            用户名
	 * @return 1：成功；0：失败
	 */
	public int updateActivityGoodsInfo(int activityGoodsId, String title, int stockCount, double activityPrice, String userName);


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

}
