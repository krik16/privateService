package com.rongyi.rss.mcmc;

import com.rongyi.easy.mcmc.CommoditySpecColumn;

public interface ICommoditySpecColumnService {
	 public CommoditySpecColumn selectColumnById(String id);
	 
	 public CommoditySpecColumn selectColumnByName(String name);
}
