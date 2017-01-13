package com.rongyi.rss.malllife.service;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.content_v2.param.ShortSizeParam;

public interface ShortSizeService {
    ResponseVO getCommodityList(ShortSizeParam param);
}
