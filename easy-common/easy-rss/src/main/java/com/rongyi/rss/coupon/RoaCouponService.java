package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.param.CouponParam;
import com.rongyi.easy.coupon.vo.TCCouponVO;

import java.util.List;

/**
 * 新版卡券接口
 *
 * @see RoaOldCouponService -- 老卡券接口
 */
public interface RoaCouponService {

    /**
     * 交易中心-根据id查询卡券
     *
     * @param couponId
     * @return
     */
    TCCouponVO findTCCouponById(String couponId);

    /**
     * 根据id查询
     *
     * @param couponId
     * @return
     */
    Coupon findById(String couponId);


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

    /**
     * 代金券下线
     *
     * @param id
     * @param status
     * @return
     */
    boolean updateCouponStatus(String id, String status);

    /**
     * 根据卡券Id减少库存
     *
     * @param couponId
     * @param quantity
     * @return
     */
    boolean subtractInventory(String couponId, int quantity);


    /**
     * 根据卡券Id恢复库存
     *
     * @param couponId
     * @param quantity
     * @return
     */
    boolean recoverInventory(String couponId, int quantity);

    /**
     * 修改卡券关联活动状态 关联[true] 取消关联[false]
     *
     * @param ids
     * @param isRelatedActivity
     * @return
     * @throws Exception
     */
    boolean updateRelatedActivity(List<String> ids, boolean isRelatedActivity) throws Exception;

    /**
     * 减库存返回券码
     *
     * @param couponId
     * @return
     */
    ResponseResult subtractInventoryReturnCode(String couponId);

    /**
     * 只减少库存
     *
     * @param couponId
     * @param quantity
     * @return
     */
    ResponseResult subtractCouponInventory(String couponId, int quantity);

    /**
     * 恢复券码
     *
     * @param couponId
     * @param couponCode
     * @return
     */
    boolean restoreCouponInventory(String couponId, String couponCode);

    /**
     *
     * @param couponParam
     * @return
     */
    PagingVO<Coupon> findAllByPage(CouponParam couponParam);
}
