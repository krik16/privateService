package com.rongyi.rss.mcmc;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.easy.mcmc.Commodity;



public interface ICommodityService {
	
	/**
	 * 商品列表查询
	 * @param paramMap
	 * @return
	 */
	public List<Commodity> searchCommodity(Map<String,Object> paramMap,int pageSize);
	
	/**
	 * 商品数量查询
	 * @param paramMap
	 * @return
	 */
	public Long searchCommodityCount(Map<String,Object> paramMap);
	
	public void updateOrDeleteCommodity(List<ObjectId> ids,Integer type);
	
	public String insertCommodity(Commodity commodity);
	/**
	 * 根据商品id查询商品信息
	 * @param commodityId
	 * @return
	 */
	public Commodity findCommodityById(String commodityId);
	
	public void updateCommoditySpecList(Commodity commodity);
}
