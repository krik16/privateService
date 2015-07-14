package com.rongyi.osm.service.mcmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.rss.mcmc.StockService;

@Service
public class McmcStockService {
	@Autowired
	StockService stockService;
	

	public boolean increaseStock(String commodityId, String specId, int num){
		return stockService.increaseStock(commodityId, specId, num);
	}

	public ResponseResult decreaseStock(String commodityId, String specId, int num){
		return stockService.decreaseStock(commodityId, specId, num);
	}

	public boolean increaseSold(String commodityId,int num){
		return stockService.increaseSold(commodityId, num);
	}
	
}
