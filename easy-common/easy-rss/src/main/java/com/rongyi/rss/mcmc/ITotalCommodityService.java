package com.rongyi.rss.mcmc;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.mcmc.Commodity;
import org.bson.types.ObjectId;

import com.rongyi.easy.mcmc.TotalCommodity;



public interface ITotalCommodityService {

	public TotalCommodity  findByTotalCommodityId(String id);

	public void updateTotalCommodity(TotalCommodity toalCommodity);

	public boolean updateOrDeleteCommodity(List<ObjectId> ids,Integer type,String reason,Integer userId);

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

	public Map<String ,Object> findListForWechat(Map<String, Object> params);

	/**
	 *
	 * @param id
	 * @param type
	 * @param terminalType
	 * @param weAndTeStatus
	 * @param source  更新来源，0表示大运营后台，1表示商家后台
	 * @return
	 */
	public String updateCommodityWeAndTeStatus(String id, String type, String terminalType, String weAndTeStatus,Integer source);

	public List<TotalCommodity>  findCommodityByCategoryId(Map<String,Object> paramMap);

}
