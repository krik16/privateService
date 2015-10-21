package com.rongyi.rss.coupon.mall.life;


import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.old_vo.OldCouponVO;
import com.rongyi.easy.coupon.vo.CouponVO;
import com.rongyi.easy.solr.retrival.result.ActivityData;

import java.util.List;


/**
 * 容易逛: 秒杀活动-代金券接口
 *
 * @author Breggor
 */
public interface MLCouponService {


    /**
     * 根据id集合查询
     *
     * @param ids
     * @return
     */
    public List<OldCouponVO> findCouponVOByIds(List<String> ids);

    /**
     * 根据id查询卡券信息
     *
     * @param couponId
     * @return
     */
    Coupon findCouponById(String couponId);

    boolean addCouponVistiedCount(String couponId, int visitedCount);

    /**
     * 根据Id查询基本信息
     *
     * @param couponId
     * @return
     */
    CouponVO findCouponVOById(String couponId);

    /**
     * 减库存返回券码
     *
     * @param couponId
     * @return
     */
    ResponseResult subtractInventoryReturnCode(String couponId);

    /**
     * 根据id查看优惠券是否存在
     *
     * @param couponId
     * @return
     */
    boolean hasCoupon(String couponId);


    /**
     * solr搜索优惠券详情页
     *
     * @param couponId
     * @return
     */
    ActivityData getCouponInfoForSolr(String couponId);
}
