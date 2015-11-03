package com.rongyi.rss.coupon.mall.shop;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.old_vo.OldCouponVO;
import com.rongyi.easy.coupon.param.RmmmCouponParam;
import com.rongyi.easy.coupon.param.RmmmCouponQueryParam;
import com.rongyi.easy.coupon.vo.MSCouponQueryVO;
import com.rongyi.easy.solr.retrival.result.ActivityData;

import java.util.List;

/**
 * 功能描述： 摩店(MS) 代金券接口
 *
 * @author Breggor
 */
public interface MSCouponService {

    /**
     * 创建优惠券
     */
    ResponseResult createCoupon(RmmmCouponParam param);

    /**
     * 查询优惠券
     */
    MSCouponQueryVO listCoupon(RmmmCouponQueryParam param);

    /**
     * 删除优惠券
     */
    boolean removeCoupon(String couponId);

    /**
     * 更新优惠券状态
     * 目前修改优惠券下线状态，下线状态值：4
     */
    boolean updateCouponStatus(String couponId, String status);


    /**
     * 优惠券详情
     *
     * @param couponId
     * @return
     */
    OldCouponVO getCouponDetail(String couponId);


    /**
     * solr搜索优惠券详情页
     *
     * @param couponId
     * @return
     */
    ActivityData getCouponInfoForSolr(String couponId);


    /**
     * 根据id查看优惠券是否存在
     *
     * @param couponId
     * @return
     */
    boolean hasCoupon(String couponId);


    /**
     * 追加库存量
     *
     * @param couponId
     * @param quantity
     * @return
     */
    boolean appendInventory(String couponId, Integer quantity);


    /**
     * 通过id查询优惠券
     *
     * @param id
     * @return
     */
    public Coupon findCouponById(String id);

    /**
     * 老优惠:通过id修改优惠券详情浏览次数
     *
     * @param couponId
     * @return FavourableVO
     */
    public void addCouponVistiedCount(String couponId, int visitedCount);

    /**
     * 通过ids得懂啊oldCOuponVO  List
     *
     * @param ids
     * @return
     */
    public List<OldCouponVO> findCouponDetailByIds(List<String> ids);

    /**
     * 推荐优惠券首页（优化）
     *
     * @param ids
     * @return
     */
    public List<OldCouponVO> findCouponIndexByIds(List<String> ids);

}

