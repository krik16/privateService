/**
 * 
 */
package com.rongyi.rss.tradecenter.osm;

import com.rongyi.easy.rmmm.param.MyOrderParam;
import com.rongyi.easy.rmmm.param.TransactionDetailParam;
import com.rongyi.easy.rmmm.vo.BuyerVO;
import com.rongyi.easy.rmmm.vo.MyOrderCountVO;
import com.rongyi.easy.rmmm.vo.OrderVO;
import com.rongyi.easy.rmmm.vo.ParentOrderListVO;
import com.rongyi.easy.rmmm.vo.ParentOrderVO;
import com.rongyi.easy.rmmm.vo.ShopMallVO;
import com.rongyi.easy.rmmm.vo.TransactionDetailVO;

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

}
