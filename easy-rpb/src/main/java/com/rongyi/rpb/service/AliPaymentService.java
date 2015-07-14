/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年6月25日下午3:38:15
 * @Description: TODO
 *
 **/

package com.rongyi.rpb.service;

import java.util.Map;

/**	
 * @Author:  柯军
 * @Description: 支付宝服务 
 * @datetime:2015年6月25日下午3:38:15
 *
 **/

public interface AliPaymentService {

	/**	
	 * @Description: 获得支付宝签名 
	 * @param orderMaps
	 * @param payNo
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年6月25日下午4:07:08
	 **/
	public Map<String, Object> getZhiFuBaoSign(Map<String, Object> orderMaps, String payNo);
	
	
}
