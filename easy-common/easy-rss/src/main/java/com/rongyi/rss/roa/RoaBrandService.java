package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

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
	List<BrandEntity> getBrandListByMap(Map<String, Object> params, Integer currentPage, Integer pageSize) throws Exception;
	
}
