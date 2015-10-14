package com.rongyi.rss.tradecenter.osm;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.rmmm.param.*;
import com.rongyi.easy.rmmm.vo.*;

import org.bson.types.ObjectId;

public interface IOrderService {
	
	/**
	 * 生成订单
	 * @param submitOrderParam
	 * @param buyerNum
	 * @return
	 */
	public ResponseResult submitOrder(SubmitOrderParam submitOrderParam, String buyerNum);
	
	/**
	 * 订单操作关闭订单API
	 * 
	 * @param param
	 * @return
	 */
	public ResponseResult orderColse(OrderDealedParam param);
	
	/**
	 * 卖家修改订单价格
	 * @param param
	 * @return
	 */
	public ResponseResult orderPriceChange(OrderDealedParam param);
	
	/**
	 * 我的订单列表
	 * 
	 * @return
	 */
	public ParentOrderListVO getMyOrderList(MyOrderParam param, String buyerNum);
	
	/**
	 * 通过父订单id,获得父订单详情
	 * 
	 * @param orderId
	 * @param orderId
	 * @return
	 */
	public ParentOrderVO getParentOrderVO(Integer orderId);
	
	/**
	 * 卖家发货
	 * 
	 * @param param
	 * @return
	 */
	public ResponseResult salerDelivery(SalerDeliveryParam param);
	
	/**
	 * 买家确认收货
	 * @param param
	 * @return
	 */
	public ResponseResult confirmOrder(OrderDealedParam param);
	
	/**
	 * 申请支付
	 * 
	 * @param param
	 * @return
	 */
	public ResponseResult requestPayment(RequestPaymentParam param);
	
	/**
	 * 我的订单数量
	 * 
	 * @return
	 */
	public MyOrderCountVO getMyOrderCount(String buyerNum);
	
	/**
	 * 交易详情
	 * 
	 * @param param
	 * @return
	 */
	public TransactionDetailVO getTransactionDetail(TransactionDetailParam param, String mallUserMid);
	
	/**
	 * 根据不同的事件，发送不同的数据
	 * 
	 * @param buyerNum
	 * @param orderNum
	 * @param orderEventType
	 * @return
	 */
	public void sendBodyByOrderEventType(ObjectId buyerNum, String orderNum, String orderEventType);
	
	/**
	 * 根据订单号查询订单所属店铺、商场，以及买家信息
	 * @param orderNum
	 * @return
	 */
	public ShopMallVO getShopMallVOByOrderNum(String orderNum);
	
	/**
	 * 根据买家id，收货地址id获取买家信息
	 * @param buyerId
	 * @param addressId
	 * @return
	 */
	public BuyerVO getCustomerInfo(String buyerId, String addressId);
	
	/**
	 * 根据订单号，物流id获取
	 * @param orderNo
	 * @param expressInfoId
	 * @return
	 */
	public OrderVO getOrderInfo(String orderNo, String expressInfoId);
	
	/**
	 * c2c卖家修改订单价格
	 * @param param
	 * @return
	 */
	public ResponseResult changeOrderPrice(OrderDealedParam param);
	
	/**
	 * 卖家撤销订单API
	 * 
	 * @param param
	 * @return
	 */
	public ResponseResult repealOrder(OrderDealedParam param);
	
	/**
	 * c2c提交订单API
	 * 
	 * @param submitOrderParam
	 * @return
	 */
	public ResponseResult commitOrder(SubmitOrderParam submitOrderParam, String buyerNum);
	
	/**
	 * 获取商品生成订单最大使用积分
	 * 
	 * @param param
	 * @return
	 */
	public  Integer getMaxIntegral(MaxIntegralParam param, double limit, double moenyExchangeScore);
	
	/**
	 * 把评价状态设置为已评价
	 * 
	 * @param id
	 * @throws Exception
	 */
	public ResponseResult updateOrderIsCommentById(Integer id) throws Exception;
	

}
