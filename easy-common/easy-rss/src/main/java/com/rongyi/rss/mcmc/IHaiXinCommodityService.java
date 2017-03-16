package com.rongyi.rss.mcmc;

/**
 * Created by yaoyiwei on 2017/3/15.
 */
public interface IHaiXinCommodityService {

    void importCommodity(String code, String startDate, String endDate, boolean updateAll);
}
