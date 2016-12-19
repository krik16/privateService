/**
 *
 */
package com.rongyi.rss.tradecenter.osm;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderEventEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.osm.entity.OrderFormExtraEntity;
import com.rongyi.easy.rmmm.param.MaxIntegralParam;
import com.rongyi.easy.rmmm.param.MyDealParam;
import com.rongyi.easy.rmmm.param.MyOrderParam;
import com.rongyi.easy.rmmm.param.TransactionDetailParam;
import com.rongyi.easy.rmmm.vo.*;
import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年10月12日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月12日               1.0              创建文件
 */
public interface IOrderQueryService {

	/**
	 * 我的订单列表
	 *
	 * @return
	 * @throws Exception
	 */
	ParentOrderListVO getMyOrderList(MyOrderParam param, String buyerNum) throws Exception;

	/**
	 * 通过父订单id,获得父订单详情
	 *
	 * @param orderId
	 * @return
	 * @throws Exception
	 */
	ParentOrderVO getParentOrderVO(Integer orderId) throws Exception;

	/**
	 * 我的订单数量
	 *
	 * @return
	 * @throws Exception
	 */
	MyOrderCountVO getMyOrderCount(String buyerNum) throws Exception;

	/**
	 * 我的订单数量
	 *
	 * @return
	 * @throws Exception
	 */
	MyOrderCountVO getMyOrderCountForCart(String buyerNum) throws Exception;

	/**
	 * 交易详情
	 *
	 * @param param
	 * @return
	 * @throws Exception
	 */
	TransactionDetailVO getTransactionDetail(TransactionDetailParam param, String mallUserMid) throws Exception;

	/**
	 * 交易详情
	 *
	 * @param param
	 * @return
	 * @throws Exception
	 */
	List<TransactionDetailVO> getTransactionDetailForCart(TransactionDetailParam param, String mallUserMid) throws Exception;

	/**
	 * 根据订单号查询订单所属店铺、商场，以及买家信息
	 * @param orderNum
	 * @return
	 * @throws Exception
	 */
	ShopMallVO getShopMallVOByOrderNum(String orderNum) throws Exception;

	/**
	 * 根据订单号，物流id获取
	 * @param orderNo
	 * @param expressInfoId
	 * @return
	 * @throws Exception
	 */
	OrderVO getOrderInfo(String orderNo, String expressInfoId) throws Exception;

	/**
	 * 通过父订单号获得
	 *
	 * @param orderNum
	 * @return
	 * @throws Exception
	 */
	OrderFormEntity getOrderFormByOrderNum(String orderNum) throws Exception;

	/**
	 * 根据父订单id获得父订单
	 *
	 * @param orderId
	 * @return
	 * @throws Exception
	 */
	OrderFormEntity getOrderFormByOrderId(Integer orderId) throws Exception;

	/**
	 * 通过父订单号获得子订单集合
	 * @param parentNum
	 * @return
	 */
	List<OrderDetailFormEntity> selectByParentNum(String parentNum) throws Exception;

	/**
	 * 大运营订单详情
	 * @param orderId
	 * @return
	 * @throws Exception
	 */
	ParentOrderVO searchRYOrderDetail(Integer orderId) throws Exception;
	PagingVO<OrderManagerVO> searchListByMap(Map<String, Object> paramsMap) throws Exception;

	/**
	 * 根据事件类型查找订单事件
	 * @param type
	 * @param orderNum
	 * @return
	 * @throws Exception
	 */
	OrderEventEntity getOrderEventByType(String type , String orderNum) throws Exception;

	/**
	 * 获取商品生成订单最大使用积分
	 *
	 * @param param
	 * @return
	 */
	Integer getMaxIntegral(MaxIntegralParam param, double limit, double moenyExchangeScore);

	/**
	 * 分解订单状态路径
	 * @param statusRoute
	 * @return
	 */
	@Deprecated
	Map<String, String> getRouteByStatusRoute(String statusRoute);

	List<OrderFormEntity> selectOrderList(Map param) throws Exception ;

	int selectOrderListCount(String weidianId, String userId) throws Exception;

	/**
	 * 我的交易金额列表
	 *
	 * @return
	 * @throws Exception
	 */
	DetailVO getMyDealAmount(MyDealParam param) throws Exception;

	/**
	 * 我的营业额列表
	 *
	 * @return
	 * @throws Exception
	 */
	DetailVO getMyOnOrderAmount(MyDealParam param) throws Exception;

	/**
	 * 我的在途营业额（总计）
	 *
	 * @return
	 * @throws Exception
	 */
	BigDecimal getMyOnOrderAmountTotal(String userId) throws Exception;

	/**
	 * 我的在途营业额（当日）
	 *
	 * @return
	 * @throws Exception
	 */
	BigDecimal getMyOnOrderAmountDaily(String userId) throws Exception;

	/**
	 * 我的交易佣金列表
	 *
	 * @return
	 * @throws Exception
	 */
	DetailVO getMyDealCommission(MyDealParam param) throws Exception;

	/**
	 * 查找含购物车订单的订单列表方法
	 * @param param 查询参数
	 * @param buyerId 买家id
	 * @return
	 */
	ParentOrderListVO getMyOrderListForCart(MyOrderParam param,String buyerId) throws Exception;

	/**
	 * 查询购物车订单详情
	 * @param orderNo 订单号
	 * @return 订单详情
	 */
	public CartOrderDetailVO getMyOrderDetailForCart(String orderNo) throws Exception;

	/**
	 * 购物车最大使用积分查询接口
	 * @param paramList 查询参数
	 * @param limit 积分使用上限
	 * @param moenyExchangeScore 积分与金额兑换比例
	 * @param platformRebateAmount 抵扣券金额
	 * @return 最大可用积分
	 */
	Map<String,Object> getMaxIntegralForCart(List<MaxIntegralParam> paramList,double limit,double moenyExchangeScore,double platformRebateAmount);

	/**
	 * 根据购物车订单号 查询中订单号集合
	 * @param cartOrderNo 购物车订单号
	 * @return 中订单号集合
	 */
	List<OrderFormEntity> getShopOrderNoByCartNo(String cartOrderNo);

	/**
	 * 根据订单号查询订单收货地址
	 * @param orderNo
	 * @return
	 */
	OrderFormExtraEntity getNewAddressByOrderNo(String orderNo);

	/**
	 * 我的交易金额明细
	 *
	 * @param orderNo 订单号
	 * @return
	 * @throws Exception
	 */
	public DetailListVO getMyDealAmountDetail(String orderNo) throws Exception;

	/**
	 * 我的交易佣金详情
	 *
	 * @param orderNo 订单号
	 * @return
	 * @throws Exception
	 */
	public DetailListVO getMyDealCommissionDetail(String orderNo) throws Exception;

	/**
	 * 我的拼团订单
	 * @param  activityId 活动id
	 * @param  activityRoundId 活动团编号
	 * @param  buyerNum 用户id
	 * @throws Exception
	 */
	String getOrderNoForPintuan(Integer activityId,Long activityRoundId, String buyerNum) throws Exception;

	/**
	 * 查询订单分销数据
	 * @param params {"status":"1 支付成功,2 确认收货,3 订单取消","orderNo":"订单号"
	 *               "type":"事件类型 2 支付成功,4 确认收货,7 超时未确认收货,6 超时未发货退款,23 卖家取消订单退款"}
	 */
	public Map<String, Object> getCommodityOrderPush(JSONObject params);
}
