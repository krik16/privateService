package com.rongyi.rss.mallshop.order;

import com.rongyi.easy.rmmm.param.SalerOrderParam;
import com.rongyi.easy.rmmm.vo.SalerOrderListVO;
import com.rongyi.easy.rmmm.vo.SalerParentOrderVO;
import com.rongyi.easy.rmmm.vo.SellerOrderPriceChangeVO;

import java.math.BigDecimal;
import java.util.Date;

public interface ROASalerOrderService {

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
	 * @param userId
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

}
