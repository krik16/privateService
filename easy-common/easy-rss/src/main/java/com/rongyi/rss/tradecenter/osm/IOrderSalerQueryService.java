/**
 * 
 */
package com.rongyi.rss.tradecenter.osm;

import com.rongyi.easy.rmmm.param.SalerOrderParam;
import com.rongyi.easy.rmmm.vo.SalerOrderListVO;
import com.rongyi.easy.rmmm.vo.SalerParentOrderVO;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：卖家订单查询
 * time ：2015年10月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月13日               1.0              创建文件
 */
public interface IOrderSalerQueryService {
	
	/**
	 * 卖家版大订单列表
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public SalerOrderListVO getSalerOrderList(SalerOrderParam param,String weidianId) throws Exception;
	
	/**
	 * 卖家版订单详情
	 * @param orderId
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public SalerParentOrderVO getParentOrderVO(Integer orderId) throws Exception;

}
