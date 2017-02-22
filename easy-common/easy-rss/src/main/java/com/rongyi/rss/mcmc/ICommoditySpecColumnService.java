package com.rongyi.rss.mcmc;

import java.util.List;

import com.rongyi.easy.mcmc.CommoditySpecColumn;
import com.rongyi.easy.mcmc.param.commodity.CommoditySpecColumnParam;
import com.rongyi.easy.mcmc.param.commodity.SpecColumnParam;

public interface ICommoditySpecColumnService {
	 public CommoditySpecColumn selectColumnById(String id);
	 
	 public CommoditySpecColumn selectColumnByName(String name);
	 /**
	  * 大运营后台规格列表
	  * @param param
	  * @return
	  */
	 public List<CommoditySpecColumn> selectSpecColumnByNameOrId(CommoditySpecColumnParam param);
	 /**
	  * 
	  * @param name    规格名称
	  * @param desc    规格说明
	  * @param hasClassification  是否含有分类
	  */
	 public void insertCommoditySpecColumn(SpecColumnParam param);
}
