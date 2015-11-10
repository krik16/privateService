package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.entity.CouponActivity;
import com.rongyi.easy.coupon.param.CouponParam;
import com.rongyi.easy.coupon.vo.TCCouponVO;

import java.util.List;

/**
 * 新版卡券接口
 *
 * @author Breggor
 */
public interface RoaCouponService {

    /**
     * 新建卡券
     *
     * @param coupon
     * @return
     */
    boolean create(Coupon coupon);

    /**
     * 追加库存量
     *
     * @param couponId
     * @param quantity
     * @return
     */
    boolean addInventory(String couponId, Integer quantity);

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
     * 代金券下线
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
    boolean updateOffStock(String id, boolean status);


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
     * @param couponIds
     * @param isRelatedActivity
     * @param couponActivity
     * @return boolean
     * @throws Exception
     * @author lqy
     */
    boolean updateRelatedActivity(List<String> couponIds, boolean isRelatedActivity, CouponActivity couponActivity);

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
     * 分页查询卡券列表
     *
     * @param couponParam
     * @return
     */
    PagingVO<Coupon> findAllByPage(CouponParam couponParam);

    /**
     * 根据卡券ID查看卡券关联的活动列表
     *
     * @param couponId 代金券ID
     * @return List<CouponActivity>
     * @author lqy
     */
    List<CouponActivity> findCouponActivitiesByCouponId(String couponId);

    /**
     * 删除
     *
     * @param couponId
     * @return
     */
    boolean remove(String couponId);

    /**
     * 根据卡券ID查询关联的店铺列表
     *
     * @param couponId    卡券id
     * @param currentPage 起始页
     * @param pageSize    每页行数
     * @return pagingVO
     * @author lqy
     */
    PagingVO getCouponShopsByCouponId(String couponId, Integer currentPage, Integer pageSize);

    /**
     * 根据卡券ID获取卡券详情（提供给容易逛代金券详情使用）
     *
     * @param couponId 卡券ID
     * @return coupon
     * @author lqy
     */
    Coupon getCouponById(String couponId);
}
