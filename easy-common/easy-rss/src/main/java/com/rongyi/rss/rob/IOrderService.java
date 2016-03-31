package com.rongyi.rss.rob;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;

import java.util.List;
import java.util.Map;

public interface IOrderService {

	/**
	 * 提交订单API
	 * @param orderFormEntity
	 * @param detailFormEntities
	 * @return
	 */
	public ResponseResult submitOrder(String orderNum,OrderFormEntity orderFormEntity, List<OrderDetailFormEntity> detailFormEntities) throws Exception;
	
	/**
	 * 订单操作关闭订单API
	 * @param map
	 * @return
	 */
	public ResponseResult orderColse(Map<String,Object> map) throws Exception;

	/**
	 * 订单操作修改价格
	 * @param map
	 * @return
	 */
	public ResponseResult orderPriceChange(Map<String,Object> map) throws Exception;
	/**
	 * 买家确认收货
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public ResponseResult confirmOrder(Map<String,Object> map) throws Exception;

	/**
	 * 卖家发货
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public ResponseResult salerDelivery(Map<String, Object> map) throws Exception;
	
	/**
	 * 申请支付
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public ResponseResult requestPayment(Map<String,Object> map) throws Exception;
}
