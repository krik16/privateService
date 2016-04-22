/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年6月25日下午3:38:15
 * @Description: TODO
 *
 **/

package com.rongyi.rpb.service;

import com.rongyi.easy.rpb.vo.PaymentEntityVO;
import com.rongyi.easy.rpb.vo.QueryOrderParamVO;

import java.util.Map;

/**	
 * Author:  柯军
 * Description: 支付宝服务
 * datetime:2015年6月25日下午3:38:15
 *
 **/

public interface AliPaymentService {

	/**	
	 *Description: 获得支付宝签名
	 * @param orderMaps orderMaps
	 * @param paymentEntityVO paymentEntityVO
	 * Author:  柯军
	 * datetime:2015年6月25日下午4:07:08
	 **/
	 Map<String, Object> getZhiFuBaoSign(Map<String, Object> orderMaps, PaymentEntityVO paymentEntityVO);
	
	/**	
	 * Description: 查询支付宝订单支付状态
	 * @param tradeNo 交易流水号
	 * @param payNo 付款单号
	 * Author:  柯军
	 * datetime:2015年8月5日上午9:42:53
	 **/
	 QueryOrderParamVO queryOrder(String tradeNo,String payNo);
	
	
}
