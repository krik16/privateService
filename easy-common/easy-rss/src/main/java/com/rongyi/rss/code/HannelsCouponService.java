package com.rongyi.rss.code;

import com.rongyi.easy.code.HannelsCoupon;

import java.util.List;
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

    /**
     * 通过hannels_id 查询促销红包关联数据
     * @param id
     * @return
     */
    List<HannelsCoupon> selectByHannelIds(Integer id);
}
