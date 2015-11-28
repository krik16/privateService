package com.rongyi.rss.mcmc;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.easy.mcmc.TotalCommodity;



public interface ITotalCommodityService {
	
	public TotalCommodity  findByTotalCommodityId(String id);
	
	public void updateTotalCommodity(TotalCommodity toalCommodity);
	
	public void updateOrDeleteCommodity(List<ObjectId> ids,Integer type,String reason);
	
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
	
	List<TotalCommodity>  findByTotalCommodityCode(List<String> codes);
}
