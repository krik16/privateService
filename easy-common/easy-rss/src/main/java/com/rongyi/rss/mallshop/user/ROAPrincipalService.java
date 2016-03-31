package com.rongyi.rss.mallshop.user;

import com.rongyi.easy.rmmm.param.PrincipalAndCategoryParam;

public interface ROAPrincipalService {

	/**
	 * 添加负责人
	 * 注：添加负责人使用
	 * @param param
	 * @throws Exception
	 */
	public void insertPrincipal(final PrincipalAndCategoryParam param) throws Exception;
}
