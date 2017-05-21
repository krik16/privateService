package com.rongyi.rss.bdata;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.bdata.entity.Shop;
import com.rongyi.easy.bdata.param.ShopSearchParam;
import com.rongyi.easy.bsoms.param.BaseParam;
import com.rongyi.easy.ryoms.enums.ShopNatureEnum;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * Created by WUH on 2017/5/19.
 * 店铺搜索接口
 */
public interface IShopSearchService {

    List<Shop> getShopByNature(ShopSearchParam searchParam);

    List<Shop> getChildShop(ShopSearchParam searchParam);

    List<Shop> queryShop(ShopSearchParam searchParam);

    ResponseVO excludeSpecifiedShops(ShopSearchParam specifiedParam);


}
