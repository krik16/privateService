package com.rongyi.rss.activitymanage;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.activity.entity.GroupStockParam;

import com.rongyi.easy.activitymanage.vo.groupBuy.*;

import com.rongyi.easy.activitymanage.param.CommodityViewCon;
import com.rongyi.easy.activitymanage.param.ViewControllerVo;
import com.rongyi.easy.activitymanage.vo.groupBuy.GroupBuyGoodSimpleInfo;
import com.rongyi.easy.activitymanage.vo.groupBuy.GroupDetail;
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

	/**
	 * 获取拼团活动商品总数
	 * @param activityId
	 * @return
	 */
	int getGroupBuyActivityGoodsCount(int activityId);



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
	long  beginGroup(int activityId,String goodId,String goodSpecId,String userId,String openId,String userNick,String userIcon,int from,String phone) throws Exception;

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
	long  joinGroup(int activityId,long groupId,String goodId,String goodSpecId,String userId,String openId,String userNick,String userIcon,int from,String phone);


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
	boolean noticePaymentResult(int activityId,long groupId,String goodId,String goodSpecId,String userId,String orderNo,boolean paymentResult) throws Exception;



	/**
	 *
	 * @param groupId
	 * @return
	 */
	GroupInfo getGroupInfo(long groupId);


	/**
	 *拼团时间到了,人数不够,退团接口
	 *
	 * @return
	 */
	void groupTimeOut() throws Exception;

	/**
	 * 已有多少人参团，起始数字为50-200之间随机生成，活动发布成功后显示，之后按PV数累计
	 * @param activityId
	 * @param goodId
	 */
	void    addGroupRandomNumByPV(int activityId,String goodId);

	/**
	 * 获取用户对某个商品是否超出  开参团限制数量,
	 * @param groupId
	 * @param userId
	 * @return CheckLimitResult
	 */
	CheckLimitResult isUserCanJoinOrOpenGroup(long groupId,String userId);


	List<ControllerViewDownGroupVo> searchGroup(GroupSearch groupSearch);

	Integer searchGroupCount(GroupSearch groupSearch);

	/**
	 * 检查用户开关团限制
	 * @param activityId
	 * @param goodId
	 * @param userId
	 * @return
	 */
	List<CheckLimitResult> checkLimit(int activityId,String goodId,String userId);


/////----------------H5 接口 end

	/**
	 * 活动结束，增加拼团库存，并将拼团库存回滚到商品库存
	 */
	public  boolean returnGroupStock(List<GroupStockParam> params);

	/**
	 * 批量减少拼团活动库存操作
	 * @param params
	 * @return
	 */
	public boolean reduceGroupStock(List<GroupStockParam> params);

	public CommodityViewCon countAllByActivityId(Map<String ,Object> params);

}
