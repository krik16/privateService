package com.rongyi.rss.malllife.service;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.content_v2.param.ShortSizeParam;
import com.rongyi.easy.malllife.exception.MallLifeException;

public interface ShortSizeService {
    ResponseVO getCommodityList(ShortSizeParam param);

    /**
     * 分享
     * @param param 分享参数
     * @return ResponseVO
     */
    ResponseVO share(ShortSizeParam param)  throws MallLifeException;
}
