package com.rongyi.rss.mallshop.shop;

import com.rongyi.easy.rmmm.entity.BrandMallEntity;
public interface ROABrandAndMallService {
	/**
	 * 通过mallId,brandId获得
	 * @param brandId
	 * @param mallId
	 * @return
	 */
	public BrandMallEntity getBrandMallByBrandIdAndMallId(Integer brandId,Integer mallId) throws Exception;
	
	/**
	 * 插入商场和品牌的关联信息
	 * 注：添加负责人使用
	 * @param brandId
	 * @param mallId
	 * @return
	 * @throws Exception
	 */
	public int insertBrandMallRef(Integer brandId,Integer mallId) throws Exception;
}
