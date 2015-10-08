package com.rongyi.rss.mcmc;

import java.util.List;

import com.rongyi.easy.mcmc.entity.CommodityStockEntity;



public interface ROACommodityStockService {
	/**
	 * 插入商品存储数据
	 * @param commodityStocks
	 * @return
	 */
	public int insertCommodityStock(List<CommodityStockEntity> commodityStocks);
	
	public List<CommodityStockEntity> selectByCommodityMidOrCommoditySpecMid(String commodityMid, String commoditySpecMid);
	
	public int deleteByCommodityId(String commodityMid);
}
