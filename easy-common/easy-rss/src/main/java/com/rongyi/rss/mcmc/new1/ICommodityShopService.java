package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.CommodityShopInfo;
import com.rongyi.easy.mcmc.vo.commodity.new1.CommodityVO;

public interface ICommodityShopService {

    /**
     * 新增三个维度数据 店铺名称、商场名称、商圈名称
     *
     * @param shopMid
     * @param mallMid
     * @param commodity
     */
    public void buildExtName(String shopMid, String mallMid, Commodity commodity);

    /**
     * 获取shopInfo
     * @param commodityvo
     * @return
     */
    public CommodityShopInfo getShopInfoByCommodityVO(CommodityVO commodityvo);

}
