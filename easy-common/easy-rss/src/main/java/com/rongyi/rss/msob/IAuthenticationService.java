package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.param.PrincipalAndCategoryParam;
import com.rongyi.easy.rmmm.vo.AuthSaleVO;

public interface IAuthenticationService {

	
	/**
	 * 店员认证
	 * 
	 * @param param
	 * @param userId
	 * @throws Exception
	 */
	public Boolean addAuthSales(final PrincipalAndCategoryParam param,final Integer userId) throws Exception;
	
	/**
	 * 获取认证店员的信息 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public AuthSaleVO getAuthSale(Integer userId)throws Exception;
}
