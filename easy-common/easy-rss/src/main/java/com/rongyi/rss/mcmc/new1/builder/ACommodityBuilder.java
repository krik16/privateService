package com.rongyi.rss.mcmc.new1.builder;

import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.mcmc.param.CommodityParam;
import com.rongyi.easy.mcmc.vo.CommoditySpecVO;
import com.rongyi.easy.mcmc.vo.commodity.new1.FullCommodityVO;
import com.rongyi.rss.mcmc.new1.ICommodityBuilder;

import java.util.ArrayList;


/**
 * Created by yaoyiwei on 2017/4/11.
 */
public abstract class ACommodityBuilder implements ICommodityBuilder {

    private CommodityParam commodityParam;
    private SessionUserInfo userInfo;
    private FullCommodityVO fullCommodityVO;

    public ACommodityBuilder(CommodityParam commodityParam, SessionUserInfo userInfo) {
        this.commodityParam = commodityParam;
        this.userInfo = userInfo;
        this.fullCommodityVO = new FullCommodityVO();
    }

    public void buildSpec() {
        System.out.println("build spec");
        fullCommodityVO.setSpecVOs(new ArrayList<CommoditySpecVO>(3));
    }

    public abstract void buildCommodity();

    public abstract void buildTotalCommodity();

    public FullCommodityVO buildFullCommodity() {
        return this.fullCommodityVO;
    }

}
