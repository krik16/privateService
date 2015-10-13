package com.rongyi.rss.coupon;


import com.rongyi.easy.coupon.entity.old.Coupon;
import com.rongyi.easy.coupon.old_vo.OldCouponVO;
import org.bson.types.ObjectId;

import java.util.List;


/**
 * 1.优惠券订单提交  2.查询优惠详情浏览次数
 *
 * @author hebo
 *         优惠券模板接口，提供给mall-shop的controller使用)
 * @date 2015年6月8日 下午
 * @see MSCouponService
 */
@Deprecated
public interface MMCouponService {


    /**
     * 通过id查询优惠券
     *
     * @param id
     * @return
     */
    @Deprecated
    public Coupon findCouponById(ObjectId id);

    /**
     * 老优惠:通过id修改优惠券详情浏览次数
     *
     * @param couponId
     * @return FavourableVO
     */
    @Deprecated
    public void addCouponVistiedCount(String couponId, int visitedCount);

    /**
     * 通过ids得懂啊oldCOuponVO  List
     *
     * @param ids
     * @return
     */
    @Deprecated
    public List<OldCouponVO> findCouponDetailByIds(List<String> ids);

    /**
     * 推荐优惠券首页（优化）
     *
     * @param ids
     * @return
     */
    @Deprecated
    public List<OldCouponVO> findCouponIndexByIds(List<String> ids);
}
