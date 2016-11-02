package com.rongyi.rss.bsoms;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.bsoms.entity.BIndustry;
import com.rongyi.easy.bsoms.entity.BIndustryVersion;
import com.rongyi.easy.ryoms.merchant.param.IndustrySaveParam;
import com.rongyi.easy.ryoms.merchant.param.IndustrySearchParam;
import com.rongyi.easy.ryoms.merchant.param.IndustryVersionParam;
import com.rongyi.easy.ryoms.merchant.vo.IndustryInfoVO;

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
	
	/**
	 * 保存行业数据
	 * @param industrySaveParam
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	Map<String,Object> saveIndustryAll(IndustrySaveParam industrySaveParam,Integer userId) throws Exception;
	
	/**
	 * 修改行业数据
	 * @param industrySaveParam
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	Map<String,Object> editIndustryAll(IndustrySaveParam industrySaveParam,Integer userId) throws Exception;
	
	/**
	 * 获取所有商家权限
	 * @param map
	 * @return
	 * @throws Exception
	 */
	List<Map> getAllClassifiedAuths()throws Exception;
	
	/**
	 * 修改版本名字
	 * @param industryVersionParams
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	Map<String,Object> editIndustryVersion(List<IndustryVersionParam> industryVersionParams,Integer userId) throws Exception;
	
	IndustryInfoVO getFullIndustryInfo(Integer industryId,String type) throws Exception;
	
	List<BIndustryVersion> getVersionsByIndustryId(Integer industryId) throws Exception;
}
