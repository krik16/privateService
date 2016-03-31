package com.rongyi.rss.mcmc;

import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.mcmc.entity.CommodityStockEntity;



public interface ROACommodityStockService {
	/**
	 * 插入商品存储数据
	 * @param commodityStocks
	 * @return
	 */
	public int insertCommodityStock(List<CommodityStockEntity> commodityStocks);
	
	public List<CommodityStockEntity> selectByCommodityMidOrCommoditySpecMid(List<ObjectId> commodityMids, String commoditySpecMid);
	
	public int deleteByCommodityId(List<String> commodityMids);
}
