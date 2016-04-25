package com.rongyi.rss.mallshop.express;

import com.rongyi.easy.rmmm.vo.ExpressPushVO;

public interface ROAExpressPushInfoService {
	
	/**
	 * 获取快递100推送的信息
	 * @param expressOrderId 物流信息主键id   source 1是容易逛  2 是商家后台
	 * @return
	 * @throws Exception
	 */
	public ExpressPushVO getExpressPushVO( String expressOrderId,String source) throws Exception;

}
