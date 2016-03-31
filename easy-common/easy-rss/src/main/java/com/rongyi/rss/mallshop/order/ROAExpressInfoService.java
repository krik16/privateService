package com.rongyi.rss.mallshop.order;

import com.rongyi.easy.rmmm.param.ExpressListParam;
import com.rongyi.easy.rmmm.vo.ExpressListVO;

public interface ROAExpressInfoService {
	
	/**
	 * 快递公司列表
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ExpressListVO getExpress(ExpressListParam param) throws Exception;

}
