package com.rongyi.rss.mcmc;

import com.rongyi.core.bean.ResponseResult;

public interface StockService {

	public boolean increaseStock(String commodityId, String specId, int num);

	public ResponseResult decreaseStock(String commodityId, String specId, int num);

	public int getStock(String commodityId, String specId);

	public boolean increaseSold(String commodityId, int num);
	
	public boolean increaseStockForBusinessBackground(String commodityId,String specId,int total,int commodityStock, int specStock);

}
