package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.mcmc.CommodityCategory;
import com.rongyi.easy.mcmc.vo.commodity.new1.CommodityVO;
import org.bson.types.ObjectId;

import java.util.List;

public interface ICommodityCategoryService {

    public CommodityCategory getCategory(Integer commodityRange, String commodityCategory, List<ObjectId> commodityCategoryIds);

    public void updateCategory(Integer commodityRange, String commodityCategory,
                               List<ObjectId> commodityCategoryIds) throws Exception;

    public List<ObjectId> getCategoryIds(CommodityVO commodityVo);

    public List<String> getHaiXinCategoryNames(List<ObjectId> categoryIds);

    public List<Integer> createCustomCategory(CommodityVO commodityVo);
}
