/**
 * 
 */
package com.rongyi.rss.tradecenter.osm;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderEventEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.rmmm.param.MaxIntegralParam;
import com.rongyi.easy.rmmm.param.MyDealParam;
import com.rongyi.easy.rmmm.param.MyOrderParam;
import com.rongyi.easy.rmmm.param.TransactionDetailParam;
import com.rongyi.easy.rmmm.vo.*;

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
	 * @param orderNo
	 * @return
	 * @throws Exception
	 */
	ParentOrderVO getParentOrderVO(String orderNo) throws Exception;
	
	/**
	 * 我的订单数量
	 * 
	 * @return
	 * @throws Exception
	 */
	MyOrderCountVO getMyOrderCount(String buyerNum) throws Exception;
	
	/**
	 * 交易详情
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	TransactionDetailVO getTransactionDetail(TransactionDetailParam param, String mallUserMid) throws Exception;
	
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
    Integer getMaxIntegralForCart(List<MaxIntegralParam> paramList,double limit,double moenyExchangeScore,double platformRebateAmount);


}
