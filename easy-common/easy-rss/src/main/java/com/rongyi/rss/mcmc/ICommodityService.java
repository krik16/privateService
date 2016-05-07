package com.rongyi.rss.mcmc;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.mcmc.vo.CommodityFullVO;
import com.rongyi.easy.mcmc.vo.CommodityVOToWechat;
import com.rongyi.easy.mcmc.vo.SearchParamsForWechat;
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

	public boolean updateOrDeleteCommodity(List<String> ids,Integer type,String reason,Integer userId);

	public String insertCommodity(Commodity commodity);
	/**
	 * 根据商品id查询商品信息
	 * @param commodityId
	 * @return
	 */
	public Commodity findCommodityById(String commodityId);

	public void updateCommoditySpecList(Commodity commodity);

	public List<Commodity> insertCommodityList(List<Commodity> commodityList);

	public List<Commodity> findByCode(String code);

	public void  deleteBySystemNumber(String systemNumber);

	public void updateSystemNumber(List<ObjectId> commodityIds,String systemNumber);

	public List<Commodity> findBySystemNumer(String systemNumber);

	public CommodityFullVO getFullCommodity(String commodityId);

	public List<CommodityFullVO> getFullCommodityList(List<String> commodityIds);

	public List<Commodity> findAllCommodity();

	public List<Commodity> findCommodityByshopId(String shopMid);

	public List<Commodity>  findCommodityByCategoryIdAndStatus(ObjectId categoryId,String status);
}
