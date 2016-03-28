package com.rongyi.rss.msob;

import java.util.List;

import com.rongyi.easy.rmmm.vo.ExpressDataVO;
import com.rongyi.easy.rmmm.vo.ExpressPushResult;

public interface IExpressPushInfoService {
	
	/**
	 * 获取快递100推送的信息
	 * @param expressOrderId 物流信息主键id
	 * @return
	 * @throws Exception
	 */
	public List<ExpressDataVO> getExpressDataVO(String expressOrderId) throws Exception;
	
	/**
	 * 快递100推送快递数据 
	 * @param param=body&sign=MD5(param+salt)
	 * @return
	 * @throws Exception
	 */
	public ExpressPushResult  expressPushByKuaidi100(String param,String sign) throws Exception;

}
