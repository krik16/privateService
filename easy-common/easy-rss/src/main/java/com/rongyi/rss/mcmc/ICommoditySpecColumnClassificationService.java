package com.rongyi.rss.mcmc;

import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.mcmc.CommoditySpecColumnClassification;


public interface ICommoditySpecColumnClassificationService {
	
	public List<CommoditySpecColumnClassification> findByColumnId(ObjectId columnId);
	
	public CommoditySpecColumnClassification findByColumnName(String name);
	
	public String insertCommoditySpecColumnClassification(CommoditySpecColumnClassification commoditySpecColumnClassification);
}
