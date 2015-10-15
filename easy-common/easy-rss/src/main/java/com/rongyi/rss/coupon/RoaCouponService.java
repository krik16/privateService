package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.vo.TCCouponVO;

import java.util.List;

/**
 * 新版卡券接口
 *
 * @see RoaOldCouponService -- 老卡券接口
 */
public interface RoaCouponService {

    /**
     * 减库存
     *
     * @param couponId
     * @return
     */
    ResponseVO subtractInventory(String couponId, Integer quantity);

    /**
     * 根据id查询
     *
     * @param couponId
     * @return
     */
    Coupon findById(String couponId);

    /**
     * 交易中心-根据id查询卡券
     *
     * @param couponId
     * @return
     */
    TCCouponVO findTCCouponById(String couponId);


    /**
     * 根据id集合查询
     *
     * @param ids
     * @return
     */
    List<Coupon> findCouponListByIds(List<String> ids);

    /**
     * 追加卡券浏览次数
     *
     * @param couponId
     * @param visitedCount
     * @return
     */
    boolean addCouponVistiedCount(String couponId, int visitedCount);

}
