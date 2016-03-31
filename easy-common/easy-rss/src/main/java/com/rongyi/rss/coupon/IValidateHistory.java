package com.rongyi.rss.coupon;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.vo.CouponHistoryVO;

import java.util.Map;

/**
 * 验证历史记录接口
 * @author hebo
 */
public interface IValidateHistory {
    /**
     * 分页查询验证历史记录
     * @param paramMap
     * @return
     */
     PagingVO<CouponHistoryVO> searchCouponCodeListAndCount(Map paramMap);

}
