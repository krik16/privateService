package com.rongyi.rss.msob;

import java.util.List;

import com.rongyi.easy.rmmm.vo.ExpressDataVO;
import com.rongyi.easy.rmmm.vo.ExpressPushResult;
import com.rongyi.easy.rmmm.vo.ExpressPushVO;

public interface IExpressPushInfoService {
	
	/**
	 * 获取快递100推送的信息
	 * @param expressOrderId 物流信息主键id   source 1是容易逛  2 是商家后台
	 * @return
	 * @throws Exception
	 */
	public ExpressPushVO getExpressPushVO( String expressOrderId,String source) throws Exception;
	
	/**
	 * 快递100推送快递数据 
	 * @param param=body&sign=MD5(param+salt)
	 * @return
	 * @throws Exception
	 */
	public ExpressPushResult  expressPushByKuaidi100(String param,String sign) throws Exception;

}
