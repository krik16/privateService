package com.rongyi.rss.malllife.service;

import com.rongyi.easy.content_v2.param.ShortSizeParam;
import com.rongyi.easy.mcmc.Commodity;

import java.util.List;

public interface ShortSizeService {
    List<Commodity> getCommodityList(ShortSizeParam param);
}
