package com.rongyi.rss.shop;

import java.util.List;

import com.rongyi.easy.entity.BrandEntity;

public interface ROABrandService {
	/**
	 * 模糊查询品牌
	 * @param name
	 * @param currpage
	 * @param pageSize
	 * @return
	 */
	public List<BrandEntity> searchBrand(String name,int type,int currpage,int pageSize);
	
	/**
	 * 模糊查询品牌数量
	 * @param name
	 * @return
	 */
	public Long searchBrandCount(String name);
	
	/**
	 * 根据id查询品牌
	 * @param id
	 * @return
	 */
	public BrandEntity searchBrandById(String id);
}
