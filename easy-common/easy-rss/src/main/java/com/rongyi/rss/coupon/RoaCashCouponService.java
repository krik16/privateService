package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.OldCoupon;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Map;

/**
 * 给ROA提供红包接口
 *
 * @author Breggor
 *         废弃，下步删除掉
 * @see RoaUserRedenvelopeService
 */
@Deprecated
public interface RoaCashCouponService {

    /**
     * 根据PK查询
     *
     * @param id
     * @return
     */
    OldCoupon findOne(ObjectId id);

    /**
     * 保存或更新
     *
     * @param coupon
     * @return
     */
    boolean saveOrUpdate(OldCoupon coupon);

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     */
    boolean remove(ObjectId id);

    /**
     * 返回所有数据
     *
     * @return
     */
    List<OldCoupon> findAll();

    /**
     * 分页查询
     *
     * @param paramMap
     * @param curPage
     * @param pageSize
     * @return
     */
    PagingVO<OldCoupon> findAllByPage(Map<String, Object> paramMap, int curPage, int pageSize);

    /**
     * 审核现金劵
     *
     * @param id          现金劵Id
     * @param checkStatus 审核状态
     * @param checkDesc   审核说明
     * @return
     */
    boolean checkCoupon(ObjectId id, String checkStatus, String checkDesc);

    /**
     * 配置现金券
     *
     * @param cashCoupon 关联商品
     * @return
     */
    boolean allocateCoupon(OldCoupon cashCoupon);

    /**
     * 不能使用
     * 根据卡券Id减少库存
     *
     * @param couponId
     * @param quantity
     * @return
     * @see RoaCouponService#subtractCouponInventory(String, int)
     */
//    @Deprecated
//    boolean subtractInventory(String couponId, int quantity);


    /**
     * 不能使用
     * 根据卡券Id恢复库存
     *
     * @param couponId
     * @param quantity
     * @return
     */
//    @Deprecated
//    boolean recoverInventory(String couponId, int quantity);


    /**
     * 卡券返库
     * 库存量，券码状态
     *
     * @param couponId
     * @param couponCode
     * @return
     */
    boolean restoreCouponInventory(String couponId, String couponCode);

    /**
     * 根据卡券Id减少库存
     *
     * @param coupongId
     * @return
     */
    ResponseResult subtractCouponInventory(String coupongId);


    /**
     * 根据卡券Id减少库存
     *
     * @param coupongId amount
     * @return
     */
    ResponseResult subtractCouponInventory(String coupongId, int quantity);


    /**
     * 根据卡券码查询优惠券
     *
     * @param couponCode
     * @return
     */
    OldCoupon getCouponByCode(String couponCode);

    /**
     * 追加券码
     *
     * @param couponId
     * @param addCount
     * @param userId
     * @return
     */
    Boolean addCouponCount(ObjectId couponId, Integer addCount, String userId);
}
