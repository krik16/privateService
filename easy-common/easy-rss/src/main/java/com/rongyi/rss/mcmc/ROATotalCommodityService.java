package com.rongyi.rss.mcmc;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.mcmc.Commodity;
import org.bson.types.ObjectId;

import com.rongyi.easy.mcmc.TotalCommodity;



public interface ROATotalCommodityService {
	
	public TotalCommodity  findByTotalCommodityId(String id);
	
	public void updateTotalCommodity(TotalCommodity toalCommodity);
	
	public boolean updateOrDeleteCommodity(List<ObjectId> ids,Integer type,String reason,Integer userId);

	/** 
	* @Title: insertTotalCommodity 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param toalCommodity    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public String insertTotalCommodity(TotalCommodity toalCommodity);
	
	/**
	 * 商品列表查询
	 * @param paramMap
	 * @return
	 */
	public List<TotalCommodity> searchCommodity(Map<String,Object> paramMap,int pageSize);
	
	/**
	 * 商品数量查询
	 * @param paramMap
	 * @return
	 */
	public Long searchCommodityCount(Map<String,Object> paramMap);
	
	public void insertTotalCommodityList(List<TotalCommodity> toalCommodities);
	
	public List<TotalCommodity>  findByTotalCommodityCode(List<String> codes,String brandMid);
	
	public Long searchCommodityByCodeAndBrand(String code,String brandMid);


	public Map<String ,Object>  findListForWechat(Map<String ,Object> params);
}
