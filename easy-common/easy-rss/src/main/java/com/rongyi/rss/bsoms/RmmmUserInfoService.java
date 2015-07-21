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

	PagingVO<BusinessAccountVO> searchAccountListByMap(Map<String, Object> paramsMap, int currentPage, int pageSize);
	
}
