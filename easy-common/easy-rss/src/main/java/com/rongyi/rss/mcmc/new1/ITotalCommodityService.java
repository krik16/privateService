package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.TotalCommodity;
import com.rongyi.easy.mcmc.vo.commodity.new1.CommodityVO;

public interface ITotalCommodityService {

	public TotalCommodity buildTotalCommodityOfMc(Commodity commodity) throws Exception;

}
