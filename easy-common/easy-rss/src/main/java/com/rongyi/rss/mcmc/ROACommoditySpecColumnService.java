package com.rongyi.rss.mcmc;

import com.rongyi.easy.mcmc.CommoditySpecColumn;

public interface ROACommoditySpecColumnService {
	 public CommoditySpecColumn selectColumnById(String id);
	 
	 public CommoditySpecColumn selectColumnByName(String name);
}
