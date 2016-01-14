package com.rongyi.rss.coupon.mall.life;

import java.util.List;
import java.util.Map;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.UserRedenvelope;
import com.rongyi.easy.coupon.param.CouponOrderParam;
import com.rongyi.easy.coupon.param.RebateAndRedenvelopParam;
import com.rongyi.easy.coupon.vo.UserCouponVO;
import com.rongyi.easy.coupon.vo.UserRedPacketForOrderVO;
import com.rongyi.easy.coupon.vo.UserRedPacketVO;

/**
 * 摩生活：用户红包接口
 * 原接口名：RmmmUserCashCouponService
 *
 * @author Breggor
 */
public interface MLUserRedenvelopeService {


    /**
     * 根据Id查询优惠券
     *
     * @param userCouponId
     * @return
     */
    UserRedenvelope findUserCouponById(Integer userCouponId);


    public UserRedenvelope findUserCouponByCouponCode(String couponCode);

    public PagingVO<UserRedenvelope> findUserCouponByUserId(String userId,
                                                            Integer currentPage, Integer pageSize);


    PagingVO<UserRedenvelope> findUserCouponByUserIdFull(String userId,
                                                         Integer currentPage, Integer pageSize);

    /**
     * 接口描述：用户红包 (未使用/已使用) 列表查询
     * 使用模块：摩生活-我的红包
     *
     * @param map 目前参数说明：{currentPage：0,pageSize:10,userId:1,productId:10,status
     *            :1}status 1是未使用 2包括已使用，已过期
     * @return
     */
    public Map<String, Object> findCashCouponListByUserId(Map<String, Object> map);

    /**
     * 红包 (未使用) 列表查询
     *
     * @param productIds
     * @param userId
     * @return {product:[],all:[]} 商品key=product，全场key=all
     */
    public Map<String, List<UserCouponVO>> findUnusedCashCoupon(List<String> productIds, String userId);

    /**
     * 红包 详情
     *
     * @param couponCode 红包券码
     * @return UserCouponVO
     */
    public UserCouponVO findCashCoupon(String couponCode);

    /**
     * 判断红包是否是有效的
     *
     * @param couponCode 红包模板id, commodityId 商品id
     * @return true 没过期 false 已过期
     * @throws Exception
     */
    public Boolean validCashCoupon(String couponCode, String commodityId);

    /**
     * 通过couponCode 获取优惠券当前状态
     *
     * @param couponCode 券码
     * @return
     */
    public Integer getCashCouponStatus(String couponCode);

    /**
     * 通过couponCode改变优惠券当前状态
     *
     * @param status
     * @return
     */
    public Boolean changeCashCouponStatus(String couponCode, Integer status);

    /**
     * 通过couponCode获取红包折扣金额
     *
     * @param couponCode
     * @return
     */
    public Double getCashCouponDiscount(String couponCode);

    /**
     * 根据用户ID及现金ID检查是否已领过红包
     *
     * @param couponId
     * @param userId
     * @return
     */
    boolean checkReceivedCashCoupon(String couponId, String userId);

    /**
     * 根据用户ID及现金ID领取红包
     *
     * @param couponId
     * @param userId
     * @return ResponseResult{message:错误信息，info：boolean状态是否领取成功}
     */
    ResponseResult receiveCashCoupon(String couponId, String userId);




    /**
     * 根据券码查询抵红包详情
     * @param couponCode 券码
     * @return UserRedPacketVO
     * @author lqy
     */
    UserRedPacketVO getUserRedPacket(String couponCode);

    /**
     * 分页查询我的可使用红包和已失效红包
     * @param param
     * @return PagingVO
     * @author lqy
     */
    PagingVO<UserRedPacketVO> getUserRedPackets(RebateAndRedenvelopParam param);

    /**
     * 查询对订单可使用红包和不可使用的红包(不需要分页)
     * @param param
     * @return UserRedPacketForOrderVO
     * @author lqy
     */
    UserRedPacketForOrderVO getUserRedPacketForOrder(RebateAndRedenvelopParam param);

    /**
     * 获取用户在某个时间点以后领取到的可使用的红包数量
     * @param param 参数含 userId、receiveAt
     * @return count 数量
     * @author lqy
     */
    int getUserRedPacketCount(RebateAndRedenvelopParam param);

    /**
     * 检查红包是否使用(status未使用[0],已使用[1])
     * @param couponOrderParam
     * @return
     * @author wzw
     */
    boolean checkEnvelopeIsUse(CouponOrderParam couponOrderParam);

    /**
     * 砍价发送红包
     * @param couponOrderParam
     * @return
     * @author wzw
     */
    boolean sendEnvelope(CouponOrderParam couponOrderParam);
}
