package com.rongyi.rss.bsoms;

import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.bsoms.vo.BusinessAccountVO;

/**
 * 账户用户相关
 * @author hebo 2015/07/17
 *
 */
public interface RmmmUserInfoService {

	/**
	 * 分页查询商家账户列表
	 * @param paramsMap
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	PagingVO<BusinessAccountVO> searchAccountListByMap(Map<String, Object> paramsMap, int currentPage, int pageSize);
	
	/**
	 * 资金账户：冻结/解冻
	 * @param userId
	 * @param isSuspended
	 * @return
	 */
	boolean updateAccountSuspended(String userId, boolean isSuspended);
}
