package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.mcmc.vo.commodity.new1.FullCommodityVO;

import java.util.List;

/**
 * Created by zhoukunkun on 2017/4/13.
 */
public interface ICommodityHandler {

    public List<String> saveOrUpdate(FullCommodityVO fullCommodityVO) throws Exception;

}
