package com.rongyi.rss.mallshop.order;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.rmmm.param.user.OrderAddressParam;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.rmmm.param.MaxIntegralParam;
import com.rongyi.easy.rmmm.param.MyOrderParam;
import com.rongyi.easy.rmmm.param.OrderDealedParam;
import com.rongyi.easy.rmmm.param.RequestPaymentParam;
import com.rongyi.easy.rmmm.param.SalerDeliveryParam;
import com.rongyi.easy.rmmm.param.SubmitOrderParam;
import com.rongyi.easy.rmmm.param.TransactionDetailParam;
import com.rongyi.easy.rmmm.vo.BuyerVO;
import com.rongyi.easy.rmmm.vo.CartOrderDetailVO;
import com.rongyi.easy.rmmm.vo.MyOrderCountVO;
import com.rongyi.easy.rmmm.vo.OrderVO;
import com.rongyi.easy.rmmm.vo.ParentOrderListVO;
import com.rongyi.easy.rmmm.vo.ParentOrderVO;
import com.rongyi.easy.rmmm.vo.ShopMallVO;
import com.rongyi.easy.rmmm.vo.TransactionDetailVO;

public interface ROAOrderService {

	/**
	 * 传入查询起始时间，统计新增收入与待处理订单数量
	 * @param beginDate: 查询起始时间
	 * @return
	 */
	int getSalerToProcess(Date beginDate);
	
	/**
	 * 生成订单
	 * @param submitOrderParam
	 * @param buyerNum
	 * @return
	 * @throws Exception
	 */
//	public ResponseResult submitOrder(SubmitOrderParam submitOrderParam, String buyerNum) throws Exception;
	
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
//	public ResponseResult orderPriceChange(OrderDealedParam param) throws Exception;
	
	/**
	 * 我的订单列表
	 * 
	 * @return
	 * @throws Exception
	 */
	public ParentOrderListVO getMyOrderList(MyOrderParam param, String buyerNum) throws Exception;
	
	/**
	 * 买家版订单详情
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
	public TransactionDetailVO getTransactionDetail(TransactionDetailParam param,String mallUserMid) throws Exception;
	
	/**
	 * 根据不同的事件，发送不同的数据
	 * 
	 * @param buyerNum
	 * @param orderNum
	 * @param orderEventType
	 * @return
	 * @throws Exception
	 */
//	public void sendBodyByOrderEventType(ObjectId buyerNum, String orderNum, String orderEventType) throws Exception;
	
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
	
	/**
	 * 分解订单状态路径
	 * @param statusRoute
	 * @return
	 */
	public Map<String, String> getRouteByStatusRoute(String statusRoute);
	
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
    CartOrderDetailVO getMyOrderDetailForCart(String orderNo) throws Exception;

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
	 * 购物车订单下单
	 * @param param 下单参数
	 * @param buyerId 用户id
	 * @return ResponseVO
	 */
	ResponseVO commitOrderForCart(SubmitOrderParam param,String buyerId);

	/**
	 * 买家主动关闭订单
	 * @param orderNo 订单号
	 * @return ResponseVO
	 */
	ResponseVO orderColseByBuyer(String orderNo);

	/**
	 * 删除商品订单
	 * @param orderNo 商品订单号
	 * @return ResponseVO
	 */
	ResponseVO delOrderDetail(List<String> orderNo);

	/**
	 * 支付前检查购物车订单总价
	 * @param orderNo 订单号
	 * @return ResponseVO
	 */
	ResponseVO checkTotalPrice(String orderNo);

	/**
	 * 支付前检查购物车中订单状态
	 * @param orderNo 订单号
	 * @return ResponseVO
	 */
	ResponseVO checkOrderStatus(String orderNo);

	/**
	 * 修改买家收货地址
	 * @param orderNo 订单号
	 * @param city 城市
	 * @param province 省市
	 * @param district 区县
	 * @param address 具体地址
	 * @param name 收货人名称
	 * @param phone 收货人手机
	 * @return ResponseVO
	 */
	ResponseVO changeBuyerAddress(OrderAddressParam orderAddressParam);
	
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
	List<TransactionDetailVO> getTransactionDetailForCart(TransactionDetailParam param, String mallUserMid) throws Exception;

}
