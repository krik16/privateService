package com.rongyi.rss.tradecenter.osm;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.rmmm.param.MaxIntegralParam;
import com.rongyi.easy.rmmm.param.OrderDealedParam;
import com.rongyi.easy.rmmm.param.RequestPaymentParam;
import com.rongyi.easy.rmmm.param.SalerDeliveryParam;
import com.rongyi.easy.rmmm.param.SubmitOrderParam;
import com.rongyi.easy.rmmm.vo.BuyerVO;
import com.rongyi.easy.rmmm.vo.OrderVO;
import com.rongyi.easy.rmmm.vo.ShopMallVO;

public interface IOrderService {
	
	/**
	 * 订单操作关闭订单API
	 *
	 * @param param
	 * @return
	 */
	public ResponseResult orderColse(OrderDealedParam param);
	
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
	 * 把评价状态设置为已评价
	 * 
	 * @param id
	 * @throws Exception
	 */
	public ResponseResult updateOrderIsCommentById(Integer id);
	

}
