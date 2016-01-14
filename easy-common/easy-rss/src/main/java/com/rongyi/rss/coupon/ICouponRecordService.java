package com.rongyi.rss.coupon;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.CouponRecord;

import java.util.Map;

/**
 * 卡券领取记录的接口
 *
 * @author lqy
 */
public interface ICouponRecordService {

    /**
     * 分页查询红包领取记录
     *
     * @param paramMap
     * @param curPage
     * @param pageSize
     * @return
     */
    public PagingVO<CouponRecord> findAllByPage(Map<String, Object> paramMap, int curPage, int pageSize);

    /**
     * 保存卡券领取记录
     *
     * @param couponRecord
     * @return
     */
    public boolean saveOrUpdate(CouponRecord couponRecord);

    /**
     * 定时修改已过期的领用记录状态(定时任务)
     */
    public void updateAllCouponRecordValid();

}
