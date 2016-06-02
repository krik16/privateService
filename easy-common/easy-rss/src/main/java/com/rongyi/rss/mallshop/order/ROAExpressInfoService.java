package com.rongyi.rss.mallshop.order;

import java.util.List;

import com.rongyi.easy.rmmm.param.ExpressListParam;
import com.rongyi.easy.rmmm.vo.ExpressListVO;
import com.rongyi.easy.rmmm.vo.ExpressVO;

public interface ROAExpressInfoService {
	
	/**
	 * 快递公司列表
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ExpressListVO getExpress(ExpressListParam param) throws Exception;
	
	/**
	 * 获取快递公司列表
	 * @param guideId
	 * @return
	 * @throws Exception
	 */
	public List<ExpressVO> selectExpressListByKey(String keyWord) throws Exception;
	
	/**
	 * 获取常用快递公司列表
	 * @param guideId
	 * @return
	 * @throws Exception
	 */
	public List<ExpressVO> selectCommonExpress() throws Exception;

}
