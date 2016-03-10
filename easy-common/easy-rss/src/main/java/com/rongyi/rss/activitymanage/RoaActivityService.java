package com.rongyi.rss.activitymanage;

import java.util.List;

import com.rongyi.easy.activitymanage.vo.ActivityInfoVO;
import com.rongyi.easy.activitymanage.vo.RegisterGoodsVO;

/**
 * 活动二期APP端接口
 * 
 * @author wangjianhua
 * @date 2016-03-10
 */
public interface RoaActivityService {

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
	public int registerWill(int activityId, String shopId, int userId);

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
	 * @return 1：成功；0：失败
	 */
	public int register(int activityId, String goodsId, String shopId, int userId);

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
	public List<RegisterGoodsVO> registerList(int activityId, String shopId, int currentPage, int pageSize);

	/**
	 * 活动报名商品（优惠劵）状态
	 */
	public RegisterGoodsVO getRegisterStatus(int activityGoodsId);

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
	public int revokeRegister(int activityId, String goodsId, String shopId, int userId);

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
	public List<ActivityInfoVO> list(String shopId, int currentPage, int pageSize);

	/**
	 * 活动详情
	 */
	public ActivityInfoVO info(int activityId);

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
	public int delete(List<Integer> activityIds, int userId);

	/**
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
	 */
	public int appendStock(int activityId, String goodsId, String shopId, int number, int userId);

}
