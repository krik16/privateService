package com.rongyi.rss.mcmc;

import com.rongyi.core.framework.exception.RYServiceException;

/**
 * 品牌服务接口
 *
 * @author wangjh7
 * @date 2016-08-26
 */
public interface BrandService {

    /**
     * 同步品牌的销量数
     *
     * @param
     */
    void syncBrandTotalSales() throws RYServiceException;

}

