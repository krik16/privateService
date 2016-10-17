package com.rongyi.rss.tradecenter.osm;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.rmmm.param.OrderDealedParam;
import com.rongyi.easy.rmmm.param.RequestPaymentParam;
import com.rongyi.easy.rmmm.param.SalerDeliveryParam;
import com.rongyi.easy.rmmm.param.SubmitOrderParam;
import com.rongyi.easy.rmmm.param.user.OrderAddressParam;

import java.util.List;

public interface IOrderService {
	
	/**
	 * 订单操作关闭订单API
	 *
	 * @param param 订单参数
	 * @return ResponseResult
	 */
	ResponseResult orderColse(OrderDealedParam param);
	
	/**
	 * 卖家发货
	 * 
	 * @param param 发货参数
	 * @return ResponseResult
	 */
	ResponseResult salerDelivery(SalerDeliveryParam param);
	
	/**
	 * 买家确认收货
	 * @param param 收货参数
	 * @return ResponseResult
	 */
	ResponseResult confirmOrder(OrderDealedParam param);
	
	/**
	 * 申请支付
	 * 
	 * @param param 支付参数
	 * @return ResponseResult
	 */
	ResponseResult requestPayment(RequestPaymentParam param);
	
	/**
	 * c2c卖家修改订单价格
	 * @param param 改价参数
	 * @return ResponseResult
	 */
	ResponseResult changeOrderPrice(OrderDealedParam param);
	
	/**
	 * 卖家撤销订单API
	 * 
	 * @param param 订单参数
	 * @return ResponseResult
	 */
	ResponseResult repealOrder(OrderDealedParam param);

	/**
	 * 卖家撤销订单API(批量)
	 *
	 * @param paramList 订单参数
	 * @return ResponseResult
	 */
	ResponseResult repealOrderBatch(List<OrderDealedParam> paramList);
	
	/**
	 * c2c提交订单API
	 * 
	 * @param submitOrderParam 订单参数
	 * @return ResponseResult
	 */
	ResponseResult commitOrder(SubmitOrderParam submitOrderParam, String buyerNum);
	
	/**
	 * 把评价状态设置为已评价
	 * 
	 * @param id 订单id
	 */
	ResponseResult updateOrderIsCommentById(Integer id);

	/**
	 * @Description: 更新订单是否已付款到导购的虚拟账号
	 * @param: isPayVa 0:未打款(默认)，1:对私(打款到导购虚拟账号)，2:对公(通过对账单结算)
	 * @Author:  柯军
	 **/
	ResponseResult updateOrderIsPayVa(Integer id,byte isPayVa);

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
	 * @param param
	 * @return ResponseVO
	 */
	ResponseVO changeBuyerAddress(OrderAddressParam param);

	/**
	 * 修改拼团状态
	 * @param activityId 活动id
	 * @param activityRoundId 团编号
	 * @param status 团状态
	 * @throws Exception
	 */
	void pintuanActivityStatusChange(Integer activityId, Integer activityRoundId, Integer status) throws Exception;
}
