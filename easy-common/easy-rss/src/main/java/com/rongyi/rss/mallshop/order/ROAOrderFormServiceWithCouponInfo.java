/** 
* @Title: ROAOrderFormServiceWithCouponInfo.java 
* @Package com.rongyi.rss.mallshop.order 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年7月7日 下午3:44:49 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.mallshop.order;

import com.rongyi.easy.rmmm.vo.OrderWithCouponInfoVO;

/**
 * @author ZhengYl
 *
 */
public interface ROAOrderFormServiceWithCouponInfo {
	/**
	 * 根据订单号查询订单和订单使用的红包信息
	 * 
	 * @author ZhengYl
	 * @date 2015年7月7日 下午3:58:08 
	 * @param orderNo
	 * @return
	 */
	public OrderWithCouponInfoVO getOrderCouponInfo(String orderNo) throws Exception;
}
