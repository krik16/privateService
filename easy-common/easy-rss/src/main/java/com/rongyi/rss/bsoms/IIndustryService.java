package com.rongyi.rss.bsoms;

import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.bsoms.entity.BIndustry;
import com.rongyi.easy.ryoms.merchant.param.IndustrySearchParam;

public interface IIndustryService {
	Integer saveOrUpdate(BIndustry industry) throws Exception;
	
	/**
	 * 分页数据
	 * @param paramsMap
	 * @return
	 * @throws Exception
	 */
	PagingVO<?> searchPagingList(IndustrySearchParam industrySearchParam) throws Exception;
	
	/**
	 * 分页数量
	 * @param paramsMap
	 * @return
	 * @throws Exception
	 *//*
	Integer pagingCount(Map<String, Object> paramsMap) throws Exception;*/

	/**
	 * 主键查询
	 * @param id
	 * @return
	 */
	BIndustry getIndustryById(Integer id);
	
}
