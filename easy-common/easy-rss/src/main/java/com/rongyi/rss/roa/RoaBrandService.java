package com.rongyi.rss.roa;

import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.roa.entity.BrandEntity;


/**
 * 品牌相关接口
 * @author Ventures
 *
 */
public interface RoaBrandService {

	/**
	 * 条件
	 * @param params
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	PagingVO<BrandEntity> getBrandListByMap(Map<String, Object> params, Integer currentPage, Integer pageSize) throws Exception;
	
}
