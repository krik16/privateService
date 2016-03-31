package com.rongyi.rss.mallshop.express;

import com.rongyi.easy.rmmm.vo.ExpressPushVO;

public interface ROAExpressPushInfoService {
	
	/**
	 * 获取快递100推送的信息
	 * @param expressOrderId 物流信息主键id
	 * @return
	 * @throws Exception
	 */
	public ExpressPushVO getExpressPushVO( String expressOrderId) throws Exception;

}
