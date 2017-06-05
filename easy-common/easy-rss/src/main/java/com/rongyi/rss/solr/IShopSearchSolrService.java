package com.rongyi.rss.solr;

import com.rongyi.easy.bdata.param.ShopSearchParam;
import com.rongyi.easy.solr.result.ShopSearchResult;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * Created by WUH on 2017/5/18.
 * 店铺搜索接口
 */
public interface IShopSearchSolrService {

    /**
     * 查询所有店铺，并去除指定的id
     * @param idList 需要去除的id集合， 若idList为空，则表示查询所有
     * @return shopList
     */
    ShopSearchResult queryShopExcludeSpecified(List<String> idList, ShopSearchParam searchParam);

    /**
     * 根据
     * @param searchParam
     * @return shopList
     */
    ShopSearchResult searchShopByType(ShopSearchParam searchParam, boolean includeItsChildren);

    ShopSearchResult queryShop(ShopSearchParam searchParam);
}
