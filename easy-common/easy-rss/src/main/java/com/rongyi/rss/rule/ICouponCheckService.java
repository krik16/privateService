package com.rongyi.rss.rule;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.tradecenter.param.BizzValidHistoryParam;
import com.rongyi.easy.tradecenter.vo.BizzValidHistoryVO;

/**
 * Created by yujisun on 2016/5/20.
 */
public interface ICouponCheckService
{

    /**
     * 校验奖品券码
     *
     * @param couponCode 券码
     * @param mallId 验券商场id
     * @param shopId 验券店铺id
     * @param useMode 校验方式
     * @param source 校验来源（PA/APP）
     * @param sellerId 校验人id
     */
    ResponseResult checkCoupon(String couponCode, String mallId, String shopId, Long useMode, String source, Integer sellerId);

    /**
     * 查询验券记录
     *
     * @param param 查询参数
     * @return 查询结果
     *
     */
    BizzValidHistoryVO couponValidHis(BizzValidHistoryParam param);

    /**
     * 统计当日验券记录
     *
     * @param param 查询参数
     * @return 查询结果
     *
     */
    int countCouponValidDaily(BizzValidHistoryParam param);

    /**
     * 统计全部验券记录
     *
     * @param param 查询参数
     * @return 查询结果
     *
     */
    int countCouponValidHis(BizzValidHistoryParam param);
}
