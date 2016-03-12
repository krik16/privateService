package com.rongyi.rss.activitymanage;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.activitymanage.vo.ActivityInfoVO;
import com.rongyi.easy.merchantactivity.param.SearchMerchActivityListParam;
import com.rongyi.easy.merchantactivity.vo.MerchantEnrollGoodsVO;

import java.util.List;

/**
 * create by com.rongyi.rss.activitymanage ideaworkspace :author lijing 摩店后台报名
 * 活动接口 User:lijing DATE : 2016/3/10 TIME : 13:59 ideaworkspace.
 */
public interface RoaMerchantActivityService {
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
	public int registerWill(int activityId, String shopId, String userId);

	/**
	 * 活动报名
	 *
	 * @param activityId
	 *            活动Id
	 * @param goodsId
	 *            商品/卡劵Id
	 * @param userId
	 *            当前用户Id
	 * @param userName
	 *            当前用户名称
	 *
	 * @return 1：成功；0：失败
	 */
	public int register(int activityId, String goodsId, String shopId, String userId, String userName);

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
	public ResponseVO registerList(int activityId, String shopId, int currentPage, int pageSize);

	/**
	 * 活动报名商品（优惠劵）报名信息
	 */
	public MerchantEnrollGoodsVO getRegisterInfo(int activityGoodsId);

	/**
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
	 */
	public int revokeRegister(int activityGoodsId, String userId, String userName);

	/**
	 * 活动邀请列表）
	 *
	 * @param shopId
	 *            店铺Id
	 * @param currentPage
	 *            当前页，从1开始
	 * @param pageSize
	 *            每页数
	 */
	public ResponseVO list(SearchMerchActivityListParam searchMerchActivityListParam);

	/**
	 * 活动详情
	 */
	public ActivityInfoVO info(int activityId);

	/**
	 * 活动邀请删除
	 *
	 * @param activityIds
	 *            活动Ids
	 * @param shopId
	 *            店铺Id
	 * @param userId
	 *            当前用户Id
	 *
	 * @return 1：成功；0：失败
	 */
	public int delete(List<Integer> activityIds, String shopId, String userId);

	/**
	 * 商品（优惠劵）追加库存
	 *
	 * @param activityGoodsId
	 *            活动Id
	 * @param count
	 *            追加库存数
	 *
	 * @return 1：成功；0：失败
	 */
	public int appendStock(int activityGoodsId, int count);
}
