package com.rongyi.rss.coupon;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.easy.coupon.entity.Coupon;

/**
 * 提供给vms/rmmm的接口：优惠券相关操作
 *
 * @author Ventures
 */
public interface ICouponService {

    /**
     * 获取优惠券列表
     *
     * @param ce 优惠券实体对象
     * @return
     * @throws Exception
     */
    public Map<String, Object> getCouponList(Map<String, Object> map, int currentpage, int pagesize) throws Exception;

    /**
     * 通过id获取优惠券信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    public Coupon getCouponById(ObjectId id) throws Exception;

    /**
     * 添加或更新优惠券
     *
     * @param coupon
     * @return
     * @throws Exception
     */
    public ObjectId saveOrUpdateCoupon(Coupon coupon) throws Exception;

    /**
     * 删除优惠券
     *
     * @param couponId
     * @param userId
     * @return
     * @throws Exception
     */
    public Boolean deleteCoupon(ObjectId couponId, String userId) throws Exception;

    /**
     * 追加券码
     *
     * @param couponId
     * @param addCount 追加的数量
     * @param userId
     * @return
     * @throws Exception
     */
    public Boolean addCouponCount(ObjectId couponId, Integer addCount,
                                  String userId) throws Exception;

    /**
     * 优惠券审核
     *
     * @param coupon
     * @return
     * @throws Exception
     */
    public Boolean verifyCoupons(Coupon coupon) throws Exception;

    /**
     * 优惠券关联商场
     *
     * @param coupon
     * @return
     */
    public Boolean relevanceMalls(Coupon coupon) throws Exception;

    /**
     * 优惠券关联店铺
     *
     * @param coupon
     * @return
     */
    public Boolean relevanceShops(Coupon coupon) throws Exception;

    /**
     * 优惠券现金券关联活动和取消关联
     * activityStatus 1：关联翻牌购   2： 关联推送  0 : 取消关联
     *
     * @param ids            券id集合
     * @param activityStatus 活动状态
     * @return
     * @throws Exception
     */
    public Boolean couponsRelevanceActivity(List<ObjectId> ids, String activityStatus) throws Exception;

    /**
     * 通过ids 查询优惠券列表
     *
     * @param ids
     * @return
     * @throws Exception
     */
    public List<Coupon> getCouponByIds(List<ObjectId> ids) throws Exception;

    /**
     * 我的抵扣券列表(未使用/已使用)
     *
     * @param map int currentPage int pageSize String userId  String status
     *            1：未使用 2：包括已使用、已失效    券状态 0:未激活 1:已领用 2:已使用 3:已过期
     *            注：排序规则，金额最大--有效期时间最近
     * @return
     * @throws Exception
     */
    public Map<String, Object> getCouponCodeListById(Map<String, Object> map) throws Exception;


    /**
     * 通过id获取现金券的金额
     *
     * @param id
     * @return
     */
    public Double getDiscountById(Long id) throws Exception;


    /**
     * 百货平台同步优惠券
     *
     * @param coupon
     * @return
     */
    public Boolean release(Coupon coupon);

    /**
     * @param couponId
     * @param sortIndex
     * @return Boolean    返回类型
     * @Title: stickCoupon
     * @Description: TODO(置顶优惠券)
     */
    public Boolean stickCoupon(ObjectId couponId, Integer sortIndex);
    
    /**
     * 修改券码模板表中(0,1)已过期的状态(定时任务)
     * @Description
     * @author yb
     */
    public void updateAllCouponValid();
}
