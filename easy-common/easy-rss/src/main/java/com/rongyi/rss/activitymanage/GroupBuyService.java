package com.rongyi.rss.activitymanage;

import java.util.List;

import com.rongyi.easy.activitymanage.vo.groupBuy.GroupBuyGoodSimpleInfo;
import com.rongyi.easy.activitymanage.vo.groupBuy.GroupInfo;
import com.rongyi.easy.activitymanage.vo.groupBuy.GroupyBuyActivitySimpleInfo;

public interface GroupBuyService {
	
/////----------------H5 接口 start
	/***
	 * 获取拼团活动简要信息
	 * @param groupBuyId
	 * @return
	 */
	GroupyBuyActivitySimpleInfo getGroupyBuyActivitySimpleInfo(int activityId);
	
	/***
	 * 获取拼团活动商品列表
	 * @param currentPage
	 * @param pageSize
	 * @param groupBuyId
	 * @return
	 */
	List<GroupBuyGoodSimpleInfo> getGroupBuyActivityGoodsList(int currentPage,int pageSize,int activityId);
	
	
	
	/***
	 * 参团商品详情
	 * @param goodId
	 * @param groupBuyId
	 * @return
	 */
	GroupBuyGoodSimpleInfo getGroupBuyGoodSimpleInfo(String goodId,int activityId);
	
	
	/**
	 * 按照活动id 和商品id  查询该商品正在开始中的团
	 * @param goodId
	 * @param activityId
	 * @return获取商品下的所有团，按成团所剩人数倒序排列，然后在最小成团人数里面随机选择两个团
	 */
	List<GroupInfo> getGroupByGood(String goodId,int activityId);
	

	/**
	 * 开团:异常情况返回负数,   正常情况返回团编号
	 * @param goodId
	 * @param goodSpecId
	 * @param activityId
	 * @param userId
	 * @param userNick
	 * @param userIcon
	 * @return
	 */
	int  beginGroup(int activityId,String goodId,String goodSpecId,String userId,String openId,String userNick,String userIcon);
	
	/**
	 * 参团:异常情况返回负数,   正常情况返回团编号,
	 * @param groupId
	 * @param goodId
	 * @param goodSpecId
	 * @param activityId
	 * @param userId
	 * @param userNick
	 * @param userIcon
	 * @return
	 */
	int  joinGroup(int activityId,int groupId,String goodId,String goodSpecId,String userId,String openId,String userNick,String userIcon);
	
	
	/**
	 * 通知支付结果,变更用户参团成功状态,
	 * 发现组团成功后需要触发com.rongyi.rss.tradecenter.osm.IOrderService.pintuanActivityStatusChange
	 * @param groupId
	 * @param goodId
	 * @param goodSpecId
	 * @param activityId
	 * @param userId
	 * @param paymentResult--是否支付成功
	 * @return
	 */
	boolean noticePaymentResult(int activityId,int groupId,String goodId,String goodSpecId,String userId,boolean paymentResult);
	
	
	/**
	 *  库存变更
	 * @param activityId
	 * @param groupId
	 * @param goodId
	 * @param goodSpecId
	 * @param count   增加/扣减库存数
	 * @param type 0 增加 1 减少
	 * @return
	 */
	boolean updateStock(int activityId,int groupId,String goodId,String goodSpecId,int count,int type);
	
	
	
	
	
/////----------------H5 接口 end
	
	
	
}
