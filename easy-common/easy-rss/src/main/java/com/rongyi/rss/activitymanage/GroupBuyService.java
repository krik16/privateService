package com.rongyi.rss.activitymanage;

import java.util.List;

import com.rongyi.easy.activitymanage.vo.groupBuy.GroupBuyGoodSimpleInfo;
import com.rongyi.easy.activitymanage.vo.groupBuy.GroupInfo;
import com.rongyi.easy.activitymanage.vo.groupBuy.GroupyBuyActivitySimpleInfo;

public interface GroupBuyService {
	
/////----------------H5 接口 start
	/***
	 * 获取拼团活动简要信息
	 * @param activityId
	 * @return
	 */
	GroupyBuyActivitySimpleInfo getGroupyBuyActivitySimpleInfo(int activityId);
	
	/***
	 * 获取拼团活动商品列表
	 * @param currentPage
	 * @param pageSize
	 * @param activityId
	 * @return
	 */
	List<GroupBuyGoodSimpleInfo> getGroupBuyActivityGoodsList(int currentPage,int pageSize,int activityId);
	
	
	
	/***
	 * 参团商品详情
	 * @param goodId
	 * @param activityId
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
	 *  @param from  0微信,1容易逛------------------
	 * @return
	 */
	int  beginGroup(int activityId,String goodId,String goodSpecId,String userId,String openId,String userNick,String userIcon,int from);
	
	/**
	 * 参团:异常情况返回负数,   正常情况返回团编号,
	 * @param groupId
	 * @param goodId
	 * @param goodSpecId
	 * @param activityId
	 * @param userId
	 * @param userNick
	 * @param userIcon
	 * @param from  0微信,1容易逛------------------
	 * @return
	 */
	int  joinGroup(int activityId,int groupId,String goodId,String goodSpecId,String userId,String openId,String userNick,String userIcon,int from);
	
	
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
	 * 
	 * @param groupId
	 * @return
	 */
	GroupInfo getGroupInfo(int groupId);


	/**
	 *拼团时间到了,人数不够,退团接口
	 * @param groupId
	 * @return
	 */
	boolean groupTimeOut(int groupId);

	
	
	
/////----------------H5 接口 end
	
	
	
}
