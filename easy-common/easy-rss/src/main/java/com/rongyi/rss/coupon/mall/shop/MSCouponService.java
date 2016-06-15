package com.rongyi.rss.coupon.mall.shop;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.bean.ResponseVO;
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
     * 摩店创建活动卡券
     * @param param
     * @return
     */
    ResponseVO createActivityCoupon(RmmmCouponParam param);

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

    /**
     * 根据卡券ID获取卡券详情
     * @param couponId 卡券ID
     * @return coupon
     * @author lqy
     */
    Coupon getCouponById(String couponId);

    /**
     * 校验摩店登录的人是否有操作这张券的权限
     * 摩店两种角色：店长、导购，两种角色只能操作关联类型是店铺的券
     * @param userId 用户id
     * @param couponId 卡券id
     * @return ResponseVO 有权限errno=0，没权限errno=1020831, msg="您无权限操作，如需修改请联系集团管理员"
     *                                         errno=1020832, msg="您无权限操作，如需修改请联系品牌管理员"
     *                                         errno=1020833, msg="您无权限操作，如需修改请联系商场管理员"
     * @author lqy
     */
    ResponseVO checkMallShopAuthority(Integer userId, String couponId);

    /**
     * 获取摩店用户未读卡券数量
     * @param userId
     * @param shopId
     * @return
     */
    int getUnReadCouponsNum(Integer userId,String shopId);
}

