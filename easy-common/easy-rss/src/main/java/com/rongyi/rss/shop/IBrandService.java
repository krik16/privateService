package com.rongyi.rss.shop;

import java.util.List;

import com.rongyi.easy.entity.BrandEntity;
import com.rongyi.easy.rmmm.entity.BrandInfoEntity;

public interface IBrandService {
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
	
	/**
	 *
	* @Title: selectBrandByMongoId 
	* @Description: 查询品牌的mysql表信息
	* @param @param brandMid
	* @param @return    设定文件 
	* @return BrandInfoEntity    返回类型 
	* @throws
	 */
	public BrandInfoEntity selectBrandByMongoId(String brandMid);
}
