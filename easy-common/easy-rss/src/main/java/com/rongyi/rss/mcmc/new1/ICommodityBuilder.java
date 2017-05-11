package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.mcmc.param.CommodityParam;
import com.rongyi.easy.mcmc.vo.commodity.new1.CommodityVO;
import com.rongyi.easy.mcmc.vo.commodity.new1.FullCommodityVO;
import com.rongyi.easy.mcmc.vo.commodity.new1.TotalCommodityVO;

import java.util.List;

/**
 * Created by yaoyiwei on 2017/4/11.
 */
public interface ICommodityBuilder {
    FullCommodityVO buildFullCommodity(CommodityParam commodityParam, SessionUserInfo userInfo) throws Exception;
    Integer reBuildCommodityParam(CommodityParam commodityParam);
    List<CommodityVO> buildCommodity(CommodityParam commodityParam, SessionUserInfo userInfo);
    TotalCommodityVO buildTotalCommodity(CommodityParam commodityParam, SessionUserInfo userInfo) throws Exception;
    List<String> deleteCommodity(FullCommodityVO fullCommodityVO, CommodityParam commodityParam, Integer sourceParam);
}
