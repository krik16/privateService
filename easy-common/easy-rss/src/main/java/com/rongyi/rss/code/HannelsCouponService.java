package com.rongyi.rss.code;

import java.util.Map;

/**
 * Created by shaozhou on 2016/6/30.
 */
public interface HannelsCouponService {
    /**
     * 根据促销码id删除促销优惠关联表数据
     * @param hannel_id
     * @return
     */
    public int deleteByHannelId(Integer hannel_id);

    /**
     * 新增促销优惠关联表数据
     * @param paramMap
     * @return
     */
    public int saveHannelsCoupon(Map<String,Object> paramMap);
}
