package com.rongyi.rss.tradecenter.osm;

import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.tradecenter.param.OsmOrderQueryParam;

import java.util.Map;

public interface IMerchantOsmOrderService
{
	
	/**
	 * 订单列表查询
	 *
	 * @param param 查询参数
	 * @param userInfo 查询用户
	 */
	public Map<String,Object> queryOsmOrder(OsmOrderQueryParam param, SessionUserInfo userInfo);

}
