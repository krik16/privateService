/** 
* @Title: OrderCancelBySellerEvent.java 
* @Package com.rongyi.osm.knowledge 
* @Description: 卖家在付款后发货前撤销订单的事件
* @since C2C version
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月23日 下午4:05:49 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.osm.knowledge;

/**
 * @author ZhengYl
 *
 */
public class OrderCancelBySellerEvent extends UserEvent {
	private static final long serialVersionUID = -3107656524101208105L;
	
	@Override
	public String getName() {
		return "卖家撤销订单(付款后)";
	}
}
