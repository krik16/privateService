package com.rongyi.rss.tradecenter;

import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.tradecenter.param.CouponOrderQueryParam;

import java.util.Map;

public interface IMerchantCouponOrderService
{
	
	/**
	 * 订单列表查询
	 *
	 * @param param 查询参数
	 * @param userInfo 查询用户
	 */
	Map<String,Object> queryCouponOrder(CouponOrderQueryParam param, SessionUserInfo userInfo);

}
