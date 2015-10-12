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
	 * @throws Exception
	 */
	public ResponseResult submitOrder(SubmitOrderParam submitOrderParam, String buyerNum) throws Exception;
	
	/**
	 * 订单操作关闭订单API
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult orderColse(OrderDealedParam param) throws Exception;
	
	/**
	 * 卖家修改订单价格
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult orderPriceChange(OrderDealedParam param) throws Exception;
	
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
	 * 卖家发货
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult salerDelivery(SalerDeliveryParam param) throws Exception;
	
	/**
	 * 买家确认收货
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult confirmOrder(OrderDealedParam param) throws Exception;
	
	/**
	 * 申请支付
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult requestPayment(RequestPaymentParam param) throws Exception;
	
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
	 * 根据不同的事件，发送不同的数据
	 * 
	 * @param buyerNum
	 * @param orderNum
	 * @param orderEventType
	 * @return
	 * @throws Exception
	 */
	public void sendBodyByOrderEventType(ObjectId buyerNum, String orderNum, String orderEventType) throws Exception;
	
	/**
	 * 根据订单号查询订单所属店铺、商场，以及买家信息
	 * @param orderNum
	 * @return
	 * @throws Exception
	 */
	public ShopMallVO getShopMallVOByOrderNum(String orderNum) throws Exception;
	
	/**
	 * 根据买家id，收货地址id获取买家信息
	 * @param orderNo
	 * @param expressInfoId
	 * @return
	 * @throws Exception
	 */
	public BuyerVO getCustomerInfo(String buyerId, String addressId) throws Exception;
	
	/**
	 * 根据订单号，物流id获取
	 * @param orderNo
	 * @param expressInfoId
	 * @return
	 * @throws Exception
	 */
	public OrderVO getOrderInfo(String orderNo, String expressInfoId) throws Exception;
	
	/**
	 * c2c卖家修改订单价格
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult changeOrderPrice(OrderDealedParam param) throws Exception;
	
	/**
	 * 卖家撤销订单API
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult repealOrder(OrderDealedParam param) throws Exception;
	
	/**
	 * c2c提交订单API
	 * 
	 * @param submitOrderParam
	 * @return
	 * @throws Exception
	 */
	public ResponseResult commitOrder(SubmitOrderParam submitOrderParam, String buyerNum) throws Exception;
	
	/**
	 * 获取商品生成订单最大使用积分
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  Integer getMaxIntegral(MaxIntegralParam param, double limit, double moenyExchangeScore) throws Exception;
	

}
