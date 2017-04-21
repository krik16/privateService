package com.rongyi.rss.mcmc.new1;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.constant.EPOIType;
import com.rongyi.easy.mcmc.param.CommodityParam;
import com.rongyi.easy.mcmc.vo.CommodityFullVO;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Map;


public interface ICommodityService {
	public long countByBuyerCommodityCode(String buyerId, String code, String id);

	public long countByShopIdCommodityCode(String shopId, String code, String commodityId);
	public long countByBrandReverseCommodityCode(String brandId, String code, String commodityId);
}
