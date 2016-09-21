package com.rongyi.rss.mcmc;

import java.util.List;

import com.rongyi.easy.mcmc.param.ActivitySpecParam;
import org.bson.types.ObjectId;

import com.rongyi.easy.mcmc.CommoditySpec;





public interface ICommoditySpecService {
	
	public List<CommoditySpec> insertList(List<CommoditySpec> commoditySpecs);
	
	public CommoditySpec findById(String id);
	
	public String insert(CommoditySpec commoditySpec);


	String validatePriceAndStock(ActivitySpecParam specParam, String commodityId);

	List<CommoditySpec> listSpecInfosByIds(List<ObjectId> ids); 
}
