package com.rongyi.rss.mallshop.user;

import com.rongyi.easy.rmmm.param.PrincipalAndCategoryParam;
import com.rongyi.easy.rmmm.vo.PrincipalAndCategoryVO;

public interface ROAPrincipalAndCategoryService {

	/**
	 * 获取负责人和品类信息
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public PrincipalAndCategoryVO getPrincipalAndCategory(PrincipalAndCategoryParam param, String shopId) throws Exception;
}
