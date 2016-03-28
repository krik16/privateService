package com.rongyi.rss.msob;

import java.util.List;

import com.rongyi.easy.rmmm.vo.ExpressDataVO;

public interface IExpressPushInfoService {
	
	/**
	 * 获取快递100推送的信息
	 * @param expressOrderId 物流信息主键id
	 * @return
	 * @throws Exception
	 */
	public List<ExpressDataVO> getExpressDataVO(String expressOrderId) throws Exception;

}
