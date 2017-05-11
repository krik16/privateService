package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.CommodityCategory;
import com.rongyi.easy.mcmc.vo.commodity.new1.CommodityVO;
import org.bson.types.ObjectId;

import java.util.List;

public interface ICommodityFilterService {

    public void updateFilter(Commodity commodity, CommodityCategory category) throws Exception;
}
