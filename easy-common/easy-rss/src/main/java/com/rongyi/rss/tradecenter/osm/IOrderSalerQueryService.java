/**
 * 
 */
package com.rongyi.rss.tradecenter.osm;

import com.rongyi.easy.rmmm.param.SalerOrderParam;
import com.rongyi.easy.rmmm.vo.SalerOrderListVO;
import com.rongyi.easy.rmmm.vo.SalerParentOrderVO;
import com.rongyi.easy.rmmm.vo.SellerOrderPriceChangeVO;

import java.math.BigDecimal;
import java.util.Date;

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
	 * 传入查询起始时间，统计新增收入与待处理订单数量
	 * @param beginDate: 查询起始时间
	 * @return
	 */
	int getSalerToProcess(Date beginDate);
	
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
	 * @return
	 * @throws Exception
	 */
	public SalerParentOrderVO getParentOrderVO(Integer orderId) throws Exception;

	/**
	 * 卖家改价预览
	 * @param orderNo 订单号
	 * @param newOrderPrice 新的订单价格
	 * @return
	 * @throws Exception
	 */
	SellerOrderPriceChangeVO getPriceChangeReview(String orderNo,BigDecimal newOrderPrice) throws Exception;

	/**
	 * 昨日订单数统计
	 * @param sellerId 卖家id
	 * @param sellerType 1是导购 2是买手
	 * @param shopId 店铺id
	 * @return 订单数
	 * @throws Exception
	 */
	Integer countOrderByParam(String sellerId,Integer sellerType,String shopId) throws Exception;
}
