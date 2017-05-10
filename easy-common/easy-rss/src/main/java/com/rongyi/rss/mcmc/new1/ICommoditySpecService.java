package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.CommoditySpec;
import com.rongyi.easy.mcmc.vo.commodity.new1.CommodityVO;

import java.util.List;
import java.util.Map;


public interface ICommoditySpecService {
	
	public Map<String, Object> createSpec(CommodityVO commodityVo) throws Exception;

	public Map<String, Object> editSpec(CommodityVO commodityVo) throws Exception;

	public List<CommoditySpec> getSpecListByCommodityList(List<Commodity> commodityList);

	public List<String> getColumnValueIdsByValues(List<String> valueList);

	public List<String> getColumnValuesByValueIds(List<String> valueIdList, List<String> columnValueList);
}
