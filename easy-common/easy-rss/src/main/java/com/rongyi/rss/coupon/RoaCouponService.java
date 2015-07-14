package com.rongyi.rss.coupon;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.vo.UserCouponVO;

import org.bson.types.ObjectId;

import java.util.List;
import java.util.Map;

public interface RoaCouponService {

    /**
     * 分页查询优惠券列表
     *
     * @param map
     * @param currentpage
     * @param pagesize
     * @return
     */
    public Map<String, Object> getCouponList(Map<String, Object> map, int currentpage, int pagesize);

    /**
     * 通过id查询优惠券
     *
     * @param id
     * @return
     */
    public Coupon getCouponById(ObjectId id);

    /**
     * 添加或更新优惠券
     *
     * @param coupon
     * @return
     */
    public ObjectId saveOrUpdateCoupon(Coupon coupon);

    /**
     * 通过id删除优惠券
     *
     * @param couponId
     * @param userId
     * @return
     */
    public Boolean deleteCoupon(ObjectId couponId, String userId);

    /**
     * 追加券码
     *
     * @param couponId
     * @param addCount
     * @param userId
     * @return
     */
    public Boolean addCouponCount(ObjectId couponId, Integer addCount, String userId);

    /**
     * 审核优惠券
     *
     * @param coupon
     * @return
     */
    public Boolean verifyCoupons(Coupon coupon);

    /**
     * 关联商场
     *
     * @param coupon
     * @return
     */
    public Boolean relevanceMalls(Coupon coupon);

    /**
     * 关联店铺
     *
     * @param coupon
     * @return
     */
    public Boolean relevanceShops(Coupon coupon);

    /**
     * 优惠券现金券关联活动和取消关联 activityStatus 1：关联翻牌购 2： 关联推送 0 : 取消关联
     *
     * @param ids            券id集合
     * @param activityStatus 活动状态
     * @return
     */
    public Boolean couponsRelevanceActivity(List<ObjectId> ids, String activityStatus);

    /**
     * 通过ids获取优惠券
     *
     * @param ids
     * @return
     */
    public List<Coupon> getCouponByIds(List<ObjectId> ids);

    /**
     * 我的抵扣券列表(现金券)(未使用/已使用) 列表查询
     *
     * @param map
     * @return
     */
    public Map<String, Object> getCouponCodeListById(Map<String, Object> map);

    /**
     * 现金券 详情
     *
     * @param id
     * @param id 现金券券码id
     * @return
     * @throws Exception
     */
    public UserCouponVO getCouponCodeById(Long id);

    /**
     * 判断现金券是否是有效的
     *
     * @param couponId 现金券模板id, productId 商品id
     * @return true 没过期 false 已过期
     * @throws Exception
     */
    public Boolean isValidCode(String couponId, String productId);

    /**
     * 通过id 获取券码当前状态
     *
     * @param id 券码id
     * @return
     */
    public Integer getStatusById(Long id);


    /**
     * 通过id获取现金券的金额
     *
     * @param id
     * @return
     */
    public Double getDiscountById(Long id);


    /**
     * 通过券码获取现金券的金额
     *
     * @param code 券码
     * @return
     */
    public Double getDiscountByCode(String code);

    /**
     * 百货平台同步优惠券
     *
     * @param coupon
     * @return
     */
    public Boolean release(Coupon coupon);


    /**
     * 根据couponID逻辑删除
     *
     * @param couponId
     * @return
     */
    boolean deleteCoupon(String couponId);

    /**
     * 根据couponID更新优惠券状态
     *
     * @param couponId
     * @param status
     * @return
     */
    boolean updateCouponStatus(String couponId, String status);


    /**
     * 修改优惠券详情浏览次数
     *
     * @param couponId
     * @param visitedCount
     */
    public void updateCouponVistiedCount(String couponId, int visitedCount);

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
