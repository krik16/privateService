/**
 * 
 */
package com.rongyi.rss.tradecenter.osm;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.rmmm.param.MaxIntegralParam;
import com.rongyi.easy.rmmm.param.MyOrderParam;
import com.rongyi.easy.rmmm.param.TransactionDetailParam;
import com.rongyi.easy.rmmm.vo.MyOrderCountVO;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;
import com.rongyi.easy.rmmm.vo.OrderVO;
import com.rongyi.easy.rmmm.vo.ParentOrderListVO;
import com.rongyi.easy.rmmm.vo.ParentOrderVO;
import com.rongyi.easy.rmmm.vo.ShopMallVO;
import com.rongyi.easy.rmmm.vo.TransactionDetailVO;
import com.rongyi.easy.tradecenter.osm.OrderDetailFormEntity;
import com.rongyi.easy.tradecenter.osm.OrderEventEntity;
import com.rongyi.easy.tradecenter.osm.OrderFormEntity;

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
	public ParentOrderListVO getMyOrderList(MyOrderParam param, String buyerNum) throws Exception;
	
	/**
	 * 通过父订单id,获得父订单详情
	 * 
	 * @param orderId
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public ParentOrderVO getParentOrderVO(Integer orderId) throws Exception;
	
	/**
	 * 我的订单数量
	 * 
	 * @return
	 * @throws Exception
	 */
	public MyOrderCountVO getMyOrderCount(String buyerNum) throws Exception;
	
	/**
	 * 交易详情
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public TransactionDetailVO getTransactionDetail(TransactionDetailParam param, String mallUserMid) throws Exception;
	
	/**
	 * 根据订单号查询订单所属店铺、商场，以及买家信息
	 * @param orderNum
	 * @return
	 * @throws Exception
	 */
	public ShopMallVO getShopMallVOByOrderNum(String orderNum) throws Exception;
	
	/**
	 * 根据订单号，物流id获取
	 * @param orderNo
	 * @param expressInfoId
	 * @return
	 * @throws Exception
	 */
	public OrderVO getOrderInfo(String orderNo, String expressInfoId) throws Exception;
	
	/**
	 * 通过父订单号获得
	 * 
	 * @param OrderNum
	 * @return
	 * @throws Exception
	 */
	public OrderFormEntity getOrderFormByOrderNum(String orderNum) throws Exception;
	
	/**
	 * 根据父订单id获得父订单
	 * 
	 * @param orderId
	 * @return
	 * @throws Exception
	 */
	public OrderFormEntity getOrderFormByOrderId(Integer orderId) throws Exception;
	
	/**
	 * 通过父订单号获得子订单集合
	 * @param list
	 * @return
	 */
	public List<OrderDetailFormEntity> selectByParentNum(String parentNum) throws Exception;
	
	public PagingVO<OrderManagerVO> searchListByMap(Map<String, Object> paramsMap) throws Exception;
	
	/**
	 * 根据事件类型查找订单事件
	 * @param type
	 * @param orderNum
	 * @return
	 * @throws Exception
	 */
	public OrderEventEntity getOrderEventByType(String type , String orderNum) throws Exception;
	
	/**
	 * 获取商品生成订单最大使用积分
	 * 
	 * @param param
	 * @return
	 */
	public  Integer getMaxIntegral(MaxIntegralParam param, double limit, double moenyExchangeScore);

}
